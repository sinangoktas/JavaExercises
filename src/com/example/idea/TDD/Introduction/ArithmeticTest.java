package com.example.idea.TDD.JUnit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ArithmeticTest {

    Arithmetic myArithmetic = new Arithmetic();

    @Test
    public void testMultiply() {
        assertEquals(4, myArithmetic.multiply(2, 2));
        assertEquals(-15, myArithmetic.multiply(3, -5));
    }

    @Test
    public void testIsPositive() {
        assertTrue(myArithmetic.isPositive(5));
        assertFalse(myArithmetic.isPositive(-5));
        assertFalse(myArithmetic.isPositive(0));
    }
}
