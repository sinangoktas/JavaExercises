package com.practices.tij4.Operators;

public class CompareStrings {

    public static void main(String[] args) {
        compare("Hello", "World");
        compare("Rojava", "Rojava");
    }

    static void compare(String s1, String s2) {
        System.out.println(String.format("%s == %s :%b", s1, s2, s1 == s2));
        System.out.println(String.format("%s != %s :%b", s1, s2, s1 != s2));
        System.out.println(String.format("%s equals %s :%b", s1, s2, s1.equals(s2)));
    }
}
