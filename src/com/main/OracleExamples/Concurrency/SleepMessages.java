package com.main.OracleExamples.Concurrency;

public class SleepMessages {

    public static void main(String[] args) throws InterruptedException {

        String importantInfo[] = {
                "Crispy Bacon",
                "Salmon Grill",
                "Lentil Soup",
                "Orange Juice"
        };

        for (int i = 0; i < importantInfo.length; i++) {
            // Pause for 3 secs
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // We've been interrupted: no more messages.
                return;
            }
            // Print a message
            System.out.println(importantInfo[i]);

        }
    }
}
