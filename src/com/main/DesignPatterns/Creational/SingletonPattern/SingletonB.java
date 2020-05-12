package com.main.DesignPatterns.Creational.SingletonPattern;

public class SingletonB {
    private static SingletonB obj;
    private SingletonB(){}

    public static SingletonB getSingletonB(){
        if (obj == null){
            synchronized(SingletonB.class){
                if (obj == null){
                    obj = new SingletonB();//instance will be created at request time
                }
            }
        }
        return obj;
    }

    public void doSomething(){
        //write your code
    }
}
