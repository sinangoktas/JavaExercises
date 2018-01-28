package com.example.idea.Recursion;

public class DemoRecursion {

    private static int[] precalculated = null;

    public static int fib(int n) {
        if (precalculated == null) {
            initPrecalculatedArray(n);
        }
        if (precalculated[n-1] != -1) {
            return precalculated[n-1];
        } else {
            int result = fib(n-1) + fib(n-2);
            precalculated[n-1] = result;
            return result;
        }
    }
    private static void initPrecalculatedArray(int size) {
        precalculated = new int[size];
        for (int i = 0; i < precalculated.length; i++) {
            precalculated[i] = -1; // to indicate "not calculated yet"
        }
        precalculated[0] = 1; // F(1)
        precalculated[1] = 1; // F(2)
    }

    public static void main(String[] args) {

        // long start = System.currentTimeMillis();
           System.out.println(fib(5));
        // long end = System.currentTimeMillis();
        // long duration = end - start;

        // exponential growth in run time
        // System.out.println(duration);
        // System.out.println(precalculated[5]);
    }

}


/*  very slow option

public static int fib(int n) {
        if ((n == 1) || (n == 2)) {
            return 1;
        } else {
            int result = fib(n - 1) + fib(n - 2);
            return result;
        }
    }
*/


/*   much better

    private static int[] precalculated = null;

    public static int fib(int n) {
        if (precalculated == null) {
            precalculated = new int[n];
            for (int i = 0; i < precalculated.length; i++) {
                precalculated[i] = -1; // to indicate "not calculated yet"
            }
        }
        if ((n == 1) || (n == 2)) {
            return 1;
        } else {
            if (precalculated[n - 1] != -1) {
                return precalculated[n - 1];
            } else {
                int result = fib(n - 1) + fib(n - 2);
                precalculated[n - 1] = result;
                return result;
            }
        }
    }
 */


