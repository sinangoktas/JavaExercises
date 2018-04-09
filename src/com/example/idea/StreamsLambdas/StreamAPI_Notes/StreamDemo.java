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


        //Must obtain a new stream because previous call to min()
        //is a terminal operation that consumed the stream.

        myStream = myList.stream();
        Optional<Integer> maxValue = myStream.max(Integer::compare);
        if(maxValue.isPresent())
            System.out.println("Maximum value: " + maxValue.get());

        // Sort the stream by use of sorted().
        Stream<Integer> sortedStream = myList.stream().sorted();

        // Display the sorted stream by the use of forEach().
        System.out.print("Sorted stream: ");
        sortedStream.forEach((n) -> System.out.print(n + " "));
        System.out.println();

        // Display only the odd values by use of filter().
        Stream<Integer> oddVals = myList.stream().sorted()
                .filter((n) -> (n % 2) == 1);
        System.out.print("Odd values: ");
        oddVals.forEach((n) -> System.out.print(n + " "));
        System.out.println();

        // Display only the odd values that are greater than 5. Notice that
        // two filter operations are pipelined.
        oddVals = myList.stream().filter((n) -> (n % 2) == 1)
                .filter((n) -> n > 5);
        System.out.print("Odd values greater than 5: ");
        oddVals.forEach((n) -> System.out.print(n + " "));
        System.out.println();


        // Two ways to obtain the integer product of the elements
        // in myList by use of reduce().

        Optional<Integer> productObj = myList.stream().reduce((a,b) -> (a * b));
        if(productObj.isPresent())
            System.out.println("Product as Optional: " + productObj.get());

        // Note that identity value for multiplication is 1
        int product = myList.stream().reduce(1, (a, b) -> (a * b));
        System.out.println("Product as int: " + product);

        int evenProduct = myList.stream().reduce(1, (a, b) -> {
                                if(b % 2 == 0) return a * b; else return a;
        });
        System.out.println("Even product as int: " + evenProduct);

        // Parallel streams

        Optional<Integer> productObj2 = myList.parallelStream().reduce((a, b) -> (a * b));
        System.out.println("Product as Optional: " + productObj.get());


        // Look up combiners and accumulators in parallel streams
        int parallelProduct = myList.parallelStream()
                .reduce(1, (a,b) -> a * b, (a,b) -> (a * b));
        System.out.println("Product as int: " + parallelProduct);

        double productOfSquareRoots = myList.parallelStream().
                            reduce(1.0, (a, b) -> a * Math.sqrt(b), (a, b) -> a * b);
        System.out.println("Product of square roots: " + productOfSquareRoots);


    }
}
