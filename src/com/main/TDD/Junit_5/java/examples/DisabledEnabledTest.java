package com.main.TDD.Junit_5.java.examples;

import com.main.TDD.Junit_5.java.listeners.Listener;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.api.extension.ExtendWith;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

@ExtendWith(Listener.class)
public class DisabledEnabledTest {

    @Test
    @Disabled(value = "Disabled for demo of @Disabled")
    void firstTest() {
        System.out.println("This is the first test method");
    }

    @Test
    @DisabledOnOs(value = OS.LINUX)
    void secondTest() {
        System.out.println("This is the second test method");
    }

    @Test
    @DisabledIfSystemProperty(named = "env", matches = "staging")
    void thirdTest() {
        System.out.println("This is the third test method");
    }

    @Test
    @DisabledIf(value = "provider")
    void fourthTest() {
        System.out.println("This is the fourth test method");
    }

    @Test
    void fifthTest() {
        System.out.println("This is the fifth test method");
    }

    boolean provider() {
        return LocalDateTime.now().getDayOfWeek().equals(DayOfWeek.FRIDAY);
    }
}
