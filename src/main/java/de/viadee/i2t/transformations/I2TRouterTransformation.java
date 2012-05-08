package de.viadee.i2t.transformations;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import Powrmart.GROUPType;
import Powrmart.TRANSFORMFIELDType;
import talendfile.NodeType;
import de.viadee.i2t.I2TTalendFactory;
import de.viadee.i2t.datatypes.TColumnInfo;
import de.viadee.i2t.datatypes.TFlowInfo;
import de.viadee.i2t.datatypes.TTableInfo;
import de.viadee.i2t.interfaces.I2TInformaticaTransformation;

/**
 * Transform an Informatica router transformation using Talend's tMap component.
 * @author GrS 08.11.2011
 */
public class I2TRouterTransformation extends I2TAbstractInformaticaTransformation implements I2TInformaticaTransformation {

    static Logger logger = Logger.getLogger(I2TRouterTransformation.class);

    public NodeType transform() {
        HashMap<String,String> options = new HashMap<String,String>();
        LinkedHashMap<String,TTableInfo> inputTables = new LinkedHashMap<String,TTableInfo>();
        LinkedHashMap<String,TTableInfo> outputTables = new LinkedHashMap<String,TTableInfo>();
        String uniqueName = object.getNAME().toString();
        
        TTableInfo inputTable;
        TTableInfo outputTable;
        LinkedHashMap<String,TColumnInfo> inputColumns;
        LinkedHashMap<String,TColumnInfo> outputColumns;
        LinkedHashMap<String,String> groups = new LinkedHashMap<String, String>();
        
        //process incoming flows
        LinkedHashMap<String,String> knownColumns = new LinkedHashMap<String,String>();
        for(TFlowInfo flowInfo : flowRegistry.getIncomingFlows(uniqueName)){
            inputTable = new TTableInfo();
            inputColumns = new LinkedHashMap<String, TColumnInfo>();
            logger.debug("working on incoming "+flowInfo.getName());
            logger.debug("flowColumns: "+flowInfo.getColumns());
            for(TRANSFORMFIELDType field : object.getTRANSFORMFIELD()){
                String portType = field.getPORTTYPE().toString().toUpperCase();
                TColumnInfo ci = createColumnInfo(field);
                String fieldName = ci.getName();      
                logger.debug("checking "+fieldName);
                if(portType.contains("INPUT") && flowInfo.getColumns().contains(fieldName)){
                    logger.debug("added "+fieldName+" to "+flowInfo.getName());
                    inputColumns.put(fieldName, ci);
                    knownColumns.put(fieldName,flowInfo.getName());
                }        
            }
            inputTable.setColumns(inputColumns);
            inputTable.setName(flowInfo.getName());
            inputTables.put(flowInfo.getName(), inputTable);
        }
        
        //process routing groups
        for(GROUPType group : object.getGROUP()){
            if(group.getTYPE().toString().equals("OUTPUT")){
                String expression = group.getEXPRESSION().toString();
                String groupExpression = "";
                //build detection regex
                String regex = "|[0-9]*)(\\s*)(!=|=|<|>|<=|>=|&lt;|&gt;|&lt;=|&gt;=)(\\s*)([0-9]*|";
                for(Map.Entry<String, TTableInfo> tableEntry : inputTables.entrySet()){
                    for(Map.Entry<String, TColumnInfo> entry : tableEntry.getValue().getColumns().entrySet()){
                        regex = "|"+entry.getKey()+regex+entry.getKey()+"|";
    
                        //add reference table to expression filter
                        if(expression.contains(entry.getKey())){
                            groupExpression = expression.replace(entry.getKey(), tableEntry.getKey()+"."+entry.getKey());
                        }
                    }
                }
                regex = "("+regex.substring(1,regex.length()-1)+")";
//                logger.debug(regex);
//                logger.debug(expression);
                
                if(expression.matches(regex)){
                    logger.info("Set group filter for group "+group.getNAME().toString()+" to "+groupExpression);
                }
                else{
                    logger.warn("Group filter could not be converted, it is now commented: "+expression);
                    groupExpression = "\\\\"+expression;
                }
                
                groups.put(group.getNAME().toString(), groupExpression);
            }
        }
        
        //process outgoing flows
        for(TFlowInfo flowInfo : flowRegistry.getOutgoingFlows(uniqueName)){
            outputTable = new TTableInfo();
            outputColumns = new LinkedHashMap<String, TColumnInfo>();
            logger.debug("working on incoming "+flowInfo.getName());
            logger.debug("flowColumns: "+flowInfo.getColumns());
            for(Map.Entry<String, String> group : groups.entrySet()){
                logger.debug("working on group "+group.getKey());
                for(TRANSFORMFIELDType field : object.getTRANSFORMFIELD()){
                    
                    String portType = field.getPORTTYPE().toString().toUpperCase();
                    String groupName = field.getGROUP().toString().toUpperCase();
                    TColumnInfo ci = createColumnInfo(field);
                    String fieldName = ci.getName();
                    logger.debug("working on field "+fieldName);
                    if(portType.contains("OUTPUT") 
                            && flowInfo.getColumns().contains(fieldName)
                            && group.getKey().equals(groupName)){
                        outputColumns.put(fieldName, ci);
                        String expression = group.getValue();
                        for(Map.Entry<String, String> column : knownColumns.entrySet()){
                            expression = expression.replace(column.getKey(), column.getValue()+"."+column.getKey());
                        }
                        outputTable.setExpressionFilter(expression);
                        logger.debug("adding field "+fieldName+" to "+flowInfo.getName());
                        //cut of last character ID_MANUFACTURER1
                        String lookupName = fieldName.substring(0, fieldName.length()-1);
                        if(knownColumns.containsKey(lookupName)){
                            ci.setExpression(knownColumns.get(lookupName)+"."+lookupName);
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
