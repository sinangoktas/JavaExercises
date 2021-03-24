package com.main.OracleExamples.Collections;

import java.util.HashSet;
import java.util.Set;

public class FindDups {

    public static void main(String[] args) {

        String[] arr = new String[] {"sinan", "ali", "devrim", "ali"};

        Set<String> s = new HashSet<>();
        for (String a : arr)
            s.add(a);
        System.out.println(s.size() + " distinct words: " + s);

        //  modify it to use a SortedSet instead of a Set.
        //  Specify a Comparator so that case is ignored when sorting and identifying set elements


    }
}
