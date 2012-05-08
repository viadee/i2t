package de.viadee.i2t;

import Powrmart.CONNECTORType;
import Powrmart.INSTANCEType;
import Powrmart.PowrmartFactory;
import Powrmart.TABLEATTRIBUTEType;
import Powrmart.TRANSFORMATIONType;
import Powrmart.TYPEType5;

/**
 * Provide factory methods for the construction of Talendfile structures.
 * @author GrS 10.11.2011
 */
public class I2TPowrmartFactory {

    /**
     * Factory method to create TABLEATTRIBUTEType structure
     * @author GrS 08.11.2011 Comment method "createTableAttributeType".
     * @param name  - String name
     * @param value - String value
     * @return TABLEATTRIBUTEType
     */
    public static TABLEATTRIBUTEType createTableAttributeType(String name, String value){
        TABLEATTRIBUTEType ta = PowrmartFactory.eINSTANCE.createTABLEATTRIBUTEType();
        ta.setNAME(name);
        ta.setVALUE(value);
        return ta;
    }
    
    /**
     * Factory method to create INSTANCEType structure
     * @author GrS 09.11.2011 Comment method "createInstnaceType".
     * @param name                  - String name of instance
     * @param transformationType    - String transformation type of instance (Expression,Sorter,...)
     * @param type                  - TYPEType5 type of instance (SOURCE,TARGET,TRANSFORMAITON)
     * @param description           - String description
     * @return INSTANCEType
     */
    public static INSTANCEType createInstanceType(String name, String transformationType, TYPEType5 type, String description){
        INSTANCEType instance = PowrmartFactory.eINSTANCE.createINSTANCEType();
        instance.setDESCRIPTION(description);
        instance.setNAME(name);
        instance.setTRANSFORMATIONNAME(name);
        instance.setTRANSFORMATIONTYPE(transformationType);
        instance.setTYPE(type);
        return instance;
    }
    
    /**
     * Factory method to create TRANSFORMATIONType structure
     * @author GrS 09.11.2011 Comment method "createTransformationType".
     * @param name          - String name of transformation
     * @param type          - String type of transformation (Expressison, Sorter, Router,...)
     * @param description   - String description
     * @return TRANSFORMATIONType
     */
    public static TRANSFORMATIONType createTransformationType(String name, String type, String description){
        TRANSFORMATIONType transformation = PowrmartFactory.eINSTANCE.createTRANSFORMATIONType();
        transformation.setDESCRIPTION(description);
        transformation.setNAME(name);
        transformation.setOBJECTVERSION(1);
        transformation.setREUSABLE("NO");
        transformation.setTYPE(type);
        transformation.setVERSIONNUMBER(1);
        return transformation;
    }
    
    /**
     * Factory method to create CONNECTORType structure
     * @author GrS 09.11.2011 Comment method "createConnectorType".
     * @param fromField         - String from field
     * @param fromInstance      - String from instance
     * @param fromInstanceType  - String from instance type
     * @param toField           - String to field
     * @param toInstance        - String to instance
     * @param toInstanceType    - String instance type
     * @return CONNECTORType
     */
    public static CONNECTORType createConnectorType(Object fromField, Object fromInstance, Object fromInstanceType, Object toField, Object toInstance, Object toInstanceType){
        CONNECTORType connector = PowrmartFactory.eINSTANCE.createCONNECTORType();
        connector.setFROMFIELD(fromField);
        connector.setFROMINSTANCE(fromInstance);
        connector.setFROMINSTANCETYPE(fromInstanceType);
        connector.setTOFIELD(toField);
        connector.setTOINSTANCE(toInstance);
        connector.setTOINSTANCETYPE(toInstanceType);
        return connector;
    }
}
