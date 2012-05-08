package de.viadee.i2t.interfaces;

import java.util.List;

import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleDirectedGraph;
import org.springframework.beans.factory.annotation.Required;

import Powrmart.CONNECTORType;
import Powrmart.INSTANCEType;
import Powrmart.MAPPINGType;

/**
 * Builds a simple directed graph of the etl process 
 * and provides functions to lookup certain nodes and edges
 * requires a mapping type object
 * @author GrS 10.11.2011
 */
public interface I2TGraphBuilder {
    
    /**
     * Get mapping type object
     * required for proper operation
     * @author GrS 10.11.2011 Comment method "getMAPPINGTypeObject".
     * @return MAPPINGType
     */
    MAPPINGType getMAPPINGTypeObject();
    
    /**
     * Set mapping type object
     * required for proper operation
     * @author GrS 10.11.2011 Comment method "setMAPPINGTypeObject".
     * @param object - MAPPINGType object
     */
    void setMAPPINGTypeObject(MAPPINGType object);

    /**
     * Setter for I2TGraphLayoutOptimization dependency
     * @author GrS 02.12.2011 Comment method "setGraphLayoutOptimization".
     * @param graphLayoutOptimization
     */
    @Required
    void setGraphLayoutOptimization(I2TGraphLayoutOptimization graphLayoutOptimization);
    
    /**
     * Setter for I2TFlowRegistry dependency
     * @author GrS 10.11.2011 Comment method "setFlowRegistry".
     * @param flowRegistry - I2TFlowRegistry object
     */
    @Required
    void setFlowRegistry(I2TFlowRegistry flowRegistry);
    
    /**
     * Print the current graph
     * @author GrS 10.11.2011 Comment method "printGraph".
     */
    void printGraph();
    
    /**
     * Retrieve the current graph and builds it if it not exists
     * @author GrS 10.11.2011 Comment method "getGraph".
     * @return SimpleDirectedGraph<Object, DefaultEdge>
     */
    SimpleDirectedGraph<Object, DefaultEdge> getGraph();
    
    /**
     * Build a simple directed graph with instance types as nodes and data flows as edges
     * @author GrS 10.11.2011 Comment method "buildGraph".
     * @return SimpleDirectedGraph<Object, DefaultEdge>
     */
    SimpleDirectedGraph<Object, DefaultEdge> buildGraph();
    
    /**
     * Warn user if there are nodes at which more than one outgoing data flow is found except at router transformations    
     * @author GrS 10.11.2011 Comment method "setFlowRegistry".
     */
    void detectedConcurrentFlows();

    /**
     * Retrieve the edge associated with a given connector
     * @author GrS 10.11.2011 Comment method "getEdgeByCONNECTORType".
     * @param connector - CONNECTORType object
     * @return DefaultEdge
     */
    DefaultEdge getEdgeByCONNECTORType(CONNECTORType connector);
    
    /**
     * Retrieve a list of edge sources given an instance name
     * @author GrS 10.11.2011 Comment method "getEdgeSourcesByINSTANCEName".
     * @param instanceName - String name of instance
     * @return List<DefaultEdge>
     */
    List<DefaultEdge> getEdgeSourcesByINSTANCEName(String instanceName);
    
    /**
     * Retrieve a list of edge targets given an instance name
     * @author GrS 10.11.2011 Comment method "getEdgeTargetsByINSTANCEName".
     * @param instanceName - String name of instance
     * @return List<DefaultEdge>
     */
    List<DefaultEdge> getEdgeTargetsByINSTANCEName(String instanceName);
    
    /**
     * Retrieve a list of edge source given an instance
     * @author GrS 10.11.2011 Comment method "getEdgesSourcesByINSTANCEType".
     * @param instance - INSTANCEType object
     * @return List<DefaultEdge>
     */
    List<DefaultEdge> getEdgesSourcesByINSTANCEType(INSTANCEType instance);

    /**
     * Retrieve a list of edge targets given an instance
     * @author GrS 10.11.2011 Comment method "getEdgesTargetsByINSTANCEType".
     * @param instance - INSTANCEType object
     * @return List<DefaultEdge>
     */
    List<DefaultEdge> getEdgesTargetsByINSTANCEType(INSTANCEType instance);
}
