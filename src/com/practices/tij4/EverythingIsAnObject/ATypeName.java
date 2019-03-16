package com.practices.tij4.EverythingIsAnObject;

public class ATypeName {

    int i;
    String s;

    void show() {
        System.out.println(i);
        System.out.println(s);
    }

    public static void main(String[] args) {
        ATypeName atn = new ATypeName();
        atn.i = 5;
        atn.s = "that";
        atn.show();
    }


}
