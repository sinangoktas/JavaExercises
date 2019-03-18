package com.practices.tij4.EverythingIsAnObject;

public class AutoBoxing {

    public static void main(String[] args) {

        Byte byteObject = 1;
        byte bytePrimitive = byteObject;
        System.out.println(bytePrimitive);

        Float floatObject = 2.2f;
        float floatPrimitive = floatObject;
        System.out.println(floatPrimitive);

        Character charObject = 'a';
        char charPrimitive = charObject;
        System.out.println(charPrimitive);

        Short shortObject = 1;
        short shortPrimitive = shortObject;
        System.out.println(shortPrimitive);

        Integer intObject = 1;
        int intPrimitive = intObject;
        System.out.println(intPrimitive);

        Long longObject = 1L;
        long longPrimitive = longObject;
        System.out.println(longPrimitive);

        Double doubleObject = 1.1;
        double doublePrimitive = doubleObject;
        System.out.println(doublePrimitive);



    }
}
