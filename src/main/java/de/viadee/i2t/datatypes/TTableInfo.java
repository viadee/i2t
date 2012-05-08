package de.viadee.i2t.datatypes;

import java.util.HashMap;
import java.util.LinkedHashMap;


/**
 * Data structure to transport table information
 * @author GrS 02.11.2011
 */
public class TTableInfo {
    /**
     * table name
     */
    private String name;
    /**
     * list of columns
     */
    private LinkedHashMap<String,TColumnInfo> columns;
    /**
     * table properties
     */
    private HashMap<String,String> options;
    
    public TTableInfo(){
        
    }
    
    public TTableInfo(String name, LinkedHashMap<String,TColumnInfo> columns){
        this.name = name;
        this.columns = columns;
    }
    
    public LinkedHashMap<String,TColumnInfo> getColumns(){
        if(columns == null){
            return new LinkedHashMap<String,TColumnInfo>();
        }
        return columns;
    }
    
    public void setColumns(LinkedHashMap<String,TColumnInfo> columns){
        this.columns = columns;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @SuppressWarnings("serial")
    public HashMap<String, String> getOptions() {
        if(options == null)
            options = new HashMap<String, String>(){{ put("matchingMode", "UNIQUE_MATCH"); put("lookupMode", "LOAD_ONCE"); }};       
        return options;
    }

    public void setOptions(HashMap<String, String> options) {
        this.options = options;
    }
    
    public void setInnerJoin(){
        getOptions().put("innerJoin", "true");
    }
    
    public void setExpressionFilter(String expressionFilter){
        getOptions().put("expressionFilter", expressionFilter);
        getOptions().put("activateExpressionFilter", "true");
    }
}
