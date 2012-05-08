package de.viadee.i2t;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleDirectedGraph;
import org.jgrapht.traverse.DepthFirstIterator;

import de.viadee.i2t.interfaces.I2TFlowRegistry;
import de.viadee.i2t.interfaces.I2TGraphBuilder;
import de.viadee.i2t.interfaces.I2TGraphLayoutOptimization;


import Powrmart.CONNECTORType;
import Powrmart.INSTANCEType;
import Powrmart.MAPPINGType;

/**
 * Implements the interface I2TGraphBuilder
 * Builds a simple directed graph of the etl process 
 * and provides functions to lookup certain nodes and edges
 * requires a mapping type object
 * @author GrS 02.11.2011
 */
public class I2TGraphBuilderImpl implements I2TGraphBuilder {

    static Logger logger = Logger.getLogger(I2TGraphBuilderImpl.class);
    private SimpleDirectedGraph<Object, DefaultEdge> graph;
    private MAPPINGType object;
    private I2TFlowRegistry flowRegistry;
    private I2TGraphLayoutOptimization graphLayoutOptimization;
    
    public void setGraphLayoutOptimization(I2TGraphLayoutOptimization graphLayoutOptimization) {
        this.graphLayoutOptimization = graphLayoutOptimization;
    }

    public MAPPINGType getMAPPINGTypeObject() {
        return object;
    }

    public void setMAPPINGTypeObject(MAPPINGType object) {
        this.object = object;
    }
    
    public void setFlowRegistry(I2TFlowRegistry flowRegistry) {
        this.flowRegistry = flowRegistry;
    }

    public void printGraph(){
      Iterator<Object> iter = new DepthFirstIterator<Object, DefaultEdge>(graph);
      INSTANCEType vertex;
      while (iter.hasNext()) {
          vertex = (INSTANCEType)iter.next();
          Set<DefaultEdge> edges = graph.edgesOf(vertex);
          logger.debug("Node " + vertex.getNAME() + " is connected to: ");
          for(DefaultEdge e : edges){
              logger.debug(e);
          }        
      }
    }

    public SimpleDirectedGraph<Object, DefaultEdge> buildGraph(){
        if(object == null){
            logger.fatal("No MAPPINGType object to build graph from set");
        }
        graph = new SimpleDirectedGraph<Object, DefaultEdge>(DefaultEdge.class);
        
        //nodes
        EList<INSTANCEType> instances = object.getINSTANCE();
        for(INSTANCEType instance: instances){
            graph.addVertex(instance);
            graphLayoutOptimization.addNode(instance.getNAME().toString());
        }
        
        //edges
        EList<CONNECTORType> connectors = object.getCONNECTOR();
        for(CONNECTORType connector: connectors){
            INSTANCEType sourceInstance = null;
            INSTANCEType targetInstance = null;
            logger.debug("\nanalyzing connector from "+connector.getFROMINSTANCE()+"."+connector.getFROMFIELD()+" to "+connector.getTOINSTANCE()+"."+connector.getTOFIELD());
            for(INSTANCEType instance: instances){
                //lookup source
                logger.debug("comparing with source instance: "+instance.getNAME());
                if(sourceInstance == null &&
                        instance.getNAME().equals(connector.getFROMINSTANCE()) &&
                        instance.getTRANSFORMATIONNAME().equals(connector.getFROMINSTANCE()) && 
                        instance.getTRANSFORMATIONTYPE().equals(connector.getFROMINSTANCETYPE())){
                    sourceInstance = (INSTANCEType)instance;
                    logger.debug("set source instance: "+connector.getFROMINSTANCE()+"."+connector.getFROMFIELD());
                }
                //lookup target
                logger.debug("comparing with target instance: "+instance.getNAME());
                if(targetInstance == null && 
                        instance.getNAME().equals(connector.getTOINSTANCE()) &&
                        instance.getTRANSFORMATIONNAME().equals(connector.getTOINSTANCE()) && 
                        instance.getTRANSFORMATIONTYPE().equals(connector.getTOINSTANCETYPE())){
                    targetInstance = (INSTANCEType)instance;
                    logger.debug("set target instance: "+connector.getTOINSTANCE()+"."+connector.getTOFIELD());
                }
            }
            if(sourceInstance != null && targetInstance != null){
                logger.debug("adding edge between "+sourceInstance.getNAME().toString()+" and "+targetInstance.getNAME().toString());
                
                DefaultEdge e = graph.addEdge(sourceInstance, targetInstance);
                //edge may already exist
                if(e == null){
                    logger.debug("edge already existed");
                    e = graph.getEdge(sourceInstance, targetInstance);
                }
                
                //add created edge to flow registry
                if(connector.getFROMFIELD().equals(connector.getTOFIELD())){
                    String flowName = flowRegistry.addColumnToFlow(e, connector.getFROMFIELD().toString());
                    logger.debug("adding column "+connector.getFROMFIELD().toString()+" to flow "+flowName+" linking "+connector.getFROMINSTANCE().toString()+" and "+connector.getTOINSTANCE().toString());
                }
                else{
                    logger.fatal("Mapping of different source and target column names mssing: "+connector.getFROMFIELD()+ " to "+connector.getTOFIELD()+" [shoud not happen!]");
                }
                
            }
            else{
                logger.error("No edge added for "+connector.getFROMINSTANCE().toString()+"."+connector.getFROMFIELD()+" to "+connector.getTOINSTANCE().toString()+"."+connector.getTOFIELD());
            }
        }
        return graph;
    }

    public SimpleDirectedGraph<Object, DefaultEdge> getGraph() {
        if(graph == null){
            graph = buildGraph();
        }
        return graph;
    }
    
    public void detectedConcurrentFlows(){
        graph = getGraph();
        
        for(Object vertex : graph.vertexSet()){
            Set<DefaultEdge> outgoingEdges = graph.outgoingEdgesOf(vertex);
            INSTANCEType instance = (INSTANCEType) vertex;
            if(outgoingEdges.size() > 1 && !instance.getTRANSFORMATIONTYPE().equals("Router")){
                logger.warn("Detected more than one outgoing data flows at "+instance.getNAME()+" concurrent flows are not allowed in Talend!");
            }
        }
    }

    public List<DefaultEdge> getEdgeTargetsByINSTANCEName(String instanceName){
        LinkedList<DefaultEdge> list = new LinkedList<DefaultEdge>();
        for(DefaultEdge edge : graph.edgeSet()){
            if(((INSTANCEType)graph.getEdgeTarget(edge)).getNAME().toString().equals(instanceName)){
                list.add(edge);
            }
        }
        return list;
    }

    public List<DefaultEdge> getEdgeSourcesByINSTANCEName(String instanceName){
        LinkedList<DefaultEdge> list = new LinkedList<DefaultEdge>();
        for(DefaultEdge edge : graph.edgeSet()){
            if(((INSTANCEType)graph.getEdgeSource(edge)).getNAME().toString().equals(instanceName)){
                list.add(edge);
            }
        }
        return list;
    }

    public List<DefaultEdge> getEdgesSourcesByINSTANCEType(INSTANCEType instance){
        LinkedList<DefaultEdge> list = new LinkedList<DefaultEdge>();
        for(DefaultEdge edge : graph.edgeSet()){
            if(graph.getEdgeSource(edge).equals(instance)){
                list.add(edge);
            }
        }
        return list;
    }
    
    public List<DefaultEdge> getEdgesTargetsByINSTANCEType(INSTANCEType instance){
        LinkedList<DefaultEdge> list = new LinkedList<DefaultEdge>();
        for(DefaultEdge edge : graph.edgeSet()){
            if(graph.getEdgeTarget(edge).equals(instance)){
                list.add(edge);
            }
        }
        return list;
    }
    
    public DefaultEdge getEdgeByCONNECTORType(CONNECTORType connector){
        EList<INSTANCEType> instances = object.getINSTANCE();
        INSTANCEType sourceInstance = null;
        INSTANCEType targetInstance = null;
        DefaultEdge edge = null;
        for(INSTANCEType instance: instances){
            if(sourceInstance == null &&
                    instance.getNAME().equals(connector.getFROMINSTANCE()) &&
                    instance.getTRANSFORMATIONNAME().equals(connector.getFROMINSTANCE()) && 
                    instance.getTRANSFORMATIONTYPE().equals(connector.getFROMINSTANCETYPE())){
                sourceInstance = (INSTANCEType)instance;
            }
            if(targetInstance == null && 
                    instance.getNAME().equals(connector.getTOINSTANCE()) &&
                    instance.getTRANSFORMATIONNAME().equals(connector.getTOINSTANCE()) && 
                    instance.getTRANSFORMATIONTYPE().equals(connector.getTOINSTANCETYPE())){
                targetInstance = (INSTANCEType)instance;
            }
        }
        if(targetInstance != null && sourceInstance != null){
            edge = getGraph().getEdge(sourceInstance, targetInstance);
        }
        return edge;
    }
}
