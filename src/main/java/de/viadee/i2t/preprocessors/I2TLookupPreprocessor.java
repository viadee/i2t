package de.viadee.i2t.preprocessors;

import java.util.ArrayList;
import java.util.LinkedList;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.util.EcoreUtil;

import Powrmart.CONNECTORType;
import Powrmart.FOLDERType;
import Powrmart.INSTANCEType;
import Powrmart.MAPPINGType;
import Powrmart.SOURCEFIELDType;
import Powrmart.SOURCEType;
import Powrmart.TABLEATTRIBUTEType;
import Powrmart.TRANSFORMATIONType;
import Powrmart.TRANSFORMFIELDType;
import Powrmart.TYPEType5;
import de.viadee.i2t.I2TPowrmartFactory;
import de.viadee.i2t.I2TUtil;
import de.viadee.i2t.interfaces.I2TInformaticaPreprocessor;


/**
 * Lookup transformations are migrated to Joiners with Sources in the Informatica structure.
 * Talend Open Studio provides no Lookup
 * @author GrS 02.11.2011
 */
public class I2TLookupPreprocessor extends I2TAbstractInformaticaPreprocessor implements I2TInformaticaPreprocessor {

    static Logger logger = Logger.getLogger(I2TLookupPreprocessor.class);
    
    public FOLDERType process(FOLDERType object) {
        logger.info("searching for Lookup transformations");
        
        MAPPINGType mapping = (MAPPINGType)object.getMAPPING().get(0);
        
        //iterate over separate list
        LinkedList<TRANSFORMATIONType> transformations = new LinkedList<TRANSFORMATIONType>(mapping.getTRANSFORMATION());
        for(TRANSFORMATIONType transformation : transformations){
            
            //only look for lookup transformations
            if(transformation.getTYPE().toString().equals("Lookup Procedure")){

                String transformationName = transformation.getNAME().toString();
                
                logger.info("found lookup transformation: "+transformationName);
                
                //create joiner transformation
                TRANSFORMATIONType joinerTransformation = I2TPowrmartFactory.createTransformationType("JOINER_"+transformationName, "Joiner", transformation.getDESCRIPTION().toString());
                mapping.getTRANSFORMATION().add(joinerTransformation);
                
                //remove old transformation
                mapping.getTRANSFORMATION().remove(transformation);
                logger.debug("removing old transformation: "+transformationName);
                
                //remove old instance
                for(INSTANCEType oldInstance : new LinkedList<INSTANCEType>(mapping.getINSTANCE())){
                    if(oldInstance.getTRANSFORMATIONNAME().toString().equals(transformationName)
                            && oldInstance.getNAME().toString().equals(transformationName)
                            && oldInstance.getTRANSFORMATIONTYPE().toString().equals("Lookup Procedure")
                            && oldInstance.getTYPE().equals(TYPEType5.TRANSFORMATION)){
                        mapping.getINSTANCE().remove(oldInstance);
                        logger.debug("removing old transformation instance: "+oldInstance.getNAME().toString());
                    }
                }
                
                //adapt old connectors from and to instance
                for(CONNECTORType connector : mapping.getCONNECTOR()){
                    if(connector.getFROMINSTANCE().toString().equals(transformationName)
                            && connector.getFROMINSTANCETYPE().equals("Lookup Procedure")){
                        connector.setFROMINSTANCE("JOINER_"+transformationName);
                        connector.setFROMINSTANCETYPE("Joiner");
                        logger.debug("changing from instance of outgoing connector "+connector.getFROMFIELD().toString()+"-"+connector.getTOFIELD().toString()+" from "+transformationName+" to JOINER_"+transformationName);
                    }
                    if(connector.getTOINSTANCE().toString().equals(transformationName)
                               && connector.getTOINSTANCETYPE().equals("Lookup Procedure")){
                        connector.setTOINSTANCE("JOINER_"+transformationName);
                        connector.setTOINSTANCETYPE("Joiner");
                        logger.debug("changing from instance of incoming connector "+connector.getFROMFIELD().toString()+"-"+connector.getTOFIELD().toString()+" from "+transformationName+" to JOINER_"+transformationName);
                    }
                }
                
                String lookupTableName = null;
                LinkedList<TABLEATTRIBUTEType> joinerTableAttributes = new LinkedList<TABLEATTRIBUTEType>();
                
                //check attributes
                for(TABLEATTRIBUTEType tableAttribute : transformation.getTABLEATTRIBUTE()){
                    String name = tableAttribute.getNAME().toString();
                    String value = tableAttribute.getVALUE().toString();
                    if(name.equals("Lookup table name")){
                        lookupTableName = value;
                    }
                    else if(name.equals("Case Sensitive String Comparison")){
                        joinerTableAttributes.add(I2TPowrmartFactory.createTableAttributeType(name, value));
                    }
                    else if(name.equals("Tracing Level")){
                        joinerTableAttributes.add(I2TPowrmartFactory.createTableAttributeType(name, value));
                    }
                    else if(name.equals("Sorted Input")){
                        joinerTableAttributes.add(I2TPowrmartFactory.createTableAttributeType(name, value));
                    }
                    else if(name.equals("Lookup cache directory name")){
                        joinerTableAttributes.add(I2TPowrmartFactory.createTableAttributeType("Cache Directory", value));
                    }
                    else if(name.equals("Lookup condition")){
                        //switch condition parts
                        StringBuffer bf = new StringBuffer();
                        String[] conditionRows = value.split("AND");
                        for(String condition : conditionRows){
                            String[] conditionParts = condition.split("=");
                            bf.append(conditionParts[1]+"="+conditionParts[0]);
                        }
                        joinerTableAttributes.add(I2TPowrmartFactory.createTableAttributeType("Join Condition", bf.toString()));
                    }
                    else if(name.equals("Lookup Data Cache Size")){
                        joinerTableAttributes.add(I2TPowrmartFactory.createTableAttributeType("Joiner Data Cache Size", value));
                    }
                    else if(name.equals("Lookup Index Cache Size")){
                        joinerTableAttributes.add(I2TPowrmartFactory.createTableAttributeType("Joiner Index Cache Size", value));
                    }
                }
                joinerTableAttributes.add(I2TPowrmartFactory.createTableAttributeType("Master Sort Order", "Auto"));
                joinerTableAttributes.add(I2TPowrmartFactory.createTableAttributeType("Transformation Scope", "All Input"));
                joinerTableAttributes.add(I2TPowrmartFactory.createTableAttributeType("Join Type", "Master Outer Join"));
                joinerTableAttributes.add(I2TPowrmartFactory.createTableAttributeType("Null ordering in master", "Null Is Highest Value"));
                joinerTableAttributes.add(I2TPowrmartFactory.createTableAttributeType("Null ordering in detail", "Null Is Highest Value"));
                joinerTransformation.getTABLEATTRIBUTE().addAll(joinerTableAttributes);

                logger.debug("adding JOINER transformation: JOINER_"+transformationName);
                
                //create transformation instance
                INSTANCEType transformationInstance = I2TPowrmartFactory.createInstanceType("JOINER_"+transformationName, "Joiner", TYPEType5.TRANSFORMATION, "");
                mapping.getINSTANCE().add(transformationInstance);

                logger.debug("adding JOINER transformation instance: JOINER_"+transformationName);
                
                //create source
                SOURCEType source = pf.createSOURCEType();
                source.setBUSINESSNAME("");
                source.setDATABASETYPE("Microsoft SQL Server");
                source.setNAME(lookupTableName);
                source.setDESCRIPTION("new source for Lookup "+lookupTableName);
                //DBDNAME
                object.getSOURCE().add(source);
                

                logger.debug("adding SOURCE: "+lookupTableName);
                
                //create source instance
                INSTANCEType sourceInstance = I2TPowrmartFactory.createInstanceType(lookupTableName, "Source Definition", TYPEType5.SOURCE, "");
                sourceInstance.setDBDNAME(lookupTableName);
                mapping.getINSTANCE().add(sourceInstance);

                logger.debug("adding SOURCE instance: "+lookupTableName);
                
                //create source fields and connectors
                Integer countSourceFields = 1;
                //iterate over separate list
                LinkedList<TRANSFORMFIELDType> transformFields = new LinkedList<TRANSFORMFIELDType>(transformation.getTRANSFORMFIELD());
                for(TRANSFORMFIELDType transformField : transformFields){
                    ArrayList<String> portTypes = new ArrayList<String>();
                    String name = transformField.getNAME().toString();
                    
                    if(transformField.getPORTTYPE().toString().contains("LOOKUP")){
                        //create source field
                        SOURCEFIELDType sourceField = pf.createSOURCEFIELDType();
                        sourceField.setBUSINESSNAME("");
                        sourceField.setDATATYPE(I2TUtil.getMSSqlDatatypeFromIDatatype(transformField.getDATATYPE().toString()));
                        sourceField.setDESCRIPTION(transformField.getDESCRIPTION());
                        sourceField.setFIELDNUMBER(countSourceFields++);
                        sourceField.setFIELDTYPE("ELEMITEM");
                        sourceField.setHIDDEN("NO");
                        //KEYTYPE
                        sourceField.setLENGTH(transformField.getPRECISION());
                        //LENGTH
                        //LEVEL
                        sourceField.setNAME(name);
                        //NULLABLE
                        //OCCURS
                        //OFFSET
                        sourceField.setPHYSICALLENGTH(transformField.getPRECISION());
                        sourceField.setPHYSICALOFFSET("0");
                        sourceField.setPICTURETEXT("");
                        sourceField.setPRECISION(transformField.getPRECISION());
                        sourceField.setSCALE(transformField.getSCALE());
                        sourceField.setUSAGEFLAGS("");
                        source.getSOURCEFIELD().add(sourceField);

                        logger.debug("adding SOURCE field: "+name);
                        
                        //add connector
                        CONNECTORType connector = pf.createCONNECTORType();
                        connector.setFROMFIELD(name);
                        connector.setTOFIELD(name);
                        connector.setFROMINSTANCE(lookupTableName);
                        connector.setTOINSTANCE("JOINER_"+transformationName);
                        connector.setFROMINSTANCETYPE("Source Definition");
                        connector.setTOINSTANCETYPE("Joiner");
                        mapping.getCONNECTOR().add(connector);

                        logger.debug("adding CONNECTOR for "+name+" from "+lookupTableName+" to JOINER_"+transformationName);
                        
                        portTypes.add("INPUT");
                    }
                    else{
                        portTypes.add("INPUT");
                        portTypes.add("MASTER");
                    }
                    
                    if(transformField.getPORTTYPE().toString().contains("OUTPUT")){
                        portTypes.add("OUTPUT");
                    }

                    //change transform field
                    String portType = "";
                    if (portTypes.size()==0) {
                        portType = "";
                    } 
                    else {
                        StringBuffer sb = new StringBuffer();
                        sb.append(portTypes.get(0));
                        for (int i=1;i<portTypes.size();i++) {
                            sb.append("/");
                            sb.append(portTypes.get(i));
                        }
                        portType = sb.toString();
                    }
                    if(portType.equals("")){
                        logger.error("Failed to determine portType for "+name+" at JOINER_"+lookupTableName);
                    }
                    else{
                        TRANSFORMFIELDType newTransformField = (TRANSFORMFIELDType)EcoreUtil.copy(transformField);
                        newTransformField.setPORTTYPE(portType);
                        joinerTransformation.getTRANSFORMFIELD().add(newTransformField);
                        
                        logger.debug("adding transformation field: "+newTransformField.getNAME().toString()+" to "+joinerTransformation.getNAME().toString());
                    }
                }
                logger.info("finished working on "+transformationName);
            }
        }
        return object;
    }

}
