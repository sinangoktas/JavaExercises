package com.main.DesignPatterns.Creational.SingletonPattern;

public class SingletonA {
    private static SingletonA obj=new SingletonA();//Early, instance will be created at load time
    private SingletonA(){}

    public static SingletonA getSingletonA(){
        return obj;
    }

    public void doSomething(){
        //write your code
    }
}
