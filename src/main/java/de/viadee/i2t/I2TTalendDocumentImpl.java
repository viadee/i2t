package de.viadee.i2t;

import de.viadee.i2t.interfaces.I2TTalendDocument;
import talendfile.ConnectionType;
import talendfile.NodeType;
import talendfile.ProcessType;
import talendfile.TalendfileFactory;

/**
 * Encapsulates the target Talend model
 * @author GrS 17.11.2011
 */
public class I2TTalendDocumentImpl implements I2TTalendDocument {
    
    /**
     * Talend document
     */
    private ProcessType document;

    /**
     * Create a I2TTalendDocument object
     * @author GrS 17.11.2011 I2TTalendDocumentImpl constructor comment.
     */
    public I2TTalendDocumentImpl() {
        document = TalendfileFactory.eINSTANCE.createProcessType();
    }
    
    public void addConnectionElement(ConnectionType connection){
        document.getConnection().add(connection);
    }
    
    public void addNodeElement(NodeType node){
        document.getNode().add(node);
    }
    
    public ProcessType getDocument(){
        return document;
    }
}
