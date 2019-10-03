package com.main.Interfaces.AbstractVsInterface.Example1;

public abstract class AbstractTwoDimensional {

    public final double PI = 3.141579;

    private int x;

    private int y;

    public final double getAngle(AbstractTwoDimensional other) {

        double a = calcModulus(x, y);

        double b = calcModulus(other.getX(), other.getY());

        double s = scalar(other.getX(), other.getY());

        return toDegrees(s, a, b);

    }

    private double toDegrees(double s, double a, double b) {

        //compute

        return 0;

    }

    private double calcModulus(int x, int y) {

        //compute...

        return 0;

    }

    private double scalar(int x2, int y2) {

        //compute...

        return 0;

    }

    abstract int getX();

    abstract int getY();

    //some other abstract methods…
}
