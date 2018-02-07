package com.example.idea.Interfaces.AbstractVsInterface.Example1;

public interface TwoDimensional {

    double PI = 3.141579; //is public and final

    default double getAngle(TwoDimensional a, TwoDimensional b) /* is public */{

        double alpha = 0.0;

        //do complex calculation here

        //modulus

        //scalar

        //to degrees

        return alpha;

    }

    int getX(); //is public

    int getY();
}
