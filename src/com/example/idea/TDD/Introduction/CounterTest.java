package com.example.idea.TDD.Introduction;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CounterTest {

    Counter counter1;

    @Before
    public void setUp() {
        counter1 = new Counter();
    }

    @Test
    public void testIncrement() {
        assertTrue(counter1.increment() == 1);
        assertTrue(counter1.increment() == 2);

    }

    @Test
    public void testDecrement() {
        assertTrue(counter1.decrement() == -1);

    }
}
