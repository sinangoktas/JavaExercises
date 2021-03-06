package com.main.TDD.Introduction;

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
        assertFalse(myArithmetic.isPositive(-101));
        assertTrue(myArithmetic.isPositive(1001));
    }
}
