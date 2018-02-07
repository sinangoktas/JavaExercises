package com.example.idea.TDD.Introduction;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(value = Suite.class)
@Suite.SuiteClasses(value = {
        ArithmeticTest.class,
        CounterTest.class,
        MyProgramTest.class,
        PersonTest.class

})
public class AllTestsSuite {
}
