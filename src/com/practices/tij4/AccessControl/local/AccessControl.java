package com.practices.tij4.AccessControl.local;

public class AccessControl {

    public int i4;
    protected int i3;
    /*package-private*/
    int i2;
    private int i1;

    static int i5;

    public static void main(String[] args) {
        // to call non-static fields from static main, you need to initialise the object
        AccessControl accessControl = new AccessControl();
        accessControl.i1 = 1;
        accessControl.i2 = 2;
        accessControl.i3 = 3;
        accessControl.i4 = 4;

        // static field can be called without initialising a class object
        System.out.println(i5);

        accessControl.privateMethod();
        accessControl.packagePrivateMethod();
        accessControl.protectedMethod();
        accessControl.publicMethod();
    }

    private void privateMethod() {
        System.out.println("privateMethod");
    }

    /*package-private*/
    void packagePrivateMethod() {
        System.out.println("packagePrivateMethod");
    }

    protected void protectedMethod() {
        System.out.println("protectedMethod");
    }

    public void publicMethod() {
        System.out.println("publicMethod");
    }

}
