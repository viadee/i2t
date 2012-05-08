package de.viadee.i2t.datatypes;

/**
 * Data structure to transport aggregate operation information
 *  <elementParameter field="TABLE" name="OPERATIONS">
 *    <elementValue elementRef="OUTPUT_COLUMN" value="SUM_ITEMS"/>
 *    <elementValue elementRef="FUNCTION" value="sum"/>
 *    <elementValue elementRef="INPUT_COLUMN" value="QUANTITY"/>
 *    <elementValue elementRef="IGNORE_NULL" value="false"/>
 *  </elementParameter>
 * @author GrS 02.11.2011
 */
public class TAggregateOperationInfo {
    /**
     * output column of aggregation mapping
     */
    private String outputColumn;
    /**
     * aggregation function e.g. sum, last, count
     */
    private String function;
    /**
     * input column of aggregation mapping
     */
    private String inputColumn;
    /**
     * ignore null values yes or no
     */
    private String ignoreNull;
    /**
     * TColumnInfo object for meta data
     */
    private TColumnInfo columnInfo;

    public TAggregateOperationInfo(String outputColumn, String function, String inputColumn, String ignoreNull, TColumnInfo columnInfo) {
        super();
        this.outputColumn = outputColumn;
        this.function = function;
        this.inputColumn = inputColumn;
        this.ignoreNull = ignoreNull;
        this.columnInfo = columnInfo;
    }
    
    public TColumnInfo getColumnInfo() {
        return columnInfo;
    }

    public void setColumnInfo(TColumnInfo columnInfo) {
        this.columnInfo = columnInfo;
    }

    public String getOutputColumn() {
        return outputColumn;
    }

    public void setOutputColumn(String outputColumn) {
        this.outputColumn = outputColumn;
    }
    
    public String getFunction() {
        return function;
    }
    
    public void setFunction(String function) {
        this.function = function;
    }
    
    public String getInputColumn() {
        return inputColumn;
    }
    
    public void setInputColumn(String inputColumn) {
        this.inputColumn = inputColumn;
    }
    
    public String getIgnoreNull() {
        return ignoreNull;
    }
    
    public void setIgnoreNull(String ignoreNull) {
        this.ignoreNull = ignoreNull;
    }
}
