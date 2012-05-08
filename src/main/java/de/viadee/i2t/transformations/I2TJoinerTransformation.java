package de.viadee.i2t.transformations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

import org.apache.log4j.Logger;

import Powrmart.TABLEATTRIBUTEType;
import Powrmart.TRANSFORMFIELDType;

import talendfile.ConnectionType;
import talendfile.NodeType;
import de.viadee.i2t.I2TTalendFactory;
import de.viadee.i2t.datatypes.TColumnInfo;
import de.viadee.i2t.datatypes.TFlowInfo;
import de.viadee.i2t.datatypes.TTableInfo;
import de.viadee.i2t.interfaces.I2TInformaticaTransformation;

/**
 * Transform an Informatica joiner transformation using Talend's tMap component.
 * Known limitations:
 * <li>all join types except "Normal Join" are mapped to a left outer join in Talend</li>
 * @author GrS 08.11.2011
 */
public class I2TJoinerTransformation extends I2TAbstractInformaticaTransformation implements I2TInformaticaTransformation {

    static Logger logger = Logger.getLogger(I2TJoinerTransformation.class);

    public NodeType transform() {
        HashMap<String,String> options = new HashMap<String,String>();
        LinkedHashMap<String,TTableInfo> inputTables = new LinkedHashMap<String,TTableInfo>();
        LinkedHashMap<String,TTableInfo> outputTables = new LinkedHashMap<String,TTableInfo>();
        String uniqueName = object.getNAME().toString();
        String joinCondition = null;
        String joinType = null;
        
        //check customizing
        ArrayList<String> messages = new ArrayList<String>();
        for(TABLEATTRIBUTEType tableAttribute : object.getTABLEATTRIBUTE()){
            String name = tableAttribute.getNAME().toString();
            String value = tableAttribute.getVALUE().toString();
            
            if(name.equals("Case Sensitive String Comparison") && !value.equals("YES")){
                messages.add("Case Sensitive String Comparison: "+value);
            }
            else if(name.equals("Null ordering in master") && !value.equals("Null Is Highest Value")){
                messages.add("Null ordering in master: "+value);
            }
            else if(name.equals("Null ordering in detail") && !value.equals("Null Is Highest Value")){
                messages.add("Null ordering in detail: "+value);
            }
            else if(name.equals("Sorted Input") && !value.equals("NO")){
                messages.add("Sorted Input: "+value);
            }
            else if(name.equals("Master Sort Order") && !value.equals("Auto")){
                messages.add("Master Sort Order: "+value);
            }
            else if(name.equals("Transformation Scope") && !value.equals("All Input")){
                messages.add("Transformation Scope: "+value);
            }
            else if(name.equals("Pre SQL") && !value.equals("")){
                messages.add("Pre SQL: "+value);
            }
            else if(name.equals("Post SQL") && !value.equals("")){
                messages.add("Post SQL: "+value);
            }
            else if(name.equals("Output is deterministic") && !value.equals("NO")){
                messages.add("Output is deterministic: "+value);
            }
            else if(name.equals("Output is repeatable") && !value.equals("Never")){
                messages.add("Output is repeatable: "+value);
            }
            else if(name.equals("Join Condition")){
                joinCondition = value;
            }
            else if(name.equals("Join Type")){
                joinType = value;
            }
        }
        if(messages.size()>0){
            StringBuilder warning = new StringBuilder();
            warning.append("JoinerTransformation "+uniqueName+" has custom attributes which require careful analysis: \n");
            for(String message : messages){
                warning.append(message+"\n");
            }
            logger.warn(warning.toString());
        }
        
        HashMap<String, String> conditions = new HashMap<String,String>();
        
        //parse join condition
        if(joinCondition == null){
            logger.fatal("No Join Condition found!");
        }
        else{
            
            String[] conditionRows = joinCondition.split("AND");
            for(String condition : conditionRows){
                String[] conditionParts = condition.split("=");
                conditions.put(conditionParts[1].trim(), conditionParts[0].trim());
                conditions.put(conditionParts[0].trim(), conditionParts[1].trim());
            }
        }

        //parse join type
        boolean innerJoin = false;
        if(joinType == null){
            logger.fatal("No Join type found!");
        }
        else{
            if(joinType.equals("Normal Join")){
                innerJoin = true;
            }
        }
        
        TTableInfo inputTable;
        TTableInfo outputTable;
        LinkedHashMap<String,TColumnInfo> inputColumns;
        LinkedHashMap<String,TColumnInfo> outputColumns;
        
        //process incoming flows
        for(TFlowInfo flowInfo : flowRegistry.getIncomingFlows(uniqueName)){
            
            inputTable = new TTableInfo();
            if(innerJoin == true){
                inputTable.setInnerJoin();
            }

            inputColumns = new LinkedHashMap<String, TColumnInfo>();
            logger.debug("working on incoming "+flowInfo.getName());
            logger.debug("flowColumns: "+flowInfo.getColumns());
            for(TRANSFORMFIELDType field : object.getTRANSFORMFIELD()){
                String portType = field.getPORTTYPE().toString().toUpperCase();
                TColumnInfo ci = createColumnInfo(field);
                String fieldName = ci.getName();      
//                logger.debug("checking "+fieldName);
                if(portType.contains("INPUT") && flowInfo.getColumns().contains(fieldName)){
                    logger.debug("added "+fieldName+" to "+flowInfo.getName());
                    //prepare expressions
                    if(conditions.containsKey(fieldName) /*&& !portType.contains("MASTER")*/){
                        String expressionPrefix = "";
                        String expression = conditions.get(fieldName);
                        for(TFlowInfo flow : flowRegistry.getIncomingFlows(uniqueName)){
                            if(flow.getColumns().contains(expression)){
                                expressionPrefix = flow.getName();
                            }
                        }
                        
                        ci.setExpression(expressionPrefix+"."+expression);
                        ci.setOperator("=");
                        logger.info("Adding "+((innerJoin) ? "inner join" : "left join")+ " joining "+fieldName+" on "+expressionPrefix+"."+expression);

                        //change line style of Talend connection to Lookup
                        for(ConnectionType connection : new LinkedList<ConnectionType>(talendDocument.getDocument().getConnection())){
                            if(connection.getLabel().equals(flowInfo.getName()) && !portType.contains("MASTER")){
                                connection.setLineStyle(8);
                            }
                        }
                    }
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
            for(TRANSFORMFIELDType field : object.getTRANSFORMFIELD()){
                String portType = field.getPORTTYPE().toString().toUpperCase();
                TColumnInfo ci = createColumnInfo(field);
                String fieldName = ci.getName();        
                if(portType.contains("OUTPUT") && flowInfo.getColumns().contains(fieldName)){
                    for(Map.Entry<String, TTableInfo> entry : inputTables.entrySet()){
                        if(entry.getValue().getColumns().containsKey(fieldName)){
                            ci.setExpression(entry.getKey()+"."+fieldName);
                        }
                    }
                    outputColumns.put(fieldName, ci);
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
