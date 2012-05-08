package de.viadee.i2t.transformations;

import java.awt.Point;
import java.util.List;
import java.util.Set;

import org.jgrapht.graph.DefaultEdge;
import org.springframework.beans.factory.annotation.Required;

import de.viadee.i2t.I2TPreprocessorVisitor;
import de.viadee.i2t.I2TUtil;
import de.viadee.i2t.datatypes.TColumnInfo;
import de.viadee.i2t.interfaces.I2TFlowRegistry;
import de.viadee.i2t.interfaces.I2TGraphBuilder;
import de.viadee.i2t.interfaces.I2TGraphLayoutOptimization;
import de.viadee.i2t.interfaces.I2TInformaticaPreprocessor;
import de.viadee.i2t.interfaces.I2TTalendDocument;

import Powrmart.CONNECTORType;
import Powrmart.NULLABLEType;
import Powrmart.TRANSFORMATIONType;
import Powrmart.TRANSFORMFIELDType;

/**
 * Abstract super class for all transformations of Informatica transformation types.
 * Requires setting of transformation type object and list of incoming and outgoing connector type objects.
 * @author GrS 18.10.2011
 */
public abstract class I2TAbstractInformaticaTransformation{
    
    /**
     * List of incoming and outgoing connectors of transformation, required for work
     */
    protected List<CONNECTORType> connectors;
    /**
     * The transformation EMF object itself, required for work
     */
    protected TRANSFORMATIONType object;
    /**
     * graphBuilder dependency
     */
    protected I2TGraphBuilder graphBuilder;
    /**
     * graph layout optimization dependency
     */
    private I2TGraphLayoutOptimization graphLayoutOptimization;
    /**
     * flow registry dependency
     */
    protected I2TFlowRegistry flowRegistry;
    /**
     * talend Document dependency
     */
    protected I2TTalendDocument talendDocument;
    /**
     * preprocessor visitor dependency
     */
    @SuppressWarnings("unchecked")
    protected I2TPreprocessorVisitor preprocessorVisitor;
    /**
     * set of registered preprocessors, managable via spring
     */
    protected Set<I2TInformaticaPreprocessor> registeredPreprocessors;

    protected int counter = 0;
    
    /**
     * Setter for I2TPreprocessorVisitor dependency
     * @author GrS 17.11.2011 Comment method "setPreprocessorVisitor".
     * @param preprocessorVisitor
     */
    @SuppressWarnings("unchecked")
    @Required
    public void setPreprocessorVisitor(I2TPreprocessorVisitor preprocessorVisitor) {
        this.preprocessorVisitor = preprocessorVisitor;
    }

    /**
     * Spring init-method: Registers all preprocessors defined in the spring config to the preprocessor visitor
     * @author GrS 02.11.2011 Comment method "initRegisteredPreprocessors".
     */
    public void initRegisteredPreprocessors(){
        if(registeredPreprocessors != null){
            for(I2TInformaticaPreprocessor registeredPreprocessor : registeredPreprocessors){
                preprocessorVisitor.addPreprocessorToExecutionList(registeredPreprocessor);
            }
        }
    }

    /**
     * Setter for registered I2TInformaticaPreprocessor dependencies
     * @author GrS 08.11.2011 Comment method "setRegisteredPreprocessors".
     * @param registeredPreprocessors
     */
    public void setRegisteredPreprocessors(Set<I2TInformaticaPreprocessor> registeredPreprocessors) {
        this.registeredPreprocessors = registeredPreprocessors;
    }

    /**
     * Setter for I2TTalendDocument dependency
     * @author GrS 16.11.2011 Comment method "setTalendDocument".
     * @param talendDocument
     */
    public void setTalendDocument(I2TTalendDocument talendDocument) {
        this.talendDocument = talendDocument;
    }
    
    /**
     * Setter for I2TGraphBuilder dependency
     * @author GrS 08.11.2011 Comment method "setGraphBuilder".
     * @param graphBuilder
     */
    @Required
    public void setGraphBuilder(I2TGraphBuilder graphBuilder) {
        this.graphBuilder = graphBuilder;
    }

    /**
     * Setter for I2TGraphLayoutOptimization dependency
     * @author GrS 02.12.2011 Comment method "setGraphLayoutOptimization".
     * @param graphLayoutOptimization
     */
    @Required
    public void setGraphLayoutOptimization(I2TGraphLayoutOptimization graphLayoutOptimization) {
        this.graphLayoutOptimization = graphLayoutOptimization;
    }

    /**
     * Setter for I2TFlowRegistry dependency
     * @author GrS 08.11.2011 Comment method "setFlowRegistry".
     * @param flowRegistry
     */
    @Required
    public void setFlowRegistry(I2TFlowRegistry flowRegistry) {
        this.flowRegistry = flowRegistry;
    }

    /**
     * Setter for list of incoming and outgoing conenctor type objects,
     * required for proper operation of transformation
     * @author GrS 08.11.2011 Comment method "setConnectorTypeObjects".
     * @param connectors
     */
    public void setConnectorTypeObjects(List<CONNECTORType> connectors) {
        this.connectors = connectors;
    }

    /**
     * Setter for transformation object,
     * required for proper operation of transformation
     * @author GrS 08.11.2011 Comment method "setTransformationTypeObject".
     * @param object
     */
    public void setTransformationTypeObject(TRANSFORMATIONType object) {
        this.object = object;
    }
    
    /**
     * Lookup name of a flow in the registry via its incoming connector
     * @author  GrS 19.10.2011 Comment method "getInputFlowName".
     * @param   uniqueName
     * @return  String
     */
    public String getInputFlowName(String uniqueName){
        String inputTableName = "";
        for(CONNECTORType connector : connectors){
            if(connector.getTOINSTANCE().toString().equals(uniqueName)){
                DefaultEdge edge = graphBuilder.getEdgeByCONNECTORType(connector);
                inputTableName = flowRegistry.getFlowName(edge);
            }
        }
        return inputTableName;
    }
    
    /**
     * Lookup name of a flow in the registry via its outgoing connector
     * @author  GrS 19.10.2011 Comment method "getOutputFlowName".
     * @param   uniqueName
     * @return  String
     */
    public String getOutputFlowName(String uniqueName){
        String outputTableName = "";
        for(CONNECTORType connector : connectors){
            if(connector.getFROMINSTANCE().toString().equals(uniqueName)){
                DefaultEdge edge = graphBuilder.getEdgeByCONNECTORType(connector);
                outputTableName = flowRegistry.getFlowName(edge);
            }
        }
        return outputTableName;
    }

    /**
     * Create a TColumnInfo object representing column informaiton in Talend
     * @author GrS 02.11.2011 Comment method "createColumnInfo".
     * @param   field
     * @return  TColumnInfo
     */
    public TColumnInfo createColumnInfo(TRANSFORMFIELDType field){
        TColumnInfo ci = new TColumnInfo();
        String name = field.getNAME().toString();
        String type = I2TUtil.getTypeFromIDatatype(field.getDATATYPE().toString());
        String sourceType = I2TUtil.getSourceTypeFromIDatatype(field.getDATATYPE().toString());
        
        ci.setName(name);
        ci.setPrecision(Integer.parseInt(field.getSCALE().toString()));
        ci.setLength(Integer.parseInt(field.getPRECISION().toString()));
        if(field.getDATATYPE().toString().toUpperCase().contains("DATE")){
            ci.setPattern("\"dd-MM-yyyy\"");
        }
        //FIXME: nullable should be checked against meta data because Informatica does not provide infos about nullable in the field definition of the transformation
        if(field.getNULLABLE() != null){
            ci.setNullable(field.getNULLABLE() == NULLABLEType.NOTNULL);
        }
        else{
            ci.setNullable(true);
        }
        ci.setSourceType(sourceType);
        ci.setType(type);
        
        return ci;
    }
    
    public Point getNewCoordinates(String nodeName){
        return graphLayoutOptimization.getCoordinates(nodeName);
    }
}
