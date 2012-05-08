package de.viadee.i2t.transformations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.jgrapht.graph.DefaultEdge;

import Powrmart.CONNECTORType;
import Powrmart.TABLEATTRIBUTEType;
import Powrmart.TRANSFORMFIELDType;
import de.viadee.i2t.I2TTalendFactory;
import de.viadee.i2t.datatypes.TColumnInfo;
import de.viadee.i2t.datatypes.TTableInfo;
import de.viadee.i2t.interfaces.I2TInformaticaTransformation;
import talendfile.NodeType;

/**
 * Transform an Informatica source qualifier transformation using Talend's tMap component
 * @author GrS 08.11.2011
 */
public class I2TSourceQualifierTransformation extends I2TAbstractInformaticaTransformation implements
        I2TInformaticaTransformation {

    static Logger logger = Logger.getLogger(I2TSourceQualifierTransformation.class);

    public NodeType transform() {
        HashMap<String,String> options = new HashMap<String,String>();
        LinkedHashMap<String,TTableInfo> inputTables = new LinkedHashMap<String,TTableInfo>();
        LinkedHashMap<String,TTableInfo> outputTables = new LinkedHashMap<String,TTableInfo>();
        String uniqueName = object.getNAME().toString();
        
        //check customizing
        ArrayList<String> messages = new ArrayList<String>();
        for(TABLEATTRIBUTEType tableAttribute : object.getTABLEATTRIBUTE()){
            String name = tableAttribute.getNAME().toString();
            String value = tableAttribute.getVALUE().toString();
            
            if(name.equals("Sql Query") && !value.equals("")){
                messages.add("Sql Query: "+value);
            }
            else if(name.equals("User Defined Join") && !value.equals("")){
                messages.add("User Defined Join: "+value);
            }
            else if(name.equals("Source Filter") && !value.equals("")){
                messages.add("Source Filter: "+value);
            }
            else if(name.equals("Number Of Sorted Ports") && !value.equals("0")){
                messages.add("Number Of Sorted Ports: "+value);
            }
            else if(name.equals("Select Distinct") && !value.equals("NO")){
                messages.add("Select Distinct: "+value);
            }
            else if(name.equals("Is Partitionable") && !value.equals("NO")){
                messages.add("Is Partitionable: "+value);
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
        }

        if(messages.size()>0){
            StringBuilder warning = new StringBuilder();
            warning.append("SourceQualifierTransformation "+uniqueName+" has custom attributes which require careful analysis: \n");
            for(String message : messages){
                warning.append(message+"\n");
            }
            logger.warn(warning.toString());
        }
        
        LinkedHashMap<String,TColumnInfo> columns = new LinkedHashMap<String,TColumnInfo>();
        for(TRANSFORMFIELDType field : object.getTRANSFORMFIELD()){
            TColumnInfo ci = createColumnInfo(field);
            String name = field.getNAME().toString();
            
            columns.put(name, ci);

            String tableNameIn = null;
            String tableNameOut = null;
            for(CONNECTORType connector : connectors){
                if(connector.getTOINSTANCE().toString().equals(uniqueName)){
                    DefaultEdge e = graphBuilder.getEdgeByCONNECTORType(connector);
                    tableNameIn = flowRegistry.getFlowName(e);
                    TTableInfo tableInfo = new TTableInfo(tableNameIn, columns);
                    inputTables.put(tableNameIn, tableInfo);
                }
            }
            for(CONNECTORType connector : connectors){
                if(connector.getFROMINSTANCE().toString().equals(uniqueName)){
                    DefaultEdge e = graphBuilder.getEdgeByCONNECTORType(connector);
                    tableNameOut = flowRegistry.getFlowName(e);
                    TTableInfo tableInfo = new TTableInfo(tableNameOut, columns);
                    for(Map.Entry<String, TColumnInfo> entry : tableInfo.getColumns().entrySet()){
                        if(tableNameIn!=null){
                            entry.getValue().setExpression(tableNameIn+"."+entry.getKey());
                        }
                    }
                    outputTables.put(tableNameOut, tableInfo);
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
        
        NodeType output = I2TTalendFactory.createTMapComponent(uniqueName, posX, posY, options, inputTables, outputTables);
        return output;
    }

}
