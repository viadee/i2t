package de.viadee.i2t;

import java.awt.Point;

import de.viadee.i2t.interfaces.I2TGraphLayoutOptimization;

public class I2TGraphLayoutOptimizationImplMock implements I2TGraphLayoutOptimization {

    public void addEdge(String name, String sourceName, String targetName) {
    }

    public void addNode(String name) {
    }

    public Point getCoordinates(String nodeName) {
        return new Point(0,0);
    }
}