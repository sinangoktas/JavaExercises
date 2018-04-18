package com.example.idea.TDD.StringCalculator;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

    public static void provideTwoOrLessNumber(String numbers) {
        String[] numbersArray = numbers.split(",");
        if(numbersArray.length > 2 ) {
            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
        }else {
            for(String number : numbersArray) {
                Integer.parseInt(number);
            }
        }
    }

    public static int provideEmptyString(String numbers) {
        String[] numbersArray = numbers.split(",");
        if(numbersArray.length > 2 ) {
            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
        }else {
            for(String number : numbersArray) {
                if(!number.isEmpty()) {
                    Integer.parseInt(number);
                }
            }
        }
        return 0;
    }

    public static int sumTwoOrLessNumbers(String numbers) {
        int sum = 0;
        String[] numbersArray = numbers.split(",");
        if(numbersArray.length > 2 ) {
            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
        }
        for(String number : numbersArray) {
            if(!number.trim().isEmpty()) {
                sum += Integer.parseInt(number);
            }
        }
        return sum;

    }

    public static int sumAnyNumberOfNumbers(String numbers) {
        int sum = 0;
        String[] numbersArray = numbers.split(",");
        for(String number : numbersArray) {
            if(!number.trim().isEmpty()) {
                sum += Integer.parseInt(number);
            }
        }
        return sum;
    }

    public static int throwExceptionForNegativeNumbers(final String numbers, final String delimiter) {
        int returnValue = 0;
        String[] numbersArray = numbers.split(delimiter);
        List negativeNumbers = new ArrayList();
        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) {
                int numberInt = Integer.parseInt(number.trim());
                if (numberInt < 0) {
                    negativeNumbers.add(numberInt);
                }
                returnValue += numberInt;
            }
        }
        if (negativeNumbers.size() > 0) {
            throw new RuntimeException("Negatives not allowed: " + negativeNumbers.toString());
        }
        return returnValue;
    }

    public static int ignoreNumbersGreaterThan1000(final String numbers, final String delimiter) {
        int returnValue = 0;
        String[] numbersArray = numbers.split(delimiter);
        List negativeNumbers = new ArrayList();
        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) {
                int numberInt = Integer.parseInt(number.trim());
                if (numberInt < 0) {
                    negativeNumbers.add(numberInt);
                } else if (numberInt <= 1000) {
                    returnValue += numberInt;
                }
            }
        }
        if (negativeNumbers.size() > 0) {
            throw new RuntimeException("Negatives not allowed: " + negativeNumbers.toString());
        }
        return returnValue;
    }
}