package com.practices.tij4.ReusingClasses;

public class InheritedOverloading extends ParentOverload {

    void action(String i){
        System.out.println(i);
    }

    public static void main(String[] args) {
        InheritedOverloading x = new InheritedOverloading();
        x.action("str");
        x.action(112);
        x.action(true);
        x.action('s');

    }



}


class ParentOverload {

    void action(int i){
        System.out.println(i);
    }

    void action(boolean i){
        System.out.println(i);
    }

    void action(char i){
        System.out.println(i);
    }

}
