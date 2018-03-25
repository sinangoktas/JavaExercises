package com.example.idea.StreamsLambdas.StreamAPI_Notes;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);

        System.out.println("Original list: " + myList);

        // Obtain a Stream to the array list.
        Stream<Integer> myStream = myList.stream();

        // Obtain the minimum and maximum value by uses of min(),
        // max(), isPresent(), and get().

        Optional<Integer> minVal = myStream.min(Integer::compare);
        if(minVal.isPresent())
            System.out.println("Minimum value: " + minVal.get());

    }
}
