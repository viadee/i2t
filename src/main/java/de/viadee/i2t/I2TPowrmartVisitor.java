package de.viadee.i2t;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleDirectedGraph;
import org.springframework.beans.factory.annotation.Required;

import talendfile.ConnectionType;
import talendfile.ElementParameterType;
import talendfile.NodeType;
import talendfile.ProcessType;

import Powrmart.CONNECTORType;
import Powrmart.INSTANCEType;
import Powrmart.MAPPINGType;
import Powrmart.NULLABLEType1;
import Powrmart.NULLABLEType;
import Powrmart.SOURCEFIELDType;
import Powrmart.SOURCEType;
import Powrmart.TARGETType;
import Powrmart.TARGETFIELDType;
import Powrmart.TRANSFORMATIONType;
import Powrmart.util.PowrmartSwitch;
import de.viadee.i2t.datatypes.*;
import de.viadee.i2t.interfaces.I2TFlowRegistry;
import de.viadee.i2t.interfaces.I2TGraphBuilder;
import de.viadee.i2t.interfaces.I2TGraphLayoutOptimization;
import de.viadee.i2t.interfaces.I2TInformaticaTransformation;
import de.viadee.i2t.interfaces.I2TMetadataRegistry;
import de.viadee.i2t.interfaces.I2TTalendDocument;

/**
 * Second step of transformation
 * Receives an adapted Informatica strucutre,
 * builds up a graph of the etl process using the graphBuilder,
 * registers the edges of the graph to the flowRegistry,
 * and calls the transformation subclasses for those elements it has found.
 * @author GrS 02.11.2011
 */
public class I2TPowrmartVisitor<T> extends PowrmartSwitch<T>{

    static Logger logger = Logger.getLogger(I2TPowrmartVisitor.class);
  
    /** 
     * map of known transformation
     * has to be set via spring application context
     */
    private Map <String, I2TInformaticaTransformation> registerdTransformations;
    /**
     * graph dependency injected via spring
     */
    private I2TGraphBuilder graphBuilder;
    /**
     * graph layout optimization dependency via spring
     */
    private I2TGraphLayoutOptimization graphLayoutOptimization;
    /**
     * flow dependency injected via spring
     */
    private I2TFlowRegistry flowRegistry;
    /**
     * meta data registry injected via spring
     */
    private I2TMetadataRegistry metadataRegistry;
    /**
     * Talend document injected via spring, required to add elements to the target model
     */
    private I2TTalendDocument talendDocument;
    /**
     * Count occurrences of transformation, source and target elements
     */
    private HashMap<String,Integer> informaticaTransformationTypeCounter = new HashMap<String, Integer>();
    
    private int sourceTypeCounter = 0;
    private int targetTypeCounter = 0;
    
    /**
     * properties config object
     */
    private Properties config;
    /**
     * HashMap for database configuration
     */
    private HashMap<String,String> dbOptions;

     /**
      * set properties object
      * @author GrS 10.11.2011 Comment method "setConfig".
      * @param config   - Properties object
      */
     public void setConfig(Properties config) {
         this.config = config;
         
         dbOptions = new HashMap<String,String>();
         dbOptions.put("HOST", this.config.getProperty("i2t.db.host"));
         dbOptions.put("PORT", this.config.getProperty("i2t.db.port"));
         dbOptions.put("DB_SCHEMA", this.config.getProperty("i2t.db.db_schema"));
         dbOptions.put("DBNAME", this.config.getProperty("i2t.db.dbname"));
         dbOptions.put("USER", this.config.getProperty("i2t.db.user"));
         dbOptions.put("PASS", this.config.getProperty("i2t.db.pass"));
         dbOptions.put("GUESS_SCHEMA", this.config.getProperty("i2t.db.guess_schema"));
         dbOptions.put("PROPERTIES", this.config.getProperty("i2t.db.properties"));
     }
     
     /**
      * Increment counter for transformation type
      * @author GrS 17.11.2011 Comment method "countTransformation".
      * @param transformationType   - Name of transformation type
      */
     public void countTransformation(String transformationType){
         if(informaticaTransformationTypeCounter.containsKey(transformationType)){
             Integer counter = informaticaTransformationTypeCounter.get(transformationType);
             informaticaTransformationTypeCounter.put(transformationType, ++counter);
         }
         else{
             informaticaTransformationTypeCounter.put(transformationType, new Integer(1));
         }
     }
     
     /**
      * Print results of transformation type counter
      * @author GrS 17.11.2011 Comment method "printTranformationTypeCounter".
      */
     public void printTranformationTypeCounter(){
         logger.info("Transformation Report:");
         for(Map.Entry<String, Integer> entry : informaticaTransformationTypeCounter.entrySet()){
             logger.info(entry.getValue()+" "+entry.getKey()+"s processed");
         }
     }
     
     /**
      * retrieves current Talend document structure
      * @author GrS 08.11.2011 Comment method "getDocument".
      * @return
      */
     public ProcessType getDocument(){
         
         //position input and output node elements
         for(NodeType node : talendDocument.getDocument().getNode()){
             if(node.getComponentName().equals("tMSSqlInput") || node.getComponentName().equals("tMSSqlOutput")){
                 for(ElementParameterType elementParameter : node.getElementParameter()){
                     if(elementParameter.getName().equals("UNIQUE_NAME")){
                         String uniqueName = elementParameter.getValue().toString();
                         Point coordinates = graphLayoutOptimization.getCoordinates(uniqueName);
                         node.setPosX((int)coordinates.getX());
                         node.setPosY((int)coordinates.getY());
                     }
                 }
             }
         }
         return talendDocument.getDocument();
     }

     /**
      * setter for Talend document
      * @author GrS 16.11.2011 Comment method "setTalendDocument".
      * @param talendDocument   - I2TTalendDocument dependency
      */
     @Required
     public void setTalendDocument(I2TTalendDocument talendDocument) {
         this.talendDocument = talendDocument;
     }
     
     /**
      * setter for meta data registry dependency
      * @author GrS 08.11.2011 Comment method "setMetadataRegistry".
      * @param metadataRegistry - I2TMetadataRegistry dependency
      */
     @Required
     public void setMetadataRegistry(I2TMetadataRegistry metadataRegistry) {
         this.metadataRegistry = metadataRegistry;
     }
     
     /**
      * setter for registered transformations dependency
      * @author GrS 08.11.2011 Comment method "setRegisterdTransformations".
      * @param registerdTransformations - Map<String, I2TInformaticaTransformation> of transformations
      */
    @Required
    public void setRegisterdTransformations(Map<String, I2TInformaticaTransformation> registerdTransformations) {
        this.registerdTransformations = registerdTransformations;
    }

    /**
     * setter for graph build dependency
     * @author GrS 08.11.2011 Comment method "setGraphBuilder".
     * @param graphBuilder  - I2TGraphBuilder dependency
     */
    @Required
    public void setGraphBuilder(I2TGraphBuilder graphBuilder) {
        this.graphBuilder = graphBuilder;
    }

    /**
     * setter for graph layout optimziation dependency
     * @author GrS 02.12.2011 Comment method "setGraphLayoutOptimization".
     * @param graphLayoutOptimization
     */
    public void setGraphLayoutOptimization(I2TGraphLayoutOptimization graphLayoutOptimization) {
        this.graphLayoutOptimization = graphLayoutOptimization;
    }
    
    /**
     * getter for graph layout optimziation dependency
     * @author GrS 02.12.2011 Comment method "getGraphLayoutOptimization".
     * @return
     */
    public I2TGraphLayoutOptimization getGraphLayoutOptimization() {
        return graphLayoutOptimization;
    }
    
    /**
     * setter for flow registry dependency
     * @author GrS 08.11.2011 Comment method "setFlowRegistry".
     * @param flowRegistry  - I2TFlowRegistry dependency
     */
    @Required
    public void setFlowRegistry(I2TFlowRegistry flowRegistry) {
        this.flowRegistry = flowRegistry;
    }
    
    /**
     * process mapping node of Informatica structure
     * mapping nodes contain transformations, transformation instances and connectors
     */
    @Override
    public T caseMAPPINGType(MAPPINGType object) {
        logger.info("processing <MAPPING> "+object.getNAME().toString());
        
        //build graph from instances and connectors
        graphBuilder.setMAPPINGTypeObject(object);
        SimpleDirectedGraph<Object, DefaultEdge> graph = graphBuilder.getGraph();
        
        //detect concurrent data flows
        graphBuilder.detectedConcurrentFlows();
        
        //create connection type elements
        for(DefaultEdge e: graph.edgeSet()){
            //get source and target instances
            INSTANCEType sourceInstance = (INSTANCEType)graph.getEdgeSource(e);
            INSTANCEType targetInstance = (INSTANCEType)graph.getEdgeTarget(e);
            
            //lookup data flow by edge
            TFlowInfo flowInfo = flowRegistry.getFlow(e);
            if(flowInfo != null){
                LinkedList<String> columns = flowInfo.getColumns();
                String uniqueName = flowInfo.getName();
                String metaName = sourceInstance.getTRANSFORMATIONNAME().toString();
                
                //create Talend connection
                ConnectionType connection = I2TTalendFactory.createConnection(uniqueName, metaName ,sourceInstance.getNAME().toString(), targetInstance.getNAME().toString(), columns);
                //add connection to graph optimization
                graphLayoutOptimization.addEdge(uniqueName, sourceInstance.getNAME().toString(), targetInstance.getNAME().toString());
                //add it to Talend document
                talendDocument.addConnectionElement(connection);
            }
        }
        
        //process transformation type elements
        for(TRANSFORMATIONType transformation : object.getTRANSFORMATION()){
            
            //remove white spaces
            String transformationType = transformation.getTYPE().toString().replace(" ", "");
            String transformationName = transformation.getNAME().toString();
            ArrayList<CONNECTORType> connectors = new ArrayList<CONNECTORType>();
            
            logger.info("processing <TRANSFORMATION> type: "+transformationType+" name: "+transformationName);
            
            //find incoming and outgoing connectors
            for(CONNECTORType connector : object.getCONNECTOR()){
                if(connector.getFROMINSTANCE().toString().equals(transformationName) ||
                   connector.getTOINSTANCE().toString().equals(transformationName)){
                    connectors.add(connector);
                }
            }
            
            //delegate processing of transformation type
            NodeType output = null;
            I2TInformaticaTransformation informaticaTransformation = registerdTransformations.get(transformationType.toUpperCase());
            if (informaticaTransformation == null){
                logger.error("Unknown Informatica transformation type: "+transformationType);
            } 
            else{               
                countTransformation(transformationType);
                
                //set incoming and outgoing connectors
                informaticaTransformation.setConnectorTypeObjects(connectors);
                //set transformation type object
                informaticaTransformation.setTransformationTypeObject(transformation);
                //execute transformation
                output = informaticaTransformation.transform();
                //add transformed output to Talend document
                talendDocument.addNodeElement(output);
            }
        }
        return null;
    }
    
    /**
     * process target nodes of Informatica structure
     * targets contain schema information about target (database) tables
     * Limitations: 
     * <li>only MS Sql Server targets are processed</li>
     */
    @Override
    public T caseTARGETType(TARGETType object) {
        
        //process MS SQL database targets
        String tableName = object.getNAME().toString();
        String databaseType = object.getDATABASETYPE().toString();
        
        if(databaseType.equals("Microsoft SQL Server")){
            countTransformation("Microsoft SQL Server Target");
            String uniqueName = "tMSSqlOutput_"+sourceTypeCounter;
            uniqueName = tableName;
            
            logger.info("processing <TARGET> "+object.getDATABASETYPE().toString()+": "+tableName);
            targetTypeCounter++;
            
            //parse source table columns
            LinkedHashMap<String,TColumnInfo> columns = new LinkedHashMap<String,TColumnInfo>();
            for(TARGETFIELDType tf : object.getTARGETFIELD()){
                String columnName = tf.getNAME().toString();
                String datatype = tf.getDATATYPE().toString().toUpperCase();
                String type = "";
                String pattern = "";
                int length = Integer.parseInt((String)tf.getPRECISION());
                int precision = Integer.parseInt((String)tf.getSCALE());
                
                //handle different MSSQL datatypes
                switch(MSSQLDatatypes.valueOf(datatype)){
                case BIT:
                    type = "id_Boolean";
                    length = 1;
                    break;
                case TINYINT:
                case SMALLINT:
                    type = "id_Short";
                    break;
                case INT:
                    type = "id_Integer";
                    break;
                case BIGINT:
                    type = "id_Long";
                    break;
                case DECIMAL:
                    type = "id_BigDecimal";
                    break;
                case FLOAT:
                    type = "id_Double";
                    break;
                case MONEY:
                    type = "id_BigDecimal";
                    datatype = "DECIMAL";
                    break;
                case REAL:
                    type = "id_Float";
                case DATETIME:
                case TIMESTAMP:
                    type = "id_Date";
                    pattern = "\"dd-MM-yyyy\"";
                    break;
                case CHAR:
                case VARCHAR:
                case NVARCHAR:
                    type = "id_String";
                    break;
                case TEXT:
                    type = "id_String";
                    length = 2147483647;
                    break;
                default:
                    logger.error("Unknown MSSQL Datatype");
                    break;
                }
                
                //build column info object
                TColumnInfo ci = new TColumnInfo();
                ci.setKey(tf.getKEYTYPE().toString().contains("PRIMARY KEY"));
                ci.setLength(length);
                ci.setName(columnName);
                ci.setPrecision(precision);
                ci.setPattern(pattern);
                ci.setNullable((tf.getNULLABLE() == NULLABLEType.NOTNULL));
                ci.setType(type);
                ci.setSourceType(datatype);
                
                columns.put(columnName, ci);
            }
            //add column infos to meta data registry
            metadataRegistry.setTableInfo(tableName, new TTableInfo(tableName, columns));
            
            //add node tMSSqlInput
            NodeType nodeMsSqlOutput = I2TTalendFactory.createMSSqlOutputComponent(uniqueName, tableName, 900, 100+sourceTypeCounter*100, dbOptions, columns);
            
            //add node to Talend document
            talendDocument.addNodeElement(nodeMsSqlOutput);
        }
        else{
            logger.error("Currently only MS-SQL Server targets are transformed, found: "+databaseType+" at table "+tableName);
        }
        return null;
    }
    
    /**
     * process source nodes of Informatica structure
     * sources contain schema information about source (database) tables
     * Limitations: 
     * <li>only MS Sql Server sources are processed</li>
     */
    @Override
    public T caseSOURCEType(SOURCEType object){

        String tableName = object.getNAME().toString();
        String databaseType = object.getDATABASETYPE().toString();
        
        //process MS SQL database sources
        if(databaseType.equals("Microsoft SQL Server")){
            countTransformation("Microsoft SQL Server Source");
            String uniqueName = "tMSSqlInput_"+sourceTypeCounter;
            uniqueName = tableName;
            logger.info("processing <SOURCE> "+object.getDATABASETYPE().toString()+": "+tableName);
            sourceTypeCounter++;
            
            //start building source SQL query string
            StringBuilder queryString = new StringBuilder();
            queryString.append("SELECT ");
            
            //parse source table columns
            LinkedHashMap<String,TColumnInfo> columns = new LinkedHashMap<String,TColumnInfo>();
            for(SOURCEFIELDType sf : object.getSOURCEFIELD()){
                String columnName = sf.getNAME().toString();
                String datatype = sf.getDATATYPE().toString().toUpperCase();
                String type = "";
                int length = 0;
                int precision = 0;
                String pattern = "";
                
                //handle different data types
                switch(MSSQLDatatypes.valueOf(datatype)){
                case BIT:
                    type = "id_Boolean";
                    length = 1;
                    break;
                case TINYINT:
                    type = "id_Short";
                    length = Integer.parseInt((String)sf.getPHYSICALLENGTH());
                    break;
                case SMALLINT:
                    type = "id_Short";
                    length = Integer.parseInt((String)sf.getPHYSICALLENGTH());
                    break;
                case INT:
                    type = "id_Integer";
                    length = Integer.parseInt((String)sf.getPHYSICALLENGTH());
                    break;
                case BIGINT:
                    type = "id_Long";
                    length = Integer.parseInt((String)sf.getPHYSICALLENGTH());
                    break;
                case DECIMAL:
                    type = "id_BigDecimal";
                    length = Integer.parseInt((String)sf.getPHYSICALLENGTH());
                    precision = Integer.parseInt((String)sf.getSCALE());
                    break;
                case FLOAT:
                    type = "id_Double";
                    length = Integer.parseInt((String)sf.getPHYSICALLENGTH());
                    precision = Integer.parseInt((String)sf.getSCALE());
                    break;
                case MONEY:
                    type = "id_BigDecimal";
                    length = Integer.parseInt((String)sf.getPHYSICALLENGTH());
                    precision = Integer.parseInt((String)sf.getSCALE());
                    datatype = "DECIMAL";
                    break;
                case REAL:
                    type = "id_Float";
                    length = Integer.parseInt((String)sf.getLENGTH());
                    precision = Integer.parseInt((String)sf.getSCALE());
                case DATETIME:
                    type = "id_Date";
                    length = Integer.parseInt((String)sf.getPRECISION());
                    precision = Integer.parseInt((String)sf.getSCALE());
                    pattern = "\"dd-MM-yyyy\"";
                    break;
                case TIMESTAMP:
                    type = "id_Date";
                    length = Integer.parseInt((String)sf.getPRECISION());
                    precision = Integer.parseInt((String)sf.getSCALE());
                    pattern = "\"dd-MM-yyyy\"";
                    break;
                case CHAR:
                    type = "id_String";
                    length = Integer.parseInt((String)sf.getPHYSICALLENGTH());
                    break;
                case VARCHAR:
                case NVARCHAR:
                    type = "id_String";
                    length = Integer.parseInt((String)sf.getPHYSICALLENGTH());
                    break;
                case TEXT:
                    type = "id_String";
                    length = Integer.parseInt((String)sf.getPHYSICALLENGTH());
                    break;
                default:
                    logger.error("Unknown Informatica Datatype");
                    break;
                }
                
                //build column info object
                TColumnInfo ci = new TColumnInfo();
                ci.setKey((sf.getKEYTYPE() == "PRIMARY KEY"));
                ci.setLength(length);
                ci.setName(columnName);
                ci.setPrecision(precision);
                ci.setPattern(pattern);
                ci.setNullable((sf.getNULLABLE() == NULLABLEType1.NOTNULL));
                ci.setType(type);
                ci.setSourceType(datatype);
                
                //build SQL query string
                queryString.append(tableName.toUpperCase());
                queryString.append(".");
                queryString.append(columnName.toUpperCase());
                queryString.append(", ");
                
                columns.put(columnName, ci);
            }
            String query = queryString.substring(0, queryString.length()-2)+" FROM "+tableName;

            //add column infos to meta data registry
            metadataRegistry.setTableInfo(tableName, new TTableInfo(tableName, columns));
            
            //add node tMSSqlInput
            NodeType nodeMsSqlInput = I2TTalendFactory.createMSSqlInputComponent(uniqueName, tableName, query, 100, 100+sourceTypeCounter*100, dbOptions, columns);
            
            //add node to Talend document
            talendDocument.addNodeElement(nodeMsSqlInput);
        }
        else{
            logger.error("Currently only MS-SQL Server sources are transformed, found: "+databaseType+" at table "+tableName);
        }
        return null;
    }
    
}
