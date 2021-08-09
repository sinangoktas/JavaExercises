package com.main.CollectionsFramework.iterateArrayEfficiency;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraysEfficiencyDemo {

    public static boolean useList(String[] arr, String targetValue) {
        return Arrays.asList(arr).contains(targetValue);
    }

    public static boolean useSet(String[] arr, String targetValue) {
        Set<String> set =  new HashSet<>(Arrays.asList(arr));
        return set.contains(targetValue);
    }

    public static boolean useLoop(String[] arr, String targetValue) {
        for(String s: arr) {
            if(s.equals(targetValue)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String[] arr = new String[] {"CD", "BC", "EF", "DE", "AB"};

        //use list
        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            useList(arr, "A");
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("useList: " + duration / 1000000);
       //use set
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            useSet(arr, "A");
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("useSet: " + duration / 1000000);
        //use loop
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            useLoop(arr, "A");
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("useLoop: " + duration / 1000000);

//        Random s = new Random();
//        for(int i=0; i< 1000; i++){
//            arr[i] = String.valueOf(s.nextInt());
//        }
        

    }
}
