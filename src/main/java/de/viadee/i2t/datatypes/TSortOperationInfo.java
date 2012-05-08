package de.viadee.i2t.datatypes;

/**
 * Data structure to transport sort operation information
 * <elementParameter field="TABLE" name="CRITERIA">
 *    <elementValue elementRef="COLNAME" value="ITEMGROUP_ID"/>
 *    <elementValue elementRef="SORT" value="num"/>
 *    <elementValue elementRef="ORDER" value="asc"/>
 *    <elementValue elementRef="COLNAME" value="NAME"/>
 *    <elementValue elementRef="SORT" value="alpha"/>
 *    <elementValue elementRef="ORDER" value="desc"/>
 *  </elementParameter>
 * @author GrS 02.11.2011
 */
public class TSortOperationInfo {
    private String name;
    /**
     * num or alpha
     */
    private String sort;
    /**
     * asc or desc
     */
    private String order;

    public TSortOperationInfo() {
        
    }
    
    public TSortOperationInfo(String name, String sort, String order) {
        this.name = name;
        this.sort = sort;
        this.order = order;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getSort() {
        return sort;
    }
    
    public void setSort(String sort) {
        this.sort = sort;
    }
    
    public String getOrder() {
        return order;
    }
    
    public void setOrder(String order) {
        this.order = order;
    }
}
