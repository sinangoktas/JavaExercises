package com.example.idea.ExceptionHandling;

public class ExceptionHandling {

    public static void main(String[] args) {

        String s = "abc 1";
        int n = Integer.parseInt(s);
        System.out.println(n);


        String s2 = null;
        int n2 = s2.length();
        System.out.println(n2);


    }
}
