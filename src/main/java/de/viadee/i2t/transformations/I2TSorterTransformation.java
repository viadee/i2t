package de.viadee.i2t.transformations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

import org.apache.log4j.Logger;

import Powrmart.ISSORTKEYType;
import Powrmart.SORTDIRECTIONType;
import Powrmart.TABLEATTRIBUTEType;
import Powrmart.TRANSFORMFIELDType;
import talendfile.NodeType;
import de.viadee.i2t.I2TTalendFactory;
import de.viadee.i2t.I2TUtil;
import de.viadee.i2t.datatypes.TColumnInfo;
import de.viadee.i2t.datatypes.TFlowInfo;
import de.viadee.i2t.datatypes.TSortOperationInfo;
import de.viadee.i2t.interfaces.I2TInformaticaTransformation;

/**
 * Transform an Informatica sorter transformation using Talend's tSortRow component.
 * @author GrS 08.11.2011
 */
public class I2TSorterTransformation extends I2TAbstractInformaticaTransformation implements I2TInformaticaTransformation {

    static Logger logger = Logger.getLogger(I2TSorterTransformation.class);

    public NodeType transform() {
        HashMap<String,String> options = new HashMap<String,String>();
        LinkedHashMap<String,TColumnInfo> columns = new LinkedHashMap<String, TColumnInfo>();
        LinkedHashMap<String,TSortOperationInfo> sortColumns = new LinkedHashMap<String, TSortOperationInfo>();
        String uniqueName = object.getNAME().toString();

        //check customizing
        ArrayList<String> messages = new ArrayList<String>();
        for(TABLEATTRIBUTEType tableAttribute : object.getTABLEATTRIBUTE()){
            String name = tableAttribute.getNAME().toString();
            String value = tableAttribute.getVALUE().toString();
            
            if(name.equals("Sorter Cache Size") && !value.equals("Auto")){
                messages.add("Sorter Cache Size: "+value);
            }
            else if(name.equals("Case Sensitive") && !value.equals("YES")){
                messages.add("Case Sensitive: "+value);
            }
            else if(name.equals("Distinct") && !value.equals("NO")){
                messages.add("Distinct: "+value);
            }
            else if(name.equals("Null Treated Low") && !value.equals("NO")){
                messages.add("Null Treated Low: "+value);
            }
            else if(name.equals("Merge Only") && !value.equals("NO")){
                messages.add("Merge Only: "+value);
            }
            else if(name.equals("Partitioning") && !value.equals("Order records for individual partitions")){
                messages.add("Partitioning: "+value);
            }
            else if(name.equals("Transformation Scope") && !value.equals("All Input")){
                messages.add("Transformation Scope: "+value);
            }
        }
        if(messages.size()>0){
            StringBuilder warning = new StringBuilder();
            warning.append("SorterTransformation "+uniqueName+" has custom attributes which require careful analysis: \n");
            for(String message : messages){
                warning.append(message+"\n");
            }
            logger.warn(warning.toString());
        }


        TFlowInfo flowInfo = flowRegistry.getOutgoingFlows(uniqueName).get(0);
        if(flowInfo == null){
            logger.fatal("No outgoing flows found");
        }
        
        //process outgoing flow
        for(TRANSFORMFIELDType field : object.getTRANSFORMFIELD()){
//            String portType = field.getPORTTYPE().toString().toUpperCase();
            TColumnInfo ci = createColumnInfo(field);
            String fieldName = ci.getName();        
            if(/*portType.contains("OUTPUT") &&*/ flowInfo.getColumns().contains(fieldName)){
                columns.put(fieldName, ci);
            }      
            //check if field is sort key, set sorting options
            if(field.getISSORTKEY().equals(ISSORTKEYType.YES)){
                TSortOperationInfo si = new TSortOperationInfo();
                si.setName(fieldName);
                String order = "";
                si.setSort(I2TUtil.getSortFromIDatatype(field.getDATATYPE().toString()));
                if(field.getSORTDIRECTION().equals(SORTDIRECTIONType.ASCENDING)){
                    si.setOrder("asc");
                    order = "ascending";
                }
                else if(field.getSORTDIRECTION().equals(SORTDIRECTIONType.DESCENDING)){
                    si.setOrder("desc");
                    order = "descending";
                }
                logger.info("Set sort field "+fieldName+" ("+order+")");
                
                sortColumns.put(fieldName, si);
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
        NodeType output = I2TTalendFactory.createTSortRowComponent(uniqueName, posX, posY, options, sortColumns, columns);
        
        return output;
    }

}
