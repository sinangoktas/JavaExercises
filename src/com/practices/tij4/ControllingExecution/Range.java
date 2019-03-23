package com.practices.tij4.ControllingExecution;

public class Range {

    public static void main(String[] args) {
        System.out.println("1- " + test(6, 6, 4));
        System.out.println("2- " + test(7, 0, 9));
        System.out.println("3- " + test(10, 0, 9));
        System.out.println(test(15, 15, 15));

    }

    static boolean test(int testVal, int begin, int end) {
        int smaller;
        int bigger;
        if (begin < end) {
            smaller = begin;
            bigger = end;
        } else if (begin > end) {
            smaller = end;
            bigger = begin;
        } else {
            throw new IllegalArgumentException("begin, end and testVal can not be all the same");
        }


        return testVal >= smaller && testVal <= bigger;


    }
}
