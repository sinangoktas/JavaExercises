package com.example.idea.ConcurrentProgramming.demo10_LowLevelSynchronization;

import java.util.LinkedList;
import java.util.Random;

public class ProcessorLowLevel {

    private LinkedList<Integer> list = new LinkedList<>();
    private final int LIMIT = 10;

    private Object lock = new Object();

    public void produce() throws InterruptedException {

        int value = 0;
        while (true) {
            synchronized (lock) {
                while (list.size() == LIMIT) {
                    lock.wait(); // lock goes to consume()
                }
                list.add(value++);
                lock.notify(); // notifies the wait in consume()
            }
        }

    }

    public void consume() throws InterruptedException {
        Random random = new Random();
        while (true) {
            synchronized (lock) {
                while (list.size() == 0) {
                    lock.wait(); // lock goes to produce()
                }
                System.out.print("List size is " + list.size());
                int value = list.removeFirst();
                System.out.println("; removed " + value);
                lock.notify(); // notifies the wait in produce()
            }

            Thread.sleep(random.nextInt(1000));
        }
    }

}
