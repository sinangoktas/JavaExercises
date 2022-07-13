package com;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class App {

    public static void main(String[] args) {

//        anyColl(new ArrayList<>());
        anyColl(new HashSet<>());


    }


    public static void anyColl(Collection<String> coll) {

        coll.add("Sinan");
        System.out.println(coll);
        coll.add("Jane");
        System.out.println(coll);
        coll.add("Adam");
        System.out.println(coll);

    }

}

