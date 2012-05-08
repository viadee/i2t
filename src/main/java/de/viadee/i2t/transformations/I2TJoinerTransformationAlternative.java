package de.viadee.i2t.transformations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

import org.apache.log4j.Logger;

import Powrmart.TABLEATTRIBUTEType;
import Powrmart.TRANSFORMFIELDType;
import talendfile.NodeType;
import de.viadee.i2t.I2TTalendFactory;
import de.viadee.i2t.datatypes.TColumnInfo;
import de.viadee.i2t.datatypes.TFlowInfo;
import de.viadee.i2t.interfaces.I2TInformaticaTransformation;


/**
 * Transform an Informatica joiner transformation using Talend's tJoin component.
 * Known limitations:
 * <li>all join types except "Normal Join" are mapped to a left outer join in Talend</li>
 * @author GrS 08.11.2011
 */
public class I2TJoinerTransformationAlternative extends I2TAbstractInformaticaTransformation implements I2TInformaticaTransformation {

    static Logger logger = Logger.getLogger(I2TJoinerTransformationAlternative.class);

    public NodeType transform() {
        HashMap<String,String> options = new HashMap<String,String>();
        LinkedHashMap<String,TColumnInfo> columns = new LinkedHashMap<String, TColumnInfo>();
        LinkedHashMap<String,String> joinColumns = new LinkedHashMap<String, String>();
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
        
        //prase join condition
        if(joinCondition == null){
            logger.fatal("No Join Condition found!");
        }
        else{
            String[] conditionRows = joinCondition.split("AND");
            for(String condition : conditionRows){
                String[] conditionParts = condition.split("=");
                joinColumns.put(conditionParts[0].trim(), conditionParts[1].trim());
            }
        }
        

        //parse join type
        if(joinType == null){
            logger.fatal("No Join type found!");
        }
        else{
            if(joinType.equals("Normal Join")){
                options.put("USE_INNER_JOIN", "true");
            }
            else{
                options.put("USE_INNER_JOIN", "false");
            }
        }
        
        TFlowInfo flowInfo = flowRegistry.getOutgoingFlows(uniqueName).get(0);
        if(flowInfo == null){
            logger.fatal("No outgoing flows found");
        }
        
        //process outgoing flow
        for(TRANSFORMFIELDType field : object.getTRANSFORMFIELD()){
            String portType = field.getPORTTYPE().toString().toUpperCase();
            TColumnInfo ci = createColumnInfo(field);
            String fieldName = ci.getName();        
            if(portType.contains("OUTPUT") && flowInfo.getColumns().contains(fieldName)){
                columns.put(fieldName, ci);
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
        
        //create tMap component
        NodeType output = I2TTalendFactory.createTJoinComponent(uniqueName, posX, posY, options, joinColumns, columns);
        return output;
    }
}
