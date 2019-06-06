package com.practices.tij4.ReusingClasses;

public class Detergent extends Cleanser { // Inheritance >> Is-A relation

    @Override
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub(); // call super class version
    }
    public void foam() {
        append(" foam()");
    }

    public static void main(String[] args) {
        Detergent detergent = new Detergent();
        detergent.dilute();
        detergent.apply();
        detergent.scrub();
        detergent.foam();
        System.out.println(detergent);
        System.out.println("Testing super class");
        Cleanser.main(args);
    }

}

class Cleanser {

    private String s = "Cleanser";

    public void append(String a) {
        s += a;
    }
    public void dilute() {
        append(" dilute()");
    }
    public void apply() {
        append(" apply()");
    }
    public void scrub() {
        append(" scrub()");
    }

    @Override
    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser cleanser = new Cleanser();
        cleanser.dilute();
        cleanser.apply();
        cleanser.scrub();
        System.out.println(cleanser);
    }

 }


 class DetergentDelegation {


    Cleanser cleanser = new Cleanser(); // Composition >>> Has-A relation

    public static void main(String[] args) {

        Cleanser.main(args); // Composition

        // Delegation (between composition and inheritance)
        // Exposing all the member object methods (this is delegation rather than inheritance)

        DetergentDelegation dd =  new DetergentDelegation(); // Delegation
        dd.dilute();
        dd.apply();
        dd.scrub();
        System.out.println(dd);


    }

    // Delegated methods
    public void append(String a) {
        cleanser.append(a);
    }

    public void dilute() {
        cleanser.dilute();
    }

    public void apply() {
        cleanser.apply();
    }

    public void scrub() {
        cleanser.scrub();
    }

    @Override
    public String toString() {
        return cleanser.toString();
    }
 }
