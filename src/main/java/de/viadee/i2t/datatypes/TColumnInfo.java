package de.viadee.i2t.datatypes;

/**
 * Data structure to transport column information e.g. for the Talend meta data structure
 * @author GrS 02.11.2011
 * <metadata connector="FLOW" label="HH_ORDERS" name="HH_ORDERS">
 *    <column key="false" length="10" name="ORDER_ID" nullable="true" pattern="" precision="0" sourceType="INT" type="id_Integer"/>
 *    <column key="false" length="23" name="DATE_SHIPPED" nullable="false" pattern="&quot;dd-MM-yyyy&quot;" precision="3" sourceType="DATETIME" type="id_Date"/>
 *    <column key="false" length="10" name="CUSTOMER_ID" nullable="false" pattern="" precision="0" sourceType="INT" type="id_Integer"/>
 *    <column key="false" length="15" name="DISCOUNT_EMPLOYEE" nullable="false" pattern="" precision="0" sourceType="FLOAT" type="id_Double"/>
 * </metadata>
 */
public class TColumnInfo {
    
    String comment;
    /**
     * is column a foreign/primary key column?
     */
    boolean key;
    /**
     * fixed column length
     */
    int length;
    /**
     * name of column
     */
    String name;
    /**
     * is column null?
     */
    boolean nullable;
    /**
     * pattern for date format
     */
    String pattern;
    /**
     * precision for floating point values
     */
    int precision;
    /**
     * Talend source type, e.g. DATETIME, INT, DECIMAL, VARCHAR
     */
    String sourceType;
    /**
     * Talend java data type, e.g. id_Date, id_Integer, id_BigDecimal, id_String
     */
    String type;
    /**
     * expresison defined for the column
     */
    String expression;
    /**
     * operator for joins e.g. "="
     */
    String operator;

    public TColumnInfo(){
        
    }

    public TColumnInfo(String name, String expression, String type){
        this.name = name;
        this.expression = expression;
        this.type = type;
    }
    
    public TColumnInfo(String comment, boolean key, int length, String name, boolean nullable, String pattern, int precision, String sourceType, String type){
        this.comment = comment;
        this.key = key;
        this.length = length;
        this.name = name;
        this.nullable = nullable;
        this.pattern = pattern;
        this.precision = precision;
        this.sourceType = sourceType;
        this.type = type;
    }
    
    public String getComment() {
        return comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }
    
    public boolean isKey() {
        return key;
    }
    
    public void setKey(boolean key) {
        this.key = key;
    }
    
    public int getLength() {
        return length;
    }
    
    public void setLength(int length) {
        this.length = length;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public boolean isNullable() {
        return nullable;
    }
    
    public void setNullable(boolean nullable) {
        this.nullable = nullable;
    }
    
    public String getPattern() {
        return pattern;
    }
    
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
    
    public int getPrecision() {
        return precision;
    }
    
    public void setPrecision(int precision) {
        this.precision = precision;
    }
    
    public String getSourceType() {
        return sourceType;
    }
    
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }
    
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}