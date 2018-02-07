package com.example.idea.TDD.JUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyProgramTest {

    MyProgram program;
    int someVariable;

    @Before
    public void setUp() {
        program = new MyProgram();
        someVariable = 100;
    }

    @Test
    public void testMethod() {

    }

    @Test
    public void testAnotherMethod() {

    }

    @After
    public void tearDown() {

    }
}
