package com.practices.tij4.EverythingIsAnObject;

public class DataOnly2 {

    int i;
    double d;
    boolean b;

    public void printData() {
        System.out.println(i);
        System.out.println(d);
        System.out.println(b);
    }

    public static void main(String[] args) {
        DataOnly2 dataOnly = new DataOnly2();
        dataOnly.i = 5;
        dataOnly.d = 6.6;
        dataOnly.b = false;
        dataOnly.printData();

    }
}
