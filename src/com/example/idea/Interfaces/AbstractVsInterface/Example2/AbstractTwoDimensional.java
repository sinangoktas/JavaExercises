package com.example.idea.Interfaces.AbstractVsInterface.Example2;

public abstract class AbstractTwoDimensional implements TwoDimensional {

    private int x;

    private int y;

    @Override

    public final double getAngle(TwoDimensional other) {

        double a = calcModulus(x, y);

        double b = calcModulus(other.getX(), other.getY());

        double s = scalar(other.getX(), other.getY());

        return toDegrees(s, a, b);

    }

    @Override

    public final int getX() {

        return x;

    }

    @Override

    public final int getY() {

        return y;

    }

    protected void setX(int x) {

        this.x = x;

    }

    protected void setY(int y) {

        this.y = y;

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
}
