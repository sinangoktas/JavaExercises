package com.example.idea.StreamsLambdas.streamAPI_Notes;

import java.util.ArrayList;

//Demonstrate the use of a combiner with reduce()

public class StreamDemo_Parallel {

    public static void main(String[] args) {

        // This is now a list of double values.
        ArrayList<Double> myList = new ArrayList<>();
        myList.add(7.0);
        myList.add(18.0);
        myList.add(10.0);
        myList.add(24.0);
        myList.add(17.0);
        myList.add(5.0);
        double productOfSqrRoots = myList.parallelStream().reduce(1.0,
                (a, b) -> a * Math.sqrt(b), (a, b) -> a * b);
        System.out.println("Product of square roots: " + productOfSqrRoots);

        // This won’t work
        double productOFSqrRoots2 = myList.parallelStream()
                .reduce(1.0, (a,b) -> a * Math.sqrt(b));

        // You can switch a parallel stream to sequential by calling the sequential() method

        /* Stream can be either ordered or unordered
        In general, if the data source is ordered, then the stream will also be ordered.
        However, when using a parallel stream, a performance boost can sometimes be obtained by allowing a stream to be unordered.
        When a parallel stream is unordered, each partition of the stream can be operated on independently,
        without having to coordinate with the others. In cases in which the order of the operations does not matter,
        it is possible to specify unordered behaviour by calling the unordered() method

        The forEach() method may not preserve the ordering of a parallel stream.
        If you want to perform an operation on each element in a parallel stream while preserving the order,
        consider using forEachOrdered()

        */

    }
}
