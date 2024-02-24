package com.main.JDK8_MOOC.lambdaExpressions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UsefulMethodsInJDK8 {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");
        myList.add("Grape");
        myList.add("Pear");

        // forEach()
        myList.forEach(s -> System.out.println(s));

        // or use method referencing
        System.out.println(">>>>>>>>>>>>>>>>>");
        myList.forEach(System.out::println);

        // removeIf()
        myList.removeIf(s -> s.length() < 5);
        System.out.println(">>>>>>>>>>>>>>>>>");
        System.out.println(myList);

        // replaceAll()
        myList.replaceAll(s -> s.toUpperCase());
        // or ....
        myList.replaceAll(String::toUpperCase);
        System.out.println(">>>>>>>>>>>>>>>>>");
        System.out.println(myList);

        // sort(Comparator c)
        // replaces Collections.sort(List l, Comparator c)
        myList.add("PEAR");
        myList.sort(Comparator.comparingInt(String::length));
        System.out.println(myList);


    }
}
