package de.viadee.i2t.interfaces;

import java.util.List;

import org.jgrapht.graph.DefaultEdge;

import de.viadee.i2t.datatypes.TFlowInfo;

/**
 * Provides information about the data flows in the model.
 * Data flows with a name are registered and contain a list of column names.
 * They reference an edge in the graph of instances created by the class I2TGraphBuilderImpl.
 * The flow registry is filled with information form Informatica connector type elements.
 * @author GrS 10.11.2011
 */
public interface I2TFlowRegistry {
    
    /**
     * Setter for I2TGraphBuilder dependency
     * @author GrS 10.11.2011 Comment method "setGraphBuilder".
     * @param graphBuilder - I2TGraphBuilder object
     */
    public void setGraphBuilder(I2TGraphBuilder graphBuilder);

    /**
     * Create a new flow if it not already exists and add edge
     * @author GrS 10.11.2011 Comment method "registerFlow".
     * @param edge  - DefaultEdge edge
     * @param flow  - TFlowInfo flow
     * @return String
     */
    public String registerFlow(DefaultEdge edge, TFlowInfo flow);
    
    /**
     * Add a column to a flow, register the flow if not already registered
     * @author GrS 10.11.2011 Comment method "addColumnToFlow".
     * @param edge      - DefaultEdge edge
     * @param column    - String column
     * @return String
     */
    public String addColumnToFlow(DefaultEdge edge, String column);
    
    /**
     * Get a flow by name
     * @author GrS 10.11.2011 Comment method "getFlow".
     * @param name  - String name
     * @return TFlowInfo
     */
    public TFlowInfo getFlow(String name);
    
    /**
     * Get a flow name by edge
     * @author GrS 10.11.2011 Comment method "getFlowName".
     * @param edge  - DefaultEdge edge
     * @return String
     */
    public String getFlowName(DefaultEdge edge);
    
    /**
     * Get a flow by edge
     * @author GrS 10.11.2011 Comment method "getFlow".
     * @param edge  - DefaultEdge edge
     * @return TFlowInfo
     */
    public TFlowInfo getFlow(DefaultEdge edge);
    
    /**
     * Retrieve a list of outgoing flows for a given instance name
     * @author GrS 10.11.2011 Comment method "getOutgoingFlows".
     * @param instanceName  - String instanceName
     * @return List<TFlowInfo>
     */
    public List<TFlowInfo> getOutgoingFlows(String instanceName);
    
    /**
     * Retrieve a list of incoming flows for a given instance name
     * @author GrS 10.11.2011 Comment method "getIncomingFlows".
     * @param instanceName  - String instanceName
     * @return List<TFlowInfo>
     */
    public List<TFlowInfo> getIncomingFlows(String instanceName);
}
