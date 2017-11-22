package com.uci.wirelessdatatranser;

/**
 * Created by chris on 10/3/17.
 */

public class XYValue {
    private double x;
    private double y;

    public XYValue(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}