package com.vik.generics.test.exc8;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {
    private static BlockingQueue<Integer> numbers = new ArrayBlockingQueue<>(100);
    private static volatile int i = 0;

    public Runnable createProducer() {
        return () -> {
            try {
                while (true) {
                    System.out.println("Producer : " + Thread.currentThread().getName() + " " + i);
                    numbers.put(i++);
                }
            } catch (final InterruptedException e) {
                System.out.println("Exception occured in producer " + e);
            }
        };
    }

    public Runnable createConsumer() {
        return () -> {
            try {
                while (true) {
                    final int val = numbers.take();
                    System.out.println("Consumer " + Thread.currentThread().getName() + " " + val);
                }
            } catch (final InterruptedException e) {
                System.out.println("Exception occured in Consumer " + e);
            }
        };
    }

}
