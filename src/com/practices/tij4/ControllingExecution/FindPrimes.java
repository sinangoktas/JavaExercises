package com.practices.tij4.ControllingExecution;

public class FindPrimes {

    /*
    Print all prime numbers less than 1000
     */

    public static void main(String[] args) {

        int total = 0;

        /*
        print prime numbers up to 1000
        try i % j == 0 while j < i
        if so; i is not prime, go back to outer and increment i
        if not; go back and increment j
        do this until when j is no longer less than i
        you found the prime i, print it
         */

        outer:
        for (int i = 2; i < 1000; i++) {
            for (int j = 2; j < i; j++) {
                if ((i % j) == 0) {
                    continue outer;
                }
            }

            total = total + i;
            System.out.println(i);
        }

        System.out.println(total);

    }
}
