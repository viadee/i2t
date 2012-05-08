package de.viadee.i2t.interfaces;

import java.awt.Point;

/**
 * Interface for GraphLayoutOptimization
 * Creates a graph of with Informatica transformation instance names and Talend edges.
 * Is used during the initialization of the graphBuilder.
 * @author GrS 02.12.2011
 */
public interface I2TGraphLayoutOptimization {
    
    /**
     * Add a node identified by a name to the graph.
     * @author GrS 02.12.2011 Comment method "addNode".
     * @param name  - Name of node as String
     */
    public void addNode(String name);
    
    /**
     * Add an edge identified by a name between source and target to the graph.
     * @author GrS 02.12.2011 Comment method "addEdge".
     * @param name          - Name of the edge as String
     * @param sourceName    - Name of the source as String
     * @param targetName    - Name of the target as String
     */
    public void addEdge(String name, String sourceName, String targetName);
    
    /**
     * Calculate the coordinates of a node by name after optimization.
     * @author GrS 02.12.2011 Comment method "getCoordinates".
     * @param nodeName
     * @return
     */
    public Point getCoordinates(String nodeName);
}
