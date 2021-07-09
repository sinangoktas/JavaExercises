package com.main.TDD.StringCalculator;

import org.junit.Assert;
import org.junit.Test;

import java.text.NumberFormat;

public class StringCalculatorTest {

    // The method can take 0, 1 or 2 numbers separated by comma (,).
    @Test(expected = RuntimeException.class)
    public final void whenMoreThan2NumbersAreUsedThenExceptionIsThrown() {
            StringCalculator.provideTwoOrLessNumber("1,2,3");
    }

    @Test
    public final void when2NumbersAreUsedThenNoExceptionIsThrown() {
        StringCalculator.provideTwoOrLessNumber("1,2");
        Assert.assertTrue(true);
    }

    @Test(expected = NumberFormatException.class)
    public final void whenNonNumberIsUsedThenExceptionIsThrown() {
        StringCalculator.provideTwoOrLessNumber("1,X");
    }

    // For an empty string the method will return 0
    @Test
    public final void whenEmptyStringIsUsedThenReturnValueIs0() {
        StringCalculator.provideEmptyString("");

    }

    // Method will return their sum of numbers
    @Test
    public final void whenOneNumberIsUsedThenReturnValueIsThatSameNumber() {
        Assert.assertEquals(7, StringCalculator.sumTwoOrLessNumbers("7"));
    }

    @Test
    public final void whenTwoNumbersAreUsedThenReturnValueIsTheirSum() {
        Assert.assertEquals(5, StringCalculator.sumTwoOrLessNumbers("1,4"));
    }

    // Return sum of any number of numbers
    @Test
    public final void whenMultipleNumberOfNumbersReturnSumOfThem() {
        Assert.assertEquals(24, StringCalculator.sumAnyNumberOfNumbers("2,7,5,4,6"));
    }

    // Negative numbers will throw an exception
    @Test(expected = RuntimeException.class)
    public final void whenNegativeNumberIsUsedThenRuntimeExceptionIsThrown() {
        StringCalculator.throwExceptionForNegativeNumbers("3,-6,15,18,46,33", ",");
    }
    @Test
    public final void whenNegativeNumbersAreUsedThenRuntimeExceptionIsThrown() {
        RuntimeException exception = null;
        try {
            StringCalculator.throwExceptionForNegativeNumbers("3,-6,15,-18,46,33", ",");
        } catch (RuntimeException e) {
            exception = e;
        }
        Assert.assertNotNull(exception);
        Assert.assertEquals("Negatives not allowed: [-6, -18]", exception.getMessage());
    }

    // Numbers bigger than 1000 should be ignored
    @Test
    public final void whenOneOrMoreNumbersAreGreaterThan1000IsUsedThenItIsNotIncludedInSum() {
        Assert.assertEquals(1009, StringCalculator.ignoreNumbersGreaterThan1000("3,1000,1001,6,1234", ","));
    }

}