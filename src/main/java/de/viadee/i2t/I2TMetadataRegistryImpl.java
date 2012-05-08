package de.viadee.i2t;

import java.util.HashMap;

import org.apache.log4j.Logger;

import de.viadee.i2t.datatypes.TTableInfo;
import de.viadee.i2t.interfaces.I2TMetadataRegistry;

/**
 * Provides information about the metadata in the etl process.
 * @author GrS 08.11.2011
 */
public class I2TMetadataRegistryImpl implements I2TMetadataRegistry{

    static Logger logger = Logger.getLogger(I2TMetadataRegistryImpl.class);
    private HashMap<String,TTableInfo> metadata;
    
    private I2TMetadataRegistryImpl() {
        metadata = new HashMap<String, TTableInfo>();
    }

    public TTableInfo getTableInfo(String name){
        TTableInfo tableInfo = null;
        if(metadata.containsKey(name)){
            tableInfo = metadata.get(name);
        }
        else{
            logger.error("TableInfo not found for "+name);
        }
        return tableInfo;
    }
    
    public void setTableInfo(String name, TTableInfo tableInfo){
        metadata.put(name, tableInfo);
    }
}
