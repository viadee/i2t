package de.viadee.i2t.transformations;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.jgrapht.graph.DefaultEdge;

import Powrmart.CONNECTORType;
import Powrmart.TABLEATTRIBUTEType;
import Powrmart.TRANSFORMFIELDType;

import de.viadee.i2t.I2TTalendFactory;
import de.viadee.i2t.I2TUtil;
import de.viadee.i2t.datatypes.TColumnInfo;
import de.viadee.i2t.datatypes.TTableInfo;
import de.viadee.i2t.interfaces.I2TInformaticaTransformation;
import talendfile.NodeType;

/**
 * Transform an Informatica filter transformation using Talend's tMap component with expression filter.
 * Known limitations:
 * <li>No expression transformation</li>
 * @author GrS 08.11.2011
 */
public class I2TFilterTransformation extends I2TAbstractInformaticaTransformation implements I2TInformaticaTransformation {

    static Logger logger = Logger.getLogger(I2TFilterTransformation.class);

    public NodeType transform() {
        HashMap<String,String> options = new HashMap<String,String>();
        LinkedHashMap<String,TTableInfo> inputTables = new LinkedHashMap<String,TTableInfo>();
        LinkedHashMap<String,TTableInfo> outputTables = new LinkedHashMap<String,TTableInfo>();
        String uniqueName = object.getNAME().toString();
        String expresssionFilter = "";
        
        //get expression filter
        List<TABLEATTRIBUTEType> tableAttributes = object.getTABLEATTRIBUTE();
        for(TABLEATTRIBUTEType attribute : tableAttributes){
            if(attribute.getNAME().equals("Filter Condition")){
                expresssionFilter = attribute.getVALUE().toString();
            }
        }
        
        //get columns
        LinkedHashMap<String,TColumnInfo> inputColumns = new LinkedHashMap<String,TColumnInfo>();
        LinkedHashMap<String,TColumnInfo> outputColumns = new LinkedHashMap<String,TColumnInfo>();
        for(TRANSFORMFIELDType field : object.getTRANSFORMFIELD()){
            String portType = field.getPORTTYPE().toString().toUpperCase();
            TColumnInfo ci = new TColumnInfo();
            String name = field.getNAME().toString();
            String type = I2TUtil.getTypeFromIDatatype(field.getDATATYPE().toString());
            String sourceType = I2TUtil.getSourceTypeFromIDatatype(field.getDATATYPE().toString());
            
            ci.setName(name);
            ci.setPrecision(Integer.parseInt(field.getSCALE().toString()));
            ci.setLength(Integer.parseInt(field.getPRECISION().toString()));
            //FIXME: nullable should be checked against meta data because Informatica does not provide infos about nullable in the field definition of the transformation
            ci.setNullable(true);
            ci.setSourceType(sourceType);
            ci.setType(type);
            
            if(portType.equals("INPUT") || portType.equals("INPUT/OUTPUT")){
                inputColumns.put(name, ci);
            }
            if(portType.equals("OUTPUT") || portType.equals("INPUT/OUTPUT")){
                outputColumns.put(name, ci);
            }
        }
        
        //get name for input flow
        String inputTableName = getInputFlowName(uniqueName);
        if(inputTableName.equals("")){
            logger.fatal("inputTable name missing for "+uniqueName);
        }
        TTableInfo inputTableInfo = new TTableInfo(inputTableName, inputColumns);
        inputTables.put(inputTableName, inputTableInfo);
        
        //get name for output flow
        String outputTableName = "";
        TTableInfo outputTableInfo = new TTableInfo(outputTableName, outputColumns);
        for(CONNECTORType connector: connectors){
            if(connector.getFROMINSTANCE().toString().equals(uniqueName)){
                DefaultEdge edge = graphBuilder.getEdgeByCONNECTORType(connector);
                outputTableName = flowRegistry.getFlowName(edge);
                for(Map.Entry<String, TColumnInfo> entry : inputTableInfo.getColumns().entrySet()){
                    if(inputTableName!=null){
                        entry.getValue().setExpression(inputTableName+"."+entry.getKey());
                    }
                }
            }
        }
        if(outputTableName.equals("")){
            logger.fatal("outputTable name missing for "+uniqueName);
        }

        //build detection regex
        String regex = "|[0-9]*)(\\s*)(!=|=|<|>|<=|>=|&lt;|&gt;|&lt;=|&gt;=)(\\s*)([0-9]*|";
        String expression = "";
        for(Map.Entry<String, TColumnInfo> entry : inputColumns.entrySet()){
            regex = "|"+entry.getKey()+regex+entry.getKey()+"|";

            //add reference table to expression filter
            if(expresssionFilter.contains(entry.getKey())){
                expression = expresssionFilter.replace(entry.getKey(), inputTableName+"."+entry.getKey());
            }
        }
        regex = "("+regex.substring(1,regex.length()-1)+")";
//        logger.debug(regex);
//        logger.debug(expresssionFilter);
        if(expresssionFilter.matches(regex)){
            logger.info("Set expression filter to "+expression);
            
        }
        else{
            logger.warn("Expression filter could not be converted, it is now commented: "+expresssionFilter);
            expression = "\\\\"+expresssionFilter;
        }
        outputTableInfo.setExpressionFilter(expression);

        outputTableInfo.setName(outputTableName);
        outputTables.put(outputTableName, outputTableInfo);

        //comment
        if(object.getDESCRIPTION()!= null){
            options.put("COMMENT", object.getDESCRIPTION().toString());
        }
        
        //position
        int posX = (int)getNewCoordinates(uniqueName).getX();
        int posY = (int)getNewCoordinates(uniqueName).getY();
        counter++;
        
        //create tMap component
        NodeType output = I2TTalendFactory.createTMapComponent(uniqueName, posX, posY, options, inputTables, outputTables);
        return output;
    }

}
