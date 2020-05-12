package com.main.DesignPatterns.Creational.FactoryPattern;

public class TestFactoryPattern {

    public static void main(String[] args) {
        System.out.println(CarFactory.buildCar(CarType.LUXURY));
        System.out.println(CarFactory.buildCar(CarType.SMALL));
        System.out.println(CarFactory.buildCar(CarType.SEDAN));

    }
}
