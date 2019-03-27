package com.practices.tij4.Initialisation;

public class ObjectReferences {

    public ObjectReferences(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        ObjectReferences[] objectReferences = new ObjectReferences[3];
        for (int i = 0; i < objectReferences.length; i++) {
            objectReferences[i] = new ObjectReferences(String.format("%s", i));

        }
    }
}
