package de.viadee.i2t.transformations;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import Powrmart.TABLEATTRIBUTEType;
import Powrmart.TRANSFORMFIELDType;
import de.viadee.i2t.I2TTalendFactory;
import de.viadee.i2t.I2TUtil;
import de.viadee.i2t.datatypes.TAggregateOperationInfo;
import de.viadee.i2t.datatypes.TColumnInfo;
import de.viadee.i2t.datatypes.TFlowInfo;
import de.viadee.i2t.interfaces.I2TInformaticaTransformation;
import talendfile.NodeType;

/**
 * Transform an Informatica aggregator transformation using Talend's tAggregateRow component.
 * Known limitations: 
 * <li>Only SUM(*) and COUNT(*) as expressions are parsed correctly</li>
 * @author GrS 18.10.2011
 */
public class I2TAggregatorTransformation extends I2TAbstractInformaticaTransformation implements I2TInformaticaTransformation {

    static Logger logger = Logger.getLogger(I2TAggregatorTransformation.class);

    public NodeType transform() {
        HashMap<String,String> options = new HashMap<String,String>();
        String uniqueName = object.getNAME().toString();
        LinkedList<String> groupByColumns = new LinkedList<String>();
        LinkedHashMap<String,TAggregateOperationInfo> operations = new LinkedHashMap<String,TAggregateOperationInfo>();
        
        //check customizing
        for(TABLEATTRIBUTEType tableAttribute : object.getTABLEATTRIBUTE()){
            String name = tableAttribute.getNAME().toString();
            String value = tableAttribute.getVALUE().toString();
            
            if(name.equals("Sorted Input") && !value.equals("NO")){
                logger.warn("AggregatorTransformation "+uniqueName+" has custom attributes\n: Sorted Input "+value);
            }
        }
        
        //get all input columns
        LinkedList<String> knownInputs = new LinkedList<String>();
        for(TRANSFORMFIELDType field : object.getTRANSFORMFIELD()){
            String portType = field.getPORTTYPE().toString().toUpperCase();
            if(portType.contains("INPUT")){
                knownInputs.add(field.getNAME().toString().toUpperCase());
            }
        }
        
        //get all output columns
        for(TFlowInfo flowInfo : flowRegistry.getOutgoingFlows(uniqueName)){
            for(TRANSFORMFIELDType field : object.getTRANSFORMFIELD()){
                String portType = field.getPORTTYPE().toString().toUpperCase();
                String name = field.getNAME().toString();
                if((portType.equals("OUTPUT") || portType.equals("INPUT/OUTPUT")) && flowInfo.getColumns().contains(name)){
                    TColumnInfo ci = new TColumnInfo();
                    String type = I2TUtil.getTypeFromIDatatype(field.getDATATYPE().toString());
                    String sourceType = I2TUtil.getSourceTypeFromIDatatype(field.getDATATYPE().toString());
                    
                    ci.setName(name);
                    ci.setPrecision(Integer.parseInt(field.getSCALE().toString()));
                    ci.setLength(Integer.parseInt(field.getPRECISION().toString()));
                    //FIXME: nullable should be checked against meta data because Informatica does not provide infos about nullable in the field definition of the transformation
                    ci.setNullable(true);
                    ci.setSourceType(sourceType);
                    ci.setType(type);
        
                    String outputColumn = name;
                    String inputColumn = "";
                    //last as default aggregation
                    String function = "";
                    String expression = (field.getEXPRESSION()!=null) ? field.getEXPRESSION().toString().toUpperCase() : null;
                    String expressionType = (field.getEXPRESSIONTYPE()!=null) ? field.getEXPRESSIONTYPE().toString() : null;
                    
                    //parse aggregation
                    if(expression != null && !expressionType.equals("GROUPBY")){
                        Pattern pattern = Pattern.compile("(SUM|COUNT|AVG|MIN|MAX)(.*)");
                        Matcher matcher = pattern.matcher(expression);
                        while (matcher.find()) {
                            String found = matcher.group(2).substring(1, matcher.group(2).length()-1);
                            if(knownInputs.contains(found)){
                                inputColumn = found;
                                function = matcher.group(1).toLowerCase();
                            }
                        }
                    }
                    
                    //if an expression is available add the column to the list of grouping columns
                    if(expressionType != null && expressionType.equals("GROUPBY")){
                        groupByColumns.add(name);
                    }
                    else if(expression != null  && function == ""){
                        logger.warn("Could not convert aggregation expression "+expression+" at field "+name);
                        object.setDESCRIPTION("Could not convert aggregation expression "+expression+" at field "+name);
                    }
                    TAggregateOperationInfo operationInfo = new TAggregateOperationInfo(outputColumn, function, inputColumn, "false", ci);
                    operations.put(name, operationInfo);
                }
            }
        }
        //comment
        if(object.getDESCRIPTION()!= null){
            options.put("COMMENT", object.getDESCRIPTION().toString());
        }

        //position
        int posX = (int)getNewCoordinates(uniqueName).getX();
        int posY = (int)getNewCoordinates(uniqueName).getY();
        counter++;
        
        //create tAggregateRow component
        NodeType output = I2TTalendFactory.createTAggregateRowComponent(uniqueName, posX, posY, options, groupByColumns, operations);
        return output;
    }

}
