package de.viadee.i2t.interfaces;

import java.util.List;


import talendfile.NodeType;

import Powrmart.CONNECTORType;
import Powrmart.TRANSFORMATIONType;


/**
 * Interface to be implemented by each transformation
 * @author GrS 02.11.2011
 */
public interface I2TInformaticaTransformation {

    /**
     * Setter for I2TGraphBuilder dependency
     * @author GrS 17.11.2011 Comment method "setGraphBuilder".
     * @param graphBuilder  - I2TGraphBuilder object
     */
    void setGraphBuilder(I2TGraphBuilder graphBuilder);

    /**
     * Setter for I2TFlowRegistry dependency
     * @author GrS 17.11.2011 Comment method "setFlowRegistry".
     * @param flowRegistry - I2TFlowRegistry object
     */
    void setFlowRegistry(I2TFlowRegistry flowRegistry);
    
    /**
     * Setter for transformation type object
     * @author GrS 17.11.2011 Comment method "setTransformationTypeObject".
     * @param object - TRANSFORMATIONType object
     */
    void setTransformationTypeObject(TRANSFORMATIONType object);
    
    /**
     * Setter for List of connector type objects 
     * @author GrS 17.11.2011 Comment method "setConnectorTypeObjects".
     * @param connectors - List of CONNECTORType objects
     */
    void setConnectorTypeObjects(List<CONNECTORType> connectors);
    
    /**
     * Execute the transformation
     * @author GrS 17.11.2011 Comment method "transform".
     * @return NodeType
     */
    NodeType transform();
}
