package de.viadee.i2t.interfaces;

import de.viadee.i2t.datatypes.TTableInfo;

/**
 * Provides information about the meta data in the ETL process
 * @author GrS 10.11.2011
 */
public interface I2TMetadataRegistry {
    
    /**
     * Get table info by table name
     * @author GrS 10.11.2011 Comment method "getTableInfo"
     * @param name  - String name
     * @return TTableInfo
     */
    public TTableInfo getTableInfo(String name);
    
    /**
     * Register a table
     * @author GrS 10.11.2011 Comment method "setTableInfo"
     * @param name      - String name
     * @param tableInfo - TTableInfo table info
     */
    public void setTableInfo(String name, TTableInfo tableInfo);
}
