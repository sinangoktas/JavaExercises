package com.practices.tij4.Initialisation;

/*
Create a class with a String field that is initialized at the point of
definition, and another one that is initialized by the constructor. What is the difference
between the two approaches?
 */

public class StringInitialisation {

    String s1 = "Initialise in the definition";
    private String s2;

    public StringInitialisation(String s) {
        this.s2 = s;
    }

    public static void main(String[] args) {

        StringInitialisation si = new StringInitialisation("Initialise in the constructor");

        System.out.println(si.s1);
        System.out.println(si.s2);

    }


}
