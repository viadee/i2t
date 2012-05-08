package de.viadee.i2t.preprocessors;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.util.EcoreUtil;

import Powrmart.CONNECTORType;
import Powrmart.FOLDERType;
import Powrmart.INSTANCEType;
import Powrmart.MAPPINGType;
import Powrmart.TABLEATTRIBUTEType;
import Powrmart.TARGETFIELDType;
import Powrmart.TARGETType;
import Powrmart.TRANSFORMATIONType;
import Powrmart.TRANSFORMFIELDType;
import Powrmart.TYPEType5;
import de.viadee.i2t.I2TPowrmartFactory;
import de.viadee.i2t.I2TUtil;
import de.viadee.i2t.interfaces.I2TInformaticaPreprocessor;

/**
 * Talend provides no separate components to generate a sequence
 * Therefore the sequence generator transformation is removed and replaced by a expression transformation with the expression 
 * -- SEQUENCE TRANSFORMATION [int start]:[int increment]
 * This expression is parsed in I2TExpressionTransformation and replaced by: sequence("s[x]",start,increment);
 * @author GrS 10.11.2011
 */
public class I2TSequencePreprocessor extends I2TAbstractInformaticaPreprocessor implements I2TInformaticaPreprocessor {

    static Logger logger = Logger.getLogger(I2TSequencePreprocessor.class);
    private FOLDERType object;
    private MAPPINGType mapping;
    private String mappingName;
    private String sequenceTransformationName;
    private HashMap<String,HashSet<String>> connectedTransformations;
    private HashSet<String> fields;
    
    private void init(){
        mapping = (MAPPINGType)object.getMAPPING().get(0);
        mappingName = object.getNAME().toString();
    }
    
    public FOLDERType process(FOLDERType object) {
        this.object = object;
        init();

        logger.info("searching for sequence transformations");
        
        if(mapping == null){
            logger.error("No mapping found at "+mappingName);
        }
        else
        {
            LinkedList<TRANSFORMATIONType> sequenceTransformations = new LinkedList<TRANSFORMATIONType>(mapping.getTRANSFORMATION());
            for(TRANSFORMATIONType sequenceTransformation : sequenceTransformations){
                //filter only sequence transformations
                if(sequenceTransformation.getTYPE().toString().equals("Sequence")){
                    sequenceTransformationName = sequenceTransformation.getNAME().toString();
                    connectedTransformations = new HashMap<String, HashSet<String>>(); 
                    logger.info("found sequence transformation: "+sequenceTransformationName);
                    //get connected transformations for CURVAL and NEXTVAL
                    getConnectedTransformations();
                    
                    //prepend expression transformation to target transformation type of sequence transformation and change connectors
                    boolean worked = prependExpressionToTransformation(sequenceTransformation);
                    //prepend expression transformation to target type of sequence and change connectors
                    if(worked == false){
                        prependExpressionToTarget(sequenceTransformation);
                    }
                    //remove old sequence transformation
                    mapping.getTRANSFORMATION().remove(sequenceTransformation);
                    
                    //remove old sequence transformation instance
                    for(INSTANCEType instance : new LinkedList<INSTANCEType>(mapping.getINSTANCE())){
                        if(instance.getNAME().equals(sequenceTransformationName)){
                            mapping.getINSTANCE().remove(instance);
                        }
                    }
                    
                    logger.debug("finished working on "+sequenceTransformationName);
                }
            }
        }
        return object;
    }
    
    /**
     * Get connected transformations for CURVAL and NEXTVAL
     * @author GrS 18.11.2011 Comment method "getConnectedTransformations".
     */
    private void getConnectedTransformations(){
        for(CONNECTORType connector : mapping.getCONNECTOR()){
            if(connector.getFROMINSTANCE().toString().equals(sequenceTransformationName)
                    && connector.getFROMINSTANCETYPE().toString().equals("Sequence")
                    && (    connector.getFROMFIELD().toString().equals("NEXTVAL") ||
                            connector.getFROMFIELD().toString().equals("CURVAL"))){
                String instanceName = connector.getTOINSTANCE().toString();
                String field = connector.getFROMFIELD().toString()+"#"+connector.getTOFIELD().toString();
                logger.info("added "+instanceName+"."+field+" to list of sequence target transformations");
                if(connectedTransformations.containsKey(instanceName)){
                    connectedTransformations.get(instanceName).add(field);
                }
                else{
                    fields = new HashSet<String>();
                    fields.add(field);
                    connectedTransformations.put(instanceName, fields);
                }
            }
        }
    }
    
    /**
     * Prepend expression transformation to target type of sequence and change connectors
     * @author GrS 18.11.2011 Comment method "prependExpressionToTarget".
     * @param sequenceTransformation - TRANSFORMATIONType object of sequence
     * @return
     */
    private boolean prependExpressionToTarget(TRANSFORMATIONType sequenceTransformation){
        boolean worked = false;
        for(Map.Entry<String, HashSet<String>> entry : connectedTransformations.entrySet()){
            for(TARGETType sequenceTarget : new LinkedList<TARGETType>(object.getTARGET())){
                String sequenceTargetName = sequenceTarget.getNAME().toString();
                if(sequenceTargetName.equals(entry.getKey())){
                    logger.info("working on sequence target: "+sequenceTargetName);
                    //insert a transformation for each NEXTVAL and CURVAL connection
                    for(String connectedSequenceField : entry.getValue()){
                        String sequenceFromFieldName = null;
                        String sequenceToFieldName = null;
                        String[] sequenceConnectors = connectedSequenceField.split("#");
                        if(!sequenceConnectors[0].equals("NEXTVAL") && !sequenceConnectors[0].equals("CURVAL")){
                            logger.fatal("CURVAL or NEXTVAL of Sequence not found");
                        }
                        else{
                            sequenceFromFieldName = sequenceConnectors[0];
                            sequenceToFieldName = sequenceConnectors[1];
                            logger.info("working on field: "+sequenceFromFieldName+" connected to "+sequenceConnectors[1]);
                        }
                        
                        //create new expression transformation
                        String newExpressionTransformationName = "EXP_"+sequenceTransformationName;
                        TRANSFORMATIONType newExpressionTransformation = I2TPowrmartFactory.createTransformationType(newExpressionTransformationName, "Expression", "Expresssion transformation for sequence");
                        mapping.getTRANSFORMATION().add(newExpressionTransformation);
                        
                        //create new expression transformation instance
                        INSTANCEType newExpressionTransformationInstance = I2TPowrmartFactory.createInstanceType(newExpressionTransformationName, "Expression", TYPEType5.TRANSFORMATION, "");
                        mapping.getINSTANCE().add(newExpressionTransformationInstance);
                        
                        logger.info("created new expression transformation and expression transformation instance: "+newExpressionTransformationName);
                        
                        LinkedList<CONNECTORType> connectors = new LinkedList<CONNECTORType>(mapping.getCONNECTOR());
                        for(CONNECTORType connector : connectors){
                            
                            //remove connector from old sequence transformation instance
                            if(connector.getFROMFIELD().equals(sequenceFromFieldName) //CURVAL or NEXTVAL
                                    && connector.getFROMINSTANCE().equals(sequenceTransformationName)
                                    && connector.getFROMINSTANCETYPE().equals("Sequence")){
                                mapping.getCONNECTOR().remove(connector);
                                logger.info("removed old connector from sequence transformation to target of sequence transforamtion: "+connector);
                            }
                            
                            //foreach incoming connectors of old target
                            if(connector.getTOINSTANCE().equals(sequenceTargetName)){
                                
                                //  add connector from new expression to old target
                                CONNECTORType newOutgoingExpressionConnector = (CONNECTORType) EcoreUtil.copy(connector);
                                newOutgoingExpressionConnector.setFROMINSTANCE(newExpressionTransformationName);
                                newOutgoingExpressionConnector.setFROMINSTANCETYPE("Expression");
                                mapping.getCONNECTOR().add(newOutgoingExpressionConnector);
                                
                                //  add connector from old source to new expression
                                if(!connector.getFROMFIELD().equals("NEXTVAL") && !connector.getFROMFIELD().equals("CURVAL")){
                                    CONNECTORType newIncomingExpressionConnector = (CONNECTORType) EcoreUtil.copy(connector);
                                    newIncomingExpressionConnector.setTOINSTANCE(newExpressionTransformationName);
                                    newIncomingExpressionConnector.setTOINSTANCETYPE("Expression");
                                    mapping.getCONNECTOR().add(newIncomingExpressionConnector);
                                    logger.info("created new connector from old source to new expression: "+newIncomingExpressionConnector);
                                }
                                else{
                                    newOutgoingExpressionConnector.setFROMFIELD(newOutgoingExpressionConnector.getTOFIELD());
                                }
                                logger.info("created new connector from expression to old target: "+newOutgoingExpressionConnector);
                                
                                
                                //  remove incoming connectors of old target
                                mapping.getCONNECTOR().remove(connector);
                                logger.info("removed old incoming connectors of old target: "+connector);
                            }
                        }
                        //add all fields from target of sequence to the new expression transformation
                        for(TARGETFIELDType targetField : sequenceTarget.getTARGETFIELD()){
                            TRANSFORMFIELDType newField = pf.createTRANSFORMFIELDType();
                            newField.setDATATYPE(I2TUtil.getIDatatypeFromMSSqlSource(targetField.getDATATYPE().toString()));
                            newField.setDEFAULTVALUE("");
                            newField.setDESCRIPTION(targetField.getDESCRIPTION());
                            newField.setNAME(targetField.getNAME());
                            newField.setPICTURETEXT(targetField.getPICTURETEXT());
                            newField.setPORTTYPE("INPUT/OUTPUT");
                            newField.setPRECISION(targetField.getPRECISION());
                            newField.setSCALE(targetField.getSCALE());
                            newField.setEXPRESSION(targetField.getNAME().toString());
                            newExpressionTransformation.getTRANSFORMFIELD().add(newField);
                        }
                        
                        //change sequence field at new expression transformation and set expression
                        for(TRANSFORMFIELDType field : newExpressionTransformation.getTRANSFORMFIELD()){
                            if(field.getNAME().equals(sequenceToFieldName)){
                                String startValue = "1";
                                String incrementValue = "1";
                                for(TABLEATTRIBUTEType tableAttribute : sequenceTransformation.getTABLEATTRIBUTE()){
                                    if(tableAttribute.getNAME().equals("Start Value")){
                                        startValue = tableAttribute.getVALUE().toString();
                                    }
                                    else if(tableAttribute.getNAME().equals("Increment By")){
                                        incrementValue = tableAttribute.getVALUE().toString();
                                    }
                                }
                                field.setEXPRESSION("-- SEQUENCE TRANSFORMATION "+startValue+":"+incrementValue+" "+sequenceFromFieldName);
                            }
                        }
                        
                        
                        logger.debug("finished working on "+sequenceFromFieldName+" connected to "+sequenceToFieldName);
                        
                        worked = true;
                    }
                }
            }
        }
        return worked;
    }
    
    /**
     * Prepend expression transformation to target transformation type of sequence transformation and change connectors
     * @author GrS 18.11.2011 Comment method "prependExpressionToTransformation".
     * @param sequenceTransformation
     * @return
     */
    private boolean prependExpressionToTransformation(TRANSFORMATIONType sequenceTransformation){
        boolean worked = false;
        for(Map.Entry<String, HashSet<String>> entry : connectedTransformations.entrySet()){
            for(TRANSFORMATIONType sequenceTargetTransformation : new LinkedList<TRANSFORMATIONType>(mapping.getTRANSFORMATION())){
                String sequenceTargetTransformationName = sequenceTargetTransformation.getNAME().toString();
                if(sequenceTargetTransformationName.equals(entry.getKey())){
                    logger.info("working on sequence target transformation: "+sequenceTargetTransformationName);
                    //insert a transformation for each NEXTVAL and CURVAL connection
                    for(String connectedSequenceField : entry.getValue()){
                        String sequenceFromFieldName = null;
                        String sequenceToFieldName = null;
                        String[] sequenceConnectors = connectedSequenceField.split("#");
                        if(!sequenceConnectors[0].equals("NEXTVAL") && !sequenceConnectors[0].equals("CURVAL")){
                            logger.fatal("CURVAL or NEXTVAL of Sequence not found");
                        }
                        else{
                            sequenceFromFieldName = sequenceConnectors[0];
                            sequenceToFieldName = sequenceConnectors[1];
                            logger.info("working on field: "+sequenceFromFieldName+" connected to "+sequenceConnectors[1]);
                        }
                        
                        //create new expression transformation
                        String newExpressionTransformationName = "EXP_"+sequenceTransformationName;
                        TRANSFORMATIONType newExpressionTransformation = I2TPowrmartFactory.createTransformationType(newExpressionTransformationName, "Expression", "Expresssion transformation for sequence");
                        mapping.getTRANSFORMATION().add(newExpressionTransformation);
                        
                        //create new expression transformation instance
                        INSTANCEType newExpressionTransformationInstance = I2TPowrmartFactory.createInstanceType(newExpressionTransformationName, "Expression", TYPEType5.TRANSFORMATION, "");
                        mapping.getINSTANCE().add(newExpressionTransformationInstance);
                        
                        logger.info("created new expression transformation and expression transformation instance: "+newExpressionTransformationName);
                        
                        LinkedList<CONNECTORType> connectors = new LinkedList<CONNECTORType>(mapping.getCONNECTOR());
                        for(CONNECTORType connector : connectors){
                            
                            //remove connector from old sequence transformation instance
                            if(connector.getFROMFIELD().equals(sequenceFromFieldName) //CURVAL or NEXTVAL
                                    && connector.getFROMINSTANCE().equals(sequenceTransformationName)
                                    && connector.getFROMINSTANCETYPE().equals("Sequence")){
                                mapping.getCONNECTOR().remove(connector);
                                logger.info("removed old connector from sequence transformation to target of sequence transforamtion: "+connector);
                            }
                            
                            //foreach incoming connectors of old target
                            if(connector.getTOINSTANCE().equals(sequenceTargetTransformationName)){
                                
                                //  add connector from new expression to old target
                                CONNECTORType newOutgoingExpressionConnector = (CONNECTORType) EcoreUtil.copy(connector);
                                newOutgoingExpressionConnector.setFROMINSTANCE(newExpressionTransformationName);
                                newOutgoingExpressionConnector.setFROMINSTANCETYPE("Expression");
                                mapping.getCONNECTOR().add(newOutgoingExpressionConnector);
                                
                                //  add connector from old source to new expression
                                if(!connector.getFROMFIELD().equals("NEXTVAL") && !connector.getFROMFIELD().equals("CURVAL")){
                                    CONNECTORType newIncomingExpressionConnector = (CONNECTORType) EcoreUtil.copy(connector);
                                    newIncomingExpressionConnector.setTOINSTANCE(newExpressionTransformationName);
                                    newIncomingExpressionConnector.setTOINSTANCETYPE("Expression");
                                    mapping.getCONNECTOR().add(newIncomingExpressionConnector);
                                    logger.info("created new connector from old source to new expression: "+newIncomingExpressionConnector);
                                }
                                else{
                                    newOutgoingExpressionConnector.setFROMFIELD(newOutgoingExpressionConnector.getTOFIELD());
                                }
                                logger.info("created new connector from expression to old target: "+newOutgoingExpressionConnector);
                                
                                
                                //  remove incoming connectors of old target
                                mapping.getCONNECTOR().remove(connector);
                                logger.info("removed old incoming connectors of old target: "+connector);
                            }
                        }
                        //add all fields from target of sequence transformation to the new expression transformation
                        newExpressionTransformation.getTRANSFORMFIELD().addAll(EcoreUtil.copyAll(sequenceTargetTransformation.getTRANSFORMFIELD()));
                        
                        //change sequence field at new expression transformation and set expression
                        for(TRANSFORMFIELDType field : newExpressionTransformation.getTRANSFORMFIELD()){
                            if(field.getNAME().equals(sequenceToFieldName)){
                                String startValue = "1";
                                String incrementValue = "1";
                                for(TABLEATTRIBUTEType tableAttribute : sequenceTransformation.getTABLEATTRIBUTE()){
                                    if(tableAttribute.getNAME().equals("Start Value")){
                                        startValue = tableAttribute.getVALUE().toString();
                                    }
                                    else if(tableAttribute.getNAME().equals("Increment By")){
                                        incrementValue = tableAttribute.getVALUE().toString();
                                    }
                                }
                                field.setEXPRESSION("-- SEQUENCE TRANSFORMATION "+startValue+":"+incrementValue+" "+sequenceFromFieldName);
                            }
                        }
                        
                        
                        logger.info("finished working on "+sequenceFromFieldName+" connected to "+sequenceToFieldName);
                        
                        worked = true;
                    }
                }
            }
        }
        return worked;
    }
}