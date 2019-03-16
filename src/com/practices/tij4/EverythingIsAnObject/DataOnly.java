package com.practices.tij4.EverythingIsAnObject;

public class DataOnly {

    int i = 2;
    double d = 5.5;
    boolean b = true;

    public void printData() {
        System.out.println(i);
        System.out.println(d);
        System.out.println(b);
    }

    public static void main(String[] args) {
        DataOnly dataOnly = new DataOnly();
        dataOnly.printData();

    }
}
