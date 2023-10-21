package com.main;

import java.util.HashSet;
import java.util.Set;

public class App {

    private static int count;
    public App() {
        count++;

    }

    public static int getCount() {
        return App.count;
    }

    public static void main(String[] args) {

        Set<Integer> my_set = new HashSet<>();
        my_set.add(1);
        my_set.add(2);
        my_set.add(2);
        System.out.println(my_set);



        }
    }




