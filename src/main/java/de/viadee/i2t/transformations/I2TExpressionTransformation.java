package de.viadee.i2t.transformations;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import Powrmart.TRANSFORMFIELDType;
import talendfile.NodeType;
import de.viadee.i2t.I2TTalendFactory;
import de.viadee.i2t.datatypes.TColumnInfo;
import de.viadee.i2t.datatypes.TFlowInfo;
import de.viadee.i2t.datatypes.TTableInfo;
import de.viadee.i2t.interfaces.I2TInformaticaTransformation;

/**
 * Transform an Informatica expression transformation using Talend's tMap component.
 * Known limitations:
 * <li>Expressions using functions not converted</li>
 * <li>Automatic linking only works if input and output field names are equal</li>
 * @author GrS 08.11.2011
 */
public class I2TExpressionTransformation extends I2TAbstractInformaticaTransformation implements I2TInformaticaTransformation {

    static Logger logger = Logger.getLogger(I2TExpressionTransformation.class);
    private int sequenceCounter = 0;
    
    public NodeType transform() {
        HashMap<String,String> options = new HashMap<String,String>();
        LinkedHashMap<String,TTableInfo> inputTables = new LinkedHashMap<String,TTableInfo>();
        LinkedHashMap<String,TTableInfo> outputTables = new LinkedHashMap<String,TTableInfo>();
        String uniqueName = object.getNAME().toString();
        LinkedList<String> knownColumns = new LinkedList<String>();
        
        TTableInfo inputTable;
        TTableInfo outputTable;
        LinkedHashMap<String,TColumnInfo> inputColumns;
        LinkedHashMap<String,TColumnInfo> outputColumns;
        
        //process incoming flows
        for(TFlowInfo flowInfo : flowRegistry.getIncomingFlows(uniqueName)){
            inputTable = new TTableInfo();
            inputColumns = new LinkedHashMap<String, TColumnInfo>();
            logger.debug("working on incoming "+flowInfo.getName());
            logger.debug("flowColumns: "+flowInfo.getColumns());
            knownColumns.addAll(flowInfo.getColumns());
            for(TRANSFORMFIELDType field : object.getTRANSFORMFIELD()){
                String portType = field.getPORTTYPE().toString().toUpperCase();
                TColumnInfo ci = createColumnInfo(field);
                String fieldName = ci.getName();      
//                logger.debug("checking "+fieldName);
                if(portType.contains("INPUT") && flowInfo.getColumns().contains(fieldName)){
                    logger.debug("added "+fieldName+" to "+flowInfo.getName());
                    inputColumns.put(fieldName, ci);
                } 
            }
            inputTable.setColumns(inputColumns);
            inputTable.setName(flowInfo.getName());
            inputTables.put(flowInfo.getName(), inputTable);
        }
        
        //process outgoing flows
        for(TFlowInfo flowInfo : flowRegistry.getOutgoingFlows(uniqueName)){
            outputTable = new TTableInfo();
            outputColumns = new LinkedHashMap<String, TColumnInfo>();
            logger.debug("working on outgoing "+flowInfo.getName());
            logger.debug("flowColumns: "+flowInfo.getColumns());
            for(TRANSFORMFIELDType field : object.getTRANSFORMFIELD()){
                for(String column : flowInfo.getColumns()){
                    if(column.equals(field.getNAME().toString())){
                        String portType = field.getPORTTYPE().toString().toUpperCase();
                        TColumnInfo ci = createColumnInfo(field);
                        String fieldName = ci.getName();        
                        if(portType.contains("OUTPUT")){
                            
                            //expresssion handling
                            if(field.getEXPRESSION()!= null){
                                String sourceExpression = field.getEXPRESSION().toString();
                                String targetExpression = "";
                                //check for -- SEQUENCE TRANSFORMATION
                                if(sourceExpression.contains("-- SEQUENCE TRANSFORMATION")){
                                    Pattern pattern = Pattern.compile("-- SEQUENCE TRANSFORMATION ([0-9]+):([0-9]+)");
                                    Matcher matcher = pattern.matcher(sourceExpression);
                                    String startValue = "";
                                    String incrementValue = "";
                                    while(matcher.find()){
                                        startValue = matcher.group(1);
                                        incrementValue = matcher.group(2);
                                    }
                                    sequenceCounter++;
                                    targetExpression = "Numeric.sequence(\"s"+sequenceCounter+"\","+startValue+","+incrementValue+")";
                                }
                                else{
                                    //look if automatic links can be set
                                    if(knownColumns.contains(sourceExpression)){
                                        for(Map.Entry<String, TTableInfo> entry : inputTables.entrySet()){
                                            targetExpression = entry.getKey()+"."+sourceExpression;
                                        }  
                                    }
                                    else{
                                        targetExpression = "//COMMENTED BECAUSE NOT TRANSFORMABLE: "+sourceExpression;
                                        logger.warn("Expression was commented, because it is currently not convertible: "+sourceExpression);
                                    }
                                }
                                
                                ci.setExpression(targetExpression);
                            }
                            String debugMessage = "added "+fieldName+" to "+flowInfo.getName();
                            if(ci.getExpression() != null){
                                debugMessage += " | Expression: "+ci.getExpression();
                            }
                            logger.debug(debugMessage);
                            outputColumns.put(fieldName, ci);
                        }
                    }
                }
            }
            outputTable.setColumns(outputColumns);
            outputTable.setName(flowInfo.getName());
            outputTables.put(flowInfo.getName(), outputTable);
        }
        
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
