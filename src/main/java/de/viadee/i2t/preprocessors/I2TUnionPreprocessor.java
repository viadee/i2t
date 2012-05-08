package de.viadee.i2t.preprocessors;

import java.util.LinkedList;

import org.apache.log4j.Logger;

import Powrmart.CONNECTORType;
import Powrmart.FOLDERType;
import Powrmart.MAPPINGType;
import Powrmart.TRANSFORMATIONType;
import Powrmart.TRANSFORMFIELDType;
import de.viadee.i2t.interfaces.I2TInformaticaPreprocessor;

/**
 * Informatica appends incrementing numbers to distinguish between output and input fields.
 * For Talend these suffixes are removed.
 * @author GrS 02.11.2011
 */
public class I2TUnionPreprocessor extends I2TAbstractInformaticaPreprocessor implements I2TInformaticaPreprocessor {

    static Logger logger = Logger.getLogger(I2TUnionPreprocessor.class);

    public FOLDERType process(FOLDERType object) {
        logger.info("searching for Union transformations");
        
        MAPPINGType mapping = (MAPPINGType)object.getMAPPING().get(0);
        if(mapping == null){
            logger.fatal("No mapping found at "+object.getNAME().toString());
        }
        else
        {
            //iterate over separate list
            LinkedList<TRANSFORMATIONType> transformations = new LinkedList<TRANSFORMATIONType>(mapping.getTRANSFORMATION());
            LinkedList<CONNECTORType> connectors = new LinkedList<CONNECTORType>(mapping.getCONNECTOR());
            for(TRANSFORMATIONType transformation : transformations){
                
                //only look for union transformations
                if(transformation.getTYPE().toString().equals("Custom Transformation")
                        && transformation.getTEMPLATENAME().toString().equals("Union Transformation")){
                    String transformationName = transformation.getNAME().toString();
                    logger.info("found Union Transformation "+transformationName);
                   for(TRANSFORMFIELDType field : transformation.getTRANSFORMFIELD()){
                       //change field names remove number suffix
                       if(field.getPORTTYPE().toString().contains("INPUT")){
                           String fieldName = field.getNAME().toString();
                           String newName = fieldName.substring(0,fieldName.length()-1);
                           logger.debug("Changing name from "+fieldName+" to "+newName);
                           field.setNAME(fieldName);
                           
                           for(CONNECTORType connector : connectors){
                               if(connector.getTOFIELD().toString().equals(fieldName)
                                       && connector.getTOINSTANCE().toString().equals(transformationName)
                                       && connector.getTOINSTANCETYPE().toString().equals("Custom Transformation")){
                                   connector.setTOFIELD(newName);
                               }
                           }
                       }
                   }
                }
            }
        }
        return object;
    }
}
