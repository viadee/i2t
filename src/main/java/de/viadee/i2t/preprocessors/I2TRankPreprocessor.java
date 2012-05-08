package de.viadee.i2t.preprocessors;

import java.util.LinkedHashSet;
import java.util.LinkedList;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.util.EcoreUtil;

import Powrmart.CONNECTORType;
import Powrmart.FOLDERType;
import Powrmart.INSTANCEType;
import Powrmart.ISSORTKEYType;
import Powrmart.MAPPINGType;
import Powrmart.SORTDIRECTIONType;
import Powrmart.TABLEATTRIBUTEType;
import Powrmart.TRANSFORMATIONType;
import Powrmart.TRANSFORMFIELDType;
import Powrmart.TYPEType5;
import de.viadee.i2t.I2TPowrmartFactory;
import de.viadee.i2t.interfaces.I2TInformaticaPreprocessor;

/**
 * Talend Open Studio provides no Rank component.
 * Therefore the Informatica schema is adapted. A rank transformation is substituted with a combination of sorter, sequence generator and filter
 * Known Limitations:
 * <li>order of columns in tSortRow may be reverted</li>
 * @author GrS 10.11.2011
 */
public class I2TRankPreprocessor extends I2TAbstractInformaticaPreprocessor implements I2TInformaticaPreprocessor {

    static Logger logger = Logger.getLogger(I2TRankPreprocessor.class);
    private FOLDERType object;
    private MAPPINGType mapping;
    private String mappingName;
    private String rankTransformationName;
    private String precedingTransformationName;
    private TRANSFORMATIONType precedingTransformation;
    private String rankType;
    private String rankNumber;
    private String initialMappingExpressionTransformaion;
    private String newSorterTransformationName;
    private String newFilterTransformationName;
    private String newExpressionTransformationName;

    private void init(){
        mapping = (MAPPINGType)object.getMAPPING().get(0);
        mappingName = object.getNAME().toString();
    }

    /**
     * Parse rank transformation parameters
     * @author GrS 10.11.2011 Comment method "analyzeRankTransformationParameters".
     * @param rankTransformation
     */
    private void analyzeRankTransformationParameters(final TRANSFORMATIONType rankTransformation){
        //analyze rank transformation parameters
        for(TABLEATTRIBUTEType tableAttribute : rankTransformation.getTABLEATTRIBUTE()){
            if(tableAttribute.getNAME().equals("Top/Bottom")){
                rankType = tableAttribute.getVALUE().toString();
            }
            else if(tableAttribute.getNAME().equals("Number of Ranks")){
                rankNumber = tableAttribute.getVALUE().toString();
            }
        }
    }

    /**
     * Find preceding transformations of rank transformation
     * @author GrS 10.11.2011 Comment method "findConnectedTransformations".
     */
    private void findConnectedTransformations(){
        //find preceding transformation of rank transformation
        //find succeeding transformation/target of rank transformation
//        succeedingTransformationNames = new LinkedList<String>();
        for(CONNECTORType connector : mapping.getCONNECTOR()){
            if(connector.getTOINSTANCE().equals(rankTransformationName)){
                precedingTransformationName = connector.getFROMINSTANCE().toString();
            }
//            else if(connector.getFROMINSTANCE().equals(rankTransformationName)){
//                succeedingTransformationNames.add(connector.getTOINSTANCE().toString());
//            }
        }
        for(TRANSFORMATIONType transformation : mapping.getTRANSFORMATION()){
            if(transformation.getNAME().equals(precedingTransformationName)){
                precedingTransformation = transformation;
            }
        }
    }

    /**
     * Required to reduce schema to sortRow schema
     * @author GrS 10.11.2011 Comment method "createInitialMappingExpressionTransformaion".
     */
    private void createInitialMappingExpressionTransformaion(){
        //create expression transformation
        TRANSFORMATIONType newExpressionTransformation = I2TPowrmartFactory.createTransformationType(initialMappingExpressionTransformaion, "Expression", "initial mapping expression transformation for Rank");
        //transformation parameters
        newExpressionTransformation.getTABLEATTRIBUTE().add(I2TPowrmartFactory.createTableAttributeType("Tracing Level","Normal"));

        LinkedHashSet<String> outgoingFieldNames = new LinkedHashSet<String>();
        for(CONNECTORType connector : mapping.getCONNECTOR()){
            if(connector.getFROMINSTANCE().equals(precedingTransformationName)){
                outgoingFieldNames.add(connector.getFROMFIELD().toString());
            }
        }
        //transformation fields
        for(TRANSFORMFIELDType field : new LinkedList<TRANSFORMFIELDType>(precedingTransformation.getTRANSFORMFIELD())){
            String portType = field.getPORTTYPE().toString();
            String fieldName = field.getNAME().toString();
            // copy outgoing ports of rank transformation
            if(portType.contains("OUTPUT")){
                TRANSFORMFIELDType newField = (TRANSFORMFIELDType) EcoreUtil.copy(field);

                if(outgoingFieldNames.contains(fieldName)){
                    newField.setPORTTYPE("INPUT/OUTPUT");
                    newField.setEXPRESSION(fieldName);
                    newField.setEXPRESSIONTYPE("");
                }
                else{
                    newField.setPORTTYPE("INPUT");
                }
                newExpressionTransformation.getTRANSFORMFIELD().add(newField);

                //add incoming connector
                CONNECTORType connector = I2TPowrmartFactory.createConnectorType(fieldName, precedingTransformationName, precedingTransformation.getTYPE(), fieldName, initialMappingExpressionTransformaion, "Expression");
                mapping.getCONNECTOR().add(connector);

            }
        }
        mapping.getTRANSFORMATION().add(newExpressionTransformation);

        //create expression transformation instance
        INSTANCEType newExpressionTransformationInstance = I2TPowrmartFactory.createInstanceType(initialMappingExpressionTransformaion, "Expression", TYPEType5.TRANSFORMATION, "");
        mapping.getINSTANCE().add(newExpressionTransformationInstance);

        logger.debug("created new inital mapping expression transformation and instance: "+newSorterTransformationName);
    }

    /**
     * Sort after rank column
     * @author GrS 10.11.2011 Comment method "createSorterTransformation".
     * @param rankTransformation
     */
    private void createSorterTransformation(final TRANSFORMATIONType rankTransformation){
        //create sorter transformation
        TRANSFORMATIONType newSorterTransformation = I2TPowrmartFactory.createTransformationType(newSorterTransformationName, "Sorter", "Sorter transformation for Rank");
        //transformation parameters
        String[][] transformationParameters= {
                {"Sorter Cache Size","Auto"},
                {"Case Sensitive","YES"},
                {"Work Directory","$PMTempDir"},
                {"Distinct","NO"},
                {"Tracing Level","Normal"},
                {"Null Treated Low","NO"},
                {"Merge Only","NO"},
                {"Partitioning","Order records for individual partitions"},
                {"Transformation Scope","All Input"},
        };
        for(int i=0;i<transformationParameters.length;i++){
            newSorterTransformation.getTABLEATTRIBUTE().add(I2TPowrmartFactory.createTableAttributeType(transformationParameters[i][0],transformationParameters[i][1]));
        }
        //transformation fields
        for(TRANSFORMFIELDType field : new LinkedList<TRANSFORMFIELDType>(rankTransformation.getTRANSFORMFIELD())){
            String portType = field.getPORTTYPE().toString();
            // copy incoming ports of rank transformation
            if(portType.contains("INPUT")){
                TRANSFORMFIELDType newField = (TRANSFORMFIELDType) EcoreUtil.copy(field);
                newField.setISSORTKEY(ISSORTKEYType.NO);
                if(field.getEXPRESSIONTYPE().equals("GROUPBY")){
                    logger.warn("Rank of group by is not supported yet!");
                }
                //set rank field as sort criteria
                else if(field.getEXPRESSIONTYPE().equals("RANKPORT")){
                    if(rankType.equals("Top")){
                        newField.setSORTDIRECTION(SORTDIRECTIONType.DESCENDING);
                    }
                    newField.setISSORTKEY(ISSORTKEYType.YES);
        }
                newField.setEXPRESSIONTYPE("");
                newField.setEXPRESSION("");
                newSorterTransformation.getTRANSFORMFIELD().add(newField);
            }
        }
        mapping.getTRANSFORMATION().add(newSorterTransformation);

        //create sorter transformation instance
        INSTANCEType newSorterTransformationInstance = I2TPowrmartFactory.createInstanceType(newSorterTransformationName, "Sorter", TYPEType5.TRANSFORMATION, "");
        mapping.getINSTANCE().add(newSorterTransformationInstance);

        logger.debug("created new sorter transformation and instance: "+newSorterTransformationName);
    }

    /**
     * Add RANKINDEX as sequence expression transformation
     * @author GrS 10.11.2011 Comment method "createExpressionTransformation".
     * @param rankTransformation
     */
    private void createExpressionTransformation(final TRANSFORMATIONType rankTransformation){
        //create expression transformation
        TRANSFORMATIONType newExpressionTransformation = I2TPowrmartFactory.createTransformationType(newExpressionTransformationName, "Expression", "Expression transformation for Rank");
        //transformation parameters
        newExpressionTransformation.getTABLEATTRIBUTE().add(I2TPowrmartFactory.createTableAttributeType("Tracing Level","Normal"));

        //transformation fields
        for(TRANSFORMFIELDType field : new LinkedList<TRANSFORMFIELDType>(rankTransformation.getTRANSFORMFIELD())){
            String portType = field.getPORTTYPE().toString();
            // copy outgoing ports of rank transformation
            if(portType.contains("OUTPUT")){
                TRANSFORMFIELDType newField = (TRANSFORMFIELDType) EcoreUtil.copy(field);
                newField.setEXPRESSIONTYPE("");
                // set sequence generator expression for rankindex
                if(field.getNAME().equals("RANKINDEX")){
                    newField.setEXPRESSION("-- SEQUENCE TRANSFORMATION 1:1");
                    newField.setPORTTYPE("OUTPUT");
                }
                else{
                    newField.setEXPRESSION(field.getNAME().toString());
                    newField.setPORTTYPE("INPUT/OUTPUT");
                }
                newExpressionTransformation.getTRANSFORMFIELD().add(newField);
            }
        }
        mapping.getTRANSFORMATION().add(newExpressionTransformation);

        //create expression transformation instance
        INSTANCEType newExpressionTransformationInstance = I2TPowrmartFactory.createInstanceType(newExpressionTransformationName, "Expression", TYPEType5.TRANSFORMATION, "");
        mapping.getINSTANCE().add(newExpressionTransformationInstance);

        logger.debug("created new expression transformation and instance: "+newExpressionTransformationName);
    }

    /**
     * Filter number of desired ranks
     * @author GrS 10.11.2011 Comment method "createFilterTransformation".
     * @param rankTransformation
     */
    private void createFilterTransformation(final TRANSFORMATIONType rankTransformation){
        //create filter transformation
        TRANSFORMATIONType newFilterTransformation = I2TPowrmartFactory.createTransformationType(newFilterTransformationName, "Filter", "Filter transformation for Rank");
        //transformation parameters
    newFilterTransformation.getTABLEATTRIBUTE().add(I2TPowrmartFactory.createTableAttributeType("Tracing Level", "Normal"));
        // set filter to rankindex
        String operator = (rankType.equals("Top")) ? "&lt;=" : ">=";
        newFilterTransformation.getTABLEATTRIBUTE().add(I2TPowrmartFactory.createTableAttributeType("Filter Condition","RANKINDEX "+operator+" "+rankNumber));

        //transformation fields
        for(TRANSFORMFIELDType field : new LinkedList<TRANSFORMFIELDType>(rankTransformation.getTRANSFORMFIELD())){
            String portType = field.getPORTTYPE().toString();
            // copy outgoing ports of rank transformation
            if(portType.contains("OUTPUT")){
                TRANSFORMFIELDType newField = (TRANSFORMFIELDType) EcoreUtil.copy(field);
                newField.setEXPRESSIONTYPE("");
                newField.setEXPRESSION("");
                newFilterTransformation.getTRANSFORMFIELD().add(newField);
            }
        }
        mapping.getTRANSFORMATION().add(newFilterTransformation);

        //create filter transformation instance
        INSTANCEType newFilterTransformationInstance = I2TPowrmartFactory.createInstanceType(newFilterTransformationName, "Filter", TYPEType5.TRANSFORMATION, "");
        mapping.getINSTANCE().add(newFilterTransformationInstance);

        logger.debug("created new filter transformation and instance: "+newFilterTransformationName);
    }

    public FOLDERType process(final FOLDERType object) {
        this.object = object;
        init();

        logger.info("searching for rank transformations");

        if(mapping == null){
            logger.error("No mapping found at "+mappingName);
        }
        else
        {
            LinkedList<TRANSFORMATIONType> rankTransformations = new LinkedList<TRANSFORMATIONType>(mapping.getTRANSFORMATION());
            for(TRANSFORMATIONType rankTransformation : rankTransformations){
                //filter only rank transformations
                if(rankTransformation.getTYPE().toString().equals("Rank")){
                    rankTransformationName = rankTransformation.getNAME().toString();

                    logger.info("found rank transformation: "+rankTransformationName);

                    //analyze rank transformation parameters
                    analyzeRankTransformationParameters(rankTransformation);

                    //find preceding transformation of rank transformation
                    //find succeeding transformation/target of rank transformation
                    findConnectedTransformations();

                    //create initial expression
                    initialMappingExpressionTransformaion = "EXP_initialMapping_"+rankTransformationName;
                    createInitialMappingExpressionTransformaion();

                    //create sorter transformation and instance
                    newSorterTransformationName = "SRT_"+rankTransformationName;
                    createSorterTransformation(rankTransformation);

                    //create expression transformation and instance
                    newExpressionTransformationName = "EXP_"+rankTransformationName;
                    createExpressionTransformation(rankTransformation);

                    //create filter transformation and instance
                    newFilterTransformationName = "FLT_"+rankTransformationName;
                    createFilterTransformation(rankTransformation);

                    //handle connectors
                    for(CONNECTORType connector : new LinkedList<CONNECTORType>(mapping.getCONNECTOR())){
                        //for all incoming connectors of rank transformation:

                        if(connector.getTOINSTANCE().equals(rankTransformationName)){
                            logger.debug("changed connector from "+connector.getFROMINSTANCE()+"."+connector.getFROMFIELD()+" - "+connector.getTOINSTANCE()+"."+connector.getTOFIELD()+" to "+initialMappingExpressionTransformaion+"."+connector.getFROMFIELD()+" - "+newSorterTransformationName+"."+connector.getTOFIELD());
                            connector.setFROMINSTANCE(initialMappingExpressionTransformaion);
                            connector.setFROMINSTANCETYPE("Expression");
                            connector.setTOINSTANCE(newSorterTransformationName);
                            connector.setTOINSTANCETYPE("Sorter");

                            //FIXME: order may be reverted
                            logger.warn("Order of columns in schema of sortRow component may be reverted!");
                            String fieldName = connector.getTOFIELD().toString();
                            //  create connector from sorter to expression
                            CONNECTORType sorterToExpressionConnector = I2TPowrmartFactory.createConnectorType(fieldName, newSorterTransformationName, "Sorter", fieldName, newExpressionTransformationName, "Expression");
                            logger.debug("added new connector "+sorterToExpressionConnector.getFROMINSTANCE()+"."+sorterToExpressionConnector.getFROMFIELD()+" - "+sorterToExpressionConnector.getTOINSTANCE()+"."+sorterToExpressionConnector.getTOFIELD());
                            mapping.getCONNECTOR().add(sorterToExpressionConnector);

                        }
                        //for all outgoing connectors of rank transformation
                        if(connector.getFROMINSTANCE().equals(rankTransformationName)){
                            String fieldName = connector.getFROMFIELD().toString();

                            //  create connector from expression to filter
                            CONNECTORType expressionToFilter = I2TPowrmartFactory.createConnectorType(fieldName, newExpressionTransformationName, "Expression", fieldName, newFilterTransformationName, "Filter");
                            logger.debug("added new connector "+expressionToFilter.getFROMINSTANCE()+"."+expressionToFilter.getFROMFIELD()+" - "+expressionToFilter.getTOINSTANCE()+"."+expressionToFilter.getTOFIELD());
                            mapping.getCONNECTOR().add(expressionToFilter);

                            //  change outgoing connecter from rank to succeeding transformation/target from rank to filter
                            logger.debug("changed connector from "+connector.getFROMINSTANCE()+"."+connector.getFROMFIELD()+" - "+connector.getTOINSTANCE()+"."+connector.getTOFIELD()+" to "+newFilterTransformationName+"."+connector.getFROMFIELD()+" - "+connector.getTOINSTANCE()+"."+connector.getTOFIELD());
                            connector.setFROMINSTANCE(newFilterTransformationName);
                            connector.setFROMINSTANCETYPE("Filter");
                        }
                    }

                    //remove rank transformation
                    mapping.getTRANSFORMATION().remove(rankTransformation);
                    logger.debug("removed rank transformation and instance: "+rankTransformationName);

                    //remove rank transformation instance
                    for(INSTANCEType instance : new LinkedList<INSTANCEType>(mapping.getINSTANCE())){
                        if(instance.getNAME().equals(rankTransformationName)){
                            mapping.getINSTANCE().remove(instance);
                        }
                    }

                    logger.info("finished working on "+rankTransformationName);
                }
            }
        }
        return object;

    }

}
