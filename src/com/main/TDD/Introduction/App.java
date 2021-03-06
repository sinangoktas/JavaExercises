package com.main.TDD.Introduction;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class App {

    int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    @Test
    public void max() {
        assertEquals(7, max(7, 3));
        assertEquals(3, max(3, -7));
    }

    void testMax() {
        int x = max(3, 7);
        if (x != 7) {
            System.out.println("max(3, 7) gives " + x);
        }
        x = max(3, -7);
        if (x != 3) {
            System.out.println("max(3, -7) gives " + x);
        }
        else {
            System.out.println("say goodbye ...");
        }
    }

    public static void main(String[] args) {
        new App().testMax();
    }
}
