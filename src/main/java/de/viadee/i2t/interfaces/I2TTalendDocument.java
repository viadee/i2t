package de.viadee.i2t.interfaces;

import talendfile.ConnectionType;
import talendfile.NodeType;
import talendfile.ProcessType;

/**
 * Encapsulates the target Talend model
 * @author GrS 17.11.2011
 */
public interface I2TTalendDocument {
    
    /**
     * Add a connection element to the Talend target model
     * @author GrS 17.11.2011 Comment method "addConnectionElement".
     * @param connection - ConnectionType object
     */
    void addConnectionElement(ConnectionType connection);
    
    /**
     * Add a node element to the Talend target model
     * @author GrS 17.11.2011 Comment method "addNodeElement".
     * @param node - NodeType object
     */
    void addNodeElement(NodeType node);
    
    /**
     * Retrieve current Talend document
     * @author GrS 17.11.2011 Comment method "getDocument".
     * @return ProcessType
     */
    ProcessType getDocument();
}