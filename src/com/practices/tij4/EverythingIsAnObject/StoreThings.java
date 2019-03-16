package com.practices.tij4.EverythingIsAnObject;

public class StoreThings {

    int store(String s) {
        return s.length() * 2;
    }

    public static void main(String[] args) {

        StoreThings storeThings = new StoreThings();
        System.out.println(storeThings.store("Java"));
    }
}
