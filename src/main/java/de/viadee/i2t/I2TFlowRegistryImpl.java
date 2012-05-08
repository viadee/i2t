package de.viadee.i2t;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.jgrapht.graph.DefaultEdge;

import de.viadee.i2t.datatypes.TFlowInfo;
import de.viadee.i2t.interfaces.I2TFlowRegistry;
import de.viadee.i2t.interfaces.I2TGraphBuilder;

/**
 * Provides information about the data flows in the model
 * @author GrS 02.11.2011
 */
public class I2TFlowRegistryImpl implements I2TFlowRegistry{

    static Logger logger = Logger.getLogger(I2TFlowRegistryImpl.class);
    
    /**
     * HashMap of TFlowInfo objects related to an edge
     */
    private HashMap<DefaultEdge,TFlowInfo> flowInfos;

    /**
     * HashMap of flow names related to an edge
     */
    private HashMap<DefaultEdge,String> flowNames;
    /**
     * flow counter for increasing flow names: row1, row2, ...
     */
    private int flowCounter;
    /**
     * graphBuilder dependency
     */
    private I2TGraphBuilder graphBuilder;
    

    public I2TFlowRegistryImpl(){
        flowInfos = new HashMap<DefaultEdge,TFlowInfo>();
        flowNames = new HashMap<DefaultEdge,String>();
        flowCounter = 1;
    }

    public void setGraphBuilder(I2TGraphBuilder graphBuilder) {
        this.graphBuilder = graphBuilder;
    }

    public String registerFlow(DefaultEdge edge, TFlowInfo flow){
        if(flowInfos.containsKey(edge)){
            String flowName = flowNames.get(edge);
            logger.warn("Flow already registered: "+flowName);
            return flowName;
        }
        else{
            String flowName = "row"+flowCounter;
            flow.setName(flowName);
            flowInfos.put(edge, flow);
            flowNames.put(edge, flowName);
            flowCounter++;
            logger.debug("registering flow: "+flowName);
            return flowName;
        }
    }

    public String addColumnToFlow(DefaultEdge edge, String column){
        TFlowInfo flowInfo;
        if(flowInfos.containsKey(edge)){
            flowInfo = flowInfos.get(edge);
            flowInfo.getColumns().add(column);
        }
        else{
            flowInfo = new TFlowInfo();
            flowInfo.getColumns().add(column);
            registerFlow(edge, flowInfo);
        }
        return flowInfo.getName();
    }

    public List<TFlowInfo> getOutgoingFlows(String instanceName){
        List<DefaultEdge> edges = graphBuilder.getEdgeSourcesByINSTANCEName(instanceName);
        if(edges == null){
            logger.error("No outgoing flows found for "+instanceName);
        }
        List<TFlowInfo> flows = new LinkedList<TFlowInfo>();
        for(DefaultEdge edge : edges){
            TFlowInfo flowInfo = getFlow(edge);
            if(flowInfo != null){
                flows.add(flowInfo);
            }
        }
        return flows;
    }
    
    public List<TFlowInfo> getIncomingFlows(String instanceName){
        List<DefaultEdge> edges = graphBuilder.getEdgeTargetsByINSTANCEName(instanceName);
        if(edges == null){
            logger.error("No incoming flows found for "+instanceName);
        }
        List<TFlowInfo> flows = new LinkedList<TFlowInfo>();
        for(DefaultEdge edge : edges){
            TFlowInfo flowInfo = getFlow(edge);
            if(flowInfo != null){
                flows.add(flowInfo);
            }
        }
        return flows;
    }

    public TFlowInfo getFlow(String name){
        TFlowInfo flowInfo = null;
        if(flowNames.containsValue(name)){
            DefaultEdge edge;
            for(Map.Entry<DefaultEdge, String> entry : flowNames.entrySet()){
                if(entry.getValue().equals(name)){
                    edge = entry.getKey();
                    flowInfo = flowInfos.get(edge);
                }
            }
        }
        else{
            logger.error("Flow not found: "+name);
        }
        return flowInfo;
    }
    
    public String getFlowName(DefaultEdge edge){
        String name = null;
        if(flowNames.containsKey(edge)){
            name = flowNames.get(edge);
        }
        else{
            logger.error("Flow not found: "+edge);
        }
        return name;
    }

    public TFlowInfo getFlow(DefaultEdge edge){
        TFlowInfo flowInfo = null;
        if(flowInfos.containsKey(edge)){
            flowInfo = flowInfos.get(edge);
        }
        else{
            logger.error("Flow not found: "+edge);
        }
        return flowInfo;
    }
    
    public String toString(){
        return "\nflowNames: "+flowNames.values()+" \nflowInfos: "+flowInfos.values();
    }
}
