package com.main.OracleExamples.Generics;

import java.util.Collection;
import java.util.List;

public final class Algorithm {

    // to count the number of elements in a collection that have a specific property
    // (for example, odd integers, prime numbers, palindromes)
    public static <T> int countIf(Collection<T> c, UnaryPredicate<T> p) {

        int count = 0;
        for (T elem : c)
            if (p.test(elem))
                ++count;
        return count;
    }

    // to exchange the positions of two different elements in an array
    public static <T> void swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // to find the maximal element in the range [begin, end) of a list
    public static <T extends Object & Comparable<? super T>>
    T max(List<? extends T> list, int begin, int end) {

        T maxElem = list.get(begin);

        for (++begin; begin < end; ++begin)
            if (maxElem.compareTo(list.get(begin)) < 0)
                maxElem = list.get(begin);
        return maxElem;
    }


    // to find the first integer in a list that is relatively prime to a list of specified integers
    // two integers a and b are relatively prime if gcd(a, b) = 1, where gcd is short for greatest common divisor
    public static <T>
    int findFirst(List<T> list, int begin, int end, UnaryPredicate<T> p) {

        for (; begin < end; ++begin)
            if (p.test(list.get(begin)))
                return begin;
        return -1;
    }

    // x > 0 and y > 0
    public static int gcd(int x, int y) {
        for (int r; (r = x % y) != 0; x = y, y = r) { }
        return y;
    }

}

