package com.main.OracleExamples.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDups {

    public static void main(String[] args) {

        String[] arr = new String[] {"sinan", "ali", "devrim", "ali"};
        List<String> dups = new ArrayList<>();
        Set<String> s = new HashSet<>();

        for (String a : arr)
            if (s.contains(a)) {
                dups.add(a);
        } else {
                s.add(a);
            }

        System.out.println(dups.size() + " duplicate words: " + dups);
        System.out.println(s.size() + " distinct words: " + s);

        //  Modify it to use a SortedSet instead of a Set.
        //  Specify a Comparator so that case is ignored when sorting and identifying set elements

    }
}
