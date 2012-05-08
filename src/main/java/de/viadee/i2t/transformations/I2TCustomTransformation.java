package de.viadee.i2t.transformations;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

import org.apache.log4j.Logger;

import Powrmart.TRANSFORMFIELDType;
import talendfile.ConnectionType;
import talendfile.NodeType;
import de.viadee.i2t.I2TTalendFactory;
import de.viadee.i2t.datatypes.TColumnInfo;
import de.viadee.i2t.datatypes.TFlowInfo;
import de.viadee.i2t.datatypes.TTableInfo;
import de.viadee.i2t.interfaces.I2TInformaticaTransformation;

/**
 * Transform an Informatica custom transformation using Talend's tUnite component.
 * Known limitations: 
 * <li>Only union transformation are transformed correctly</li>
 * @author GrS 08.11.2011
 */
public class I2TCustomTransformation extends I2TAbstractInformaticaTransformation implements I2TInformaticaTransformation {

    static Logger logger = Logger.getLogger(I2TCustomTransformation.class);

    public NodeType transform() {
        String uniqueName = object.getNAME().toString();
        String templateName = object.getTEMPLATENAME().toString();
        
        //posititon
        int posX = (int)getNewCoordinates(uniqueName).getX();
        int posY = (int)getNewCoordinates(uniqueName).getY();
        counter++;
        
        HashMap<String,String> options = new HashMap<String,String>();
        
        //only union transformations are currently implemented
        if(!templateName.equals("Union Transformation")){
            logger.error("Only Union Transformations can be migrated, found "+templateName);

            options.put("COMMENT", "Tried to migrate "+uniqueName+" found "+templateName+".\n Only Union Transformations can be migrated.");
            
            NodeType output = I2TTalendFactory.createTMapComponent(uniqueName, posX, posY, options, new LinkedHashMap<String, TTableInfo>(),  new LinkedHashMap<String, TTableInfo>());
            return output;
        }
        else{
            LinkedHashMap<String, TColumnInfo> columns = new LinkedHashMap<String, TColumnInfo>();
                
            int mergeOrder = 1;
            for(TFlowInfo flowInfo : flowRegistry.getIncomingFlows(uniqueName)){
                //set merge order at Talend connection and change line style
                for(ConnectionType connection : new LinkedList<ConnectionType>(talendDocument.getDocument().getConnection())){
                    if(connection.getLabel().equals(flowInfo.getName())){
                        connection.setMergeOrder(mergeOrder++);
                        connection.setLineStyle(10);
                    }
                }
            }
            TFlowInfo flowInfo = flowRegistry.getOutgoingFlows(uniqueName).get(0);
            if(flowInfo == null){
                logger.error("No outgoing flow found");
            }
            else{
                logger.debug("working on incoming "+flowInfo.getName());
                logger.debug("flowColumns: "+flowInfo.getColumns());
                for(TRANSFORMFIELDType field : object.getTRANSFORMFIELD()){
                    
                    String portType = field.getPORTTYPE().toString().toUpperCase();
                    String groupName = field.getGROUP().toString().toUpperCase();
                    String outputGroup = field.getOUTPUTGROUP().toString().toUpperCase();
                    
                    TColumnInfo ci = createColumnInfo(field);
                    String fieldName = ci.getName();
                    logger.debug("working on field "+fieldName);
                    
                    //add those columns to the output list which have the appropriate port type, match the group and the flow
                    if(portType.contains("OUTPUT") 
                            && flowInfo.getColumns().contains(fieldName)
                            && groupName.equals("OUTPUT")
                            && outputGroup.equals("OUTPUT")){
                        columns.put(fieldName, ci);
                        logger.debug("adding field "+fieldName+" to "+flowInfo.getName());
                    } 
                }
            }
    
            //comment
            if(object.getDESCRIPTION()!= null){
                options.put("COMMENT", object.getDESCRIPTION().toString());
            }
            
            //create tMap component
            NodeType output = I2TTalendFactory.createTUniteComponent(uniqueName, posX, posY, options, columns);   
            return output;
        }
    }

}
