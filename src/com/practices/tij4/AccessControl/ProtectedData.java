package com.practices.tij4.AccessControl;

 class ProtectedData {

    protected String s;

    public ProtectedData(String s) {
        this.s = s;
        System.out.println(s);
    }
}

class ManipulateProtectedData {
    public static void main(String[] args) {
        new ProtectedData("Manipulated");

    }
}


