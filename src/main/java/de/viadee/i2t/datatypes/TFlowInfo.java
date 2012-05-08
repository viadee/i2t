package de.viadee.i2t.datatypes;

import java.util.LinkedList;

import org.jgrapht.graph.DefaultEdge;

/**
 * Data structure to transport data flow information
 * @author GrS 02.11.2011
 */
public class TFlowInfo {
    /**
     * reference to edge in graph
     */
    private DefaultEdge edge;
    /**
     * flow name
     */
    private String name;
    /**
     * known columns to this flow
     */
    private LinkedList<String> columns;
    
    public TFlowInfo() {
        columns = new LinkedList<String>();
    }
    
    public DefaultEdge getEdge() {
        return edge;
    }
    
    public void setEdge(DefaultEdge edge) {
        this.edge = edge;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public LinkedList<String> getColumns() {
        return columns;
    }

    public void setColumns(LinkedList<String> columns) {
        this.columns = columns;
    }
}