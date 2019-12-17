package com.main.ConcurrentProgramming.demo9_WaitNotify;

import java.util.Scanner;

public class Processor {

    public void produce() throws InterruptedException {

        synchronized (this) {
            System.out.println("Producer thread running ...");
            wait(); // will wait until it gets notified
            System.out.println("Resumed.");
        }
    }

    public void consume() throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        Thread.sleep(2000);

        synchronized (this) {
            System.out.println("Waiting for return key.");
            scanner.nextLine();
            System.out.println("Return key pressed.");
            notify();
            Thread.sleep(5000); // will wait before notifying produce()
        }
    }
}
