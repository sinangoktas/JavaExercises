package com.example.idea.Java_8_MOOC_Tutorial.lambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

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
        myList.sort((x, y) -> x.length() - y.length());
        System.out.println(myList);


    }
}
