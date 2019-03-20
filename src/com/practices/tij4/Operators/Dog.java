package com.practices.tij4.Operators;

public class Dog {

    private String name;
    private String says;

    public Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Spot", "I say ruff");
        Dog dog2 = new Dog("Scruffy", "I say wurf");

        System.out.println(dog1.name + ": " + dog1.says);
        System.out.println(dog2.name + ": " + dog2.says);

        Dog dog3 = new Dog("Another dog", "I am new dog");

        dog3 = dog1;

        // == is an operator, reference comparison
        // equals() is a method, by default compares the reference
        // unless overridden to compare the content

        System.out.println(dog3 == dog1);
        System.out.println(dog3.equals(dog1));


    }


}
