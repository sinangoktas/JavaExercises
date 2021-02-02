package com.main.OracleExamples.Generics;

public class OddPredicate implements UnaryPredicate<Integer> {

    // to counts the number of odd integers in an integer lis
    public boolean test(Integer i) {
        return i % 2 != 0;
    }
}
