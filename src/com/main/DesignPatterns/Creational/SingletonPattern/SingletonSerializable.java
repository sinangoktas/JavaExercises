package com.main.DesignPatterns.Creational.SingletonPattern;

import java.io.Serial;
import java.io.Serializable;

public class SingletonSerializable implements Serializable {

    //your code of singleton
    private static SingletonSerializable obj=new SingletonSerializable();
    private SingletonSerializable(){}

    public static SingletonSerializable getSingletonSerializable(){
        return obj;
    }

    public void doSomething(){
        //write your code
    }

    // enforce singleton
    @Serial
    protected Object readResolve() {
         return getSingletonSerializable();
    }
}
