package com.practices.tij4.Initialisation;

public class OverloadedDog {

    private String name;

    public OverloadedDog(String name) {
        this.name = name;
    }


    public void bark(int age, boolean canBark) {

        if(canBark) {
            System.out.println(name + "/" + age + ": Barkbark" );
        } else {
            System.out.println(name + "/" + age + ": Zzzzzzz" );

        }
    }


    public void bark(boolean canBark, int age) {

        if(canBark) {
            System.out.println(name + "/" + age + ": Barkbark" );
        } else {
            System.out.println(name + "/" + age + ": Zzzzzzzz" );

        }
    }

    public static void main(String[] args) {

        OverloadedDog dog = new OverloadedDog("Bobby");
        dog.bark(true, 5);
        dog.bark(false, 2);
        dog.bark(1, false);
        dog.bark(4, true);



    }

}
