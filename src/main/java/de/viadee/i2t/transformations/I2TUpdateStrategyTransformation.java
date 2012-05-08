package de.viadee.i2t.transformations;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

import org.apache.log4j.Logger;

import Powrmart.TRANSFORMFIELDType;
import talendfile.NodeType;
import de.viadee.i2t.I2TTalendFactory;
import de.viadee.i2t.datatypes.TColumnInfo;
import de.viadee.i2t.datatypes.TFlowInfo;
import de.viadee.i2t.datatypes.TTableInfo;
import de.viadee.i2t.interfaces.I2TInformaticaTransformation;

/**
 * Transform an Informatica update strategy transformation using Talend's tMap component.
 * Known limitations:
 * <li>update strategy expression is not considered, should influence connected target components</li>
 * @author GrS 06.12.2011
 */
public class I2TUpdateStrategyTransformation extends I2TAbstractInformaticaTransformation implements I2TInformaticaTransformation {

    static Logger logger = Logger.getLogger(I2TUpdateStrategyTransformation.class);
    
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
            knownColumns.addAll(flowInfo.getColumns());
            for(TRANSFORMFIELDType field : object.getTRANSFORMFIELD()){
                String portType = field.getPORTTYPE().toString().toUpperCase();
                TColumnInfo ci = createColumnInfo(field);
                String fieldName = ci.getName();      
                if(portType.contains("INPUT") && flowInfo.getColumns().contains(fieldName)){
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
                for(String column : flowInfo.getColumns()){
                    if(column.equals(field.getNAME().toString())){
                        String portType = field.getPORTTYPE().toString().toUpperCase();
                        TColumnInfo ci = createColumnInfo(field);
                        String fieldName = ci.getName();        
                        String targetExpression = "";
                        if(portType.contains("OUTPUT")){
                            if(knownColumns.contains(fieldName)){
                                for(Map.Entry<String, TTableInfo> entry : inputTables.entrySet()){
                                    targetExpression = entry.getKey()+"."+fieldName;
                                }  
                            }
                            ci.setExpression(targetExpression);
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
