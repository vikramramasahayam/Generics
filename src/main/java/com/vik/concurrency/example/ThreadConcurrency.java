package com.vik.concurrency.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadConcurrency {

    public static void main(String args[]) {

        ExecutorService service = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            Worker worker = new Worker(i);
            // Future f = service.submit(worker);
            // System.out.println(f.isCancelled());
            service.execute(worker);
        }

        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Exception while Sleeping ");
        }

        service.shutdown();

    }

    static class Worker implements Runnable {

        private int number;

        public Worker(int n) {
            this.number = n;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " : " + this.number);
        }

    }

}
