package com.main.OracleExamples.Concurrency.GuardedBlocks;

import java.util.Random;

public class Producer implements Runnable {

    // The producer thread, defined in Producer, sends a series of familiar messages.
    // The string "DONE" indicates that all messages have been sent.
    // To simulate the unpredictable nature of real-world applications,
    // the producer thread pauses for random intervals between messages.

    private Drop drop;

    public Producer(Drop drop) {
        this.drop = drop;
    }

    public void run() {
        String importantInfo[] = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
        };
        Random random = new Random();

        for (int i = 0;
             i < importantInfo.length;
             i++) {
            drop.put(importantInfo[i]);
            try {
                Thread.sleep(random.nextInt(5000));
            } catch (InterruptedException e) {}
        }
        drop.put("DONE");
    }
}
