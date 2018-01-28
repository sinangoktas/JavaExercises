package com.example.idea.GenericClasses.genericTypes;

public class PairDemo {
    public static void main(String[] args) {
        String[] names = {"Tom", "Diana", "Harry"};
        Pair<String, Integer> result = firstContaining(names, "a");
        System.out.println(result.getFirst());
        System.out.println("Expected: Diana");
        System.out.println(result.getSecond());
        System.out.println("Expected: 1");


        int[] nums = {6, 27, 8, 19, 20};
        Pair<Integer, Integer> res = firstPrime(nums);
        System.out.println(res.getFirst());
        System.out.println("Expected: 19");
        System.out.println(res.getSecond());
        System.out.println("Expected: 3");
    }

    /**
     * Gets the first String containing a given string, together
     * with its index.
     *
     * @param strings an array of strings
     * @param sub     a string
     * @return a pair (strings[i], i) where strings[i] is the first
     * strings[i] containing str, or a pair (null, -1) if there is no
     * match.
     */
    public static Pair<String, Integer> firstContaining(String[] strings, String sub) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].contains(sub)) {
                return new Pair<>(strings[i], i);
            }
        }
        return new Pair<>(null, -1);
    }

    /**
     * Gets the first prime number, together with its index
     *
     * @param numbers an array of integers
     * @return a pair(numbers[i], i) where numbers[i] is first prime number
     * found at index i, or a pair(-1, -1) if there is no match
     */


    public static Pair<Integer, Integer> firstPrime(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            boolean isPrime = true;
            for (int j = 2; j < numbers[i]; j++) {
                if (numbers[i] % j == 0) {
                    isPrime = false;
                }
            }
            if(isPrime) {
                return new Pair<>(numbers[i], i);
            }
        }
        return new Pair<>(-1, -1);
    }
}
