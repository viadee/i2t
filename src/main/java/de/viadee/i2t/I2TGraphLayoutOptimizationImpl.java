package de.viadee.i2t;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.SwingConstants;

import org.apache.log4j.Logger;

import com.mxgraph.layout.mxIGraphLayout;
import com.mxgraph.layout.hierarchical.mxHierarchicalLayout;
import com.mxgraph.model.mxCell;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxLayoutManager;

import de.viadee.i2t.interfaces.I2TGraphLayoutOptimization;

/**
 * Implementation of the interface I2TGraphLayoutOptimization.
 * Creates a graph of with Informatica transformation instance names and Talend edges.
 * Is used during the initialization of the graphBuilder.
 * @author GrS 02.12.2011
 */
public class I2TGraphLayoutOptimizationImpl extends JFrame implements I2TGraphLayoutOptimization {
 
    private static final long serialVersionUID = -8620817289348492219L;
    static Logger logger = Logger.getLogger(I2TGraphLayoutOptimizationImpl.class);
    /**
     * mxHierarchicalLayout
     */
    private mxHierarchicalLayout layout;
    /**
     * mxGraph
     */
    private mxGraph graph;
    /**
     * root node
     */
    private Object parent;
    /**
     * array of all nodes
     */
    private Object[] cells;
    /**
     * hash map of nodes accessible via name
     */
    private HashMap<String, Object> nodes;
    /**
     * stretching factor for x and y coordinations
     */
    private final double strechFactor = 1.25;
    
    public I2TGraphLayoutOptimizationImpl() { 
        graph = new mxGraph();
        parent = graph.getDefaultParent();
        layout = new mxHierarchicalLayout(graph, SwingConstants.WEST);
        layout.setLayoutFromSinks(false);
        graph.setDropEnabled(false);
        graph.setBorder(15);
        graph.setAutoOrigin(true);
        graph.setAutoSizeCells(true);
        graph.setCellsBendable(false);
        graph.setCellsCloneable(false);
        graph.setCellsDeletable(false);
        graph.setCellsDisconnectable(false);
        graph.setCellsEditable(false);
        graph.setCellsLocked(true);
        graph.setCellsMovable(false);
        graph.setCellsResizable(false);
        graph.setHtmlLabels(true);
        nodes = new HashMap<String, Object>();
        
        new mxLayoutManager(graph)
        {
            @Override
            public mxIGraphLayout getLayout(Object parent)
            {
                if (graph.getModel().getChildCount(parent) > 0)
                {
                    return layout;
                }
                return null;
            }
        };
        graph.getModel().beginUpdate();
    }
    
    public void addNode(String name){
        Object node = graph.insertVertex(parent, null, name, 20, 20, 80, 30);
        //save the node to a local map
        nodes.put(name, node);
    }
    
    public void addEdge(String name, String sourceName, String targetName){
        Object source = nodes.get(sourceName);
        if(source == null){
            logger.fatal("Graph optimization node "+sourceName+" not found");
        }
        Object target = nodes.get(targetName);
        if(source == null){
            logger.fatal("Graph optimization node "+targetName+" not found");
        }
        graph.insertEdge(parent, null, name, source, target);
    }
    
    public Point getCoordinates(String nodeName){
        //perform optimization if not previously happened
        if(cells == null){
            graph.getModel().endUpdate(); 
            mxGraphComponent graphComponent = new mxGraphComponent(graph);
            Dimension dim = graphComponent.getGraphControl().getMinimumSize();
            cells = graphComponent.getCells(new Rectangle(0,0,(int)dim.getWidth(),(int)dim.getHeight()));
            
            getContentPane().add(graphComponent);
        }
        Point coorindates = new Point(0, 0);
        for(Object cell : cells){
            mxCell currentCell = (mxCell)cell;
            if(currentCell.isVertex() && currentCell.getValue().equals(nodeName)){
                int x = (int)(currentCell.getGeometry().getCenterX()*strechFactor);
                int y = (int)(currentCell.getGeometry().getCenterY()*strechFactor);
                coorindates.setLocation(x,y);
            }
        }
        return coorindates;
    }
}