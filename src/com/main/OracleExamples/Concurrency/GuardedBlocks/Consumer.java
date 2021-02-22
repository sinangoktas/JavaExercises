package com.main.OracleExamples.Concurrency.GuardedBlocks;

import java.util.Random;

public class Consumer implements Runnable {

    // The consumer thread, defined in Consumer, simply retrieves the messages and prints them out,
    // until it retrieves the "DONE" string. This thread also pauses for random intervals.

    private Drop drop;

    public Consumer(Drop drop) {
        this.drop = drop;
    }

    public void run() {
        Random random = new Random();
        for (String message = drop.take();
             ! message.equals("DONE");
             message = drop.take()) {
            System.out.format("MESSAGE RECEIVED: %s%n", message);
            try {
                Thread.sleep(random.nextInt(5000));
            } catch (InterruptedException e) {}
        }
    }
}
