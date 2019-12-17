package com.main.ConcurrentProgramming.demo13_Semaphores;

import java.util.concurrent.Semaphore;

public class Connection {

    private static Connection instance = new Connection();
    private Semaphore sem = new Semaphore(10, true);
    private int connections = 0;

    private Connection() {

    }

    public static Connection getInstance() {
        return instance;
    }

    public void connect() {

        try {
            sem.acquire(); // acquires permit before it can run
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            doConnect();
        } finally {
            sem.release();
        }

    }

    public void doConnect() {

        synchronized (this) {
            connections++;
            System.out.println("Current connections: " + connections);
        }

        // separating methods - connect(), doConnect() guaranties that
        // remaining of the code will be executed if an exception thrown
        // in the below try-catch block
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (this) {
            connections--;
        }

    }
}
