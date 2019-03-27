package com.practices.tij4.Initialisation;

public class OverloadedDog {

    private String name;

    public OverloadedDog(String name) {
        this.name = name;
    }


    public void bark(int age) {
        if (age < 2) {
            System.out.println(this.name + " says: Mueeewww");
        } else {
            System.out.println(this.name + " says: Hoaaawww");

        }


    }


    public void bark(boolean canBark) {
        if (canBark == true) {

            System.out.println(this.name + " says: Barkbark");

        } else {
            System.out.println(this.name + " says: Zzzzzz");
        }

    }

    public static void main(String[] args) {

        OverloadedDog dog = new OverloadedDog("Bobby");
        dog.bark(1);
        dog.bark(true);
        dog.bark(3);
        dog.bark(false);


    }

}
