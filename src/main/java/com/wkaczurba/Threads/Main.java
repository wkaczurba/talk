package com.wkaczurba.Threads;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Main {

    public static void doSomethingA() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Parallel task A is running: " + i);
        }
    }

    public static void doSomethingB() {
        System.out.println("Task B has started....");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task B has finished");
    }

    public static void main(String[] args) throws InterruptedException {
        new Thread( () -> doSomethingB()).start();
        new Thread( () -> doSomethingA()).start();

        Thread.sleep(5000); // wait for finish in the main thread.
    }
}
