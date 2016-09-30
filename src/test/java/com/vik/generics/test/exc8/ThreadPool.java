package com.vik.generics.test.exc8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

    private static ExecutorService executor;
    private static int tcount = 1;
    private static final int processors = Runtime.getRuntime().availableProcessors();

    public ThreadPool() {
        executor = Executors.newFixedThreadPool(processors / 2, (runnable) -> {
            final Thread t = new Thread(runnable, "Executors " + (tcount++));
            t.setDaemon(true);
            return t;
        });
    }

    private Runnable createRunnable() {
        return () -> {
            System.out.println(Thread.currentThread().getName() + " : " + System.currentTimeMillis());
        };
    }

    public void execute(final Runnable runnable) {
        // executor.execute(this.createRunnable());
        executor.execute(runnable);
    }
}
