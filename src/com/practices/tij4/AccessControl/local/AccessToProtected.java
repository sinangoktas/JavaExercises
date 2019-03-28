package com.practices.tij4.AccessControl.local;

public class AccessToProtected {

    public static void main(String[] args) {
        AccessControl accessControl = new AccessControl();
        accessControl.protectedMethod();
    }
}
