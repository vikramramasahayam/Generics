package com.vik.functional.example;

public class FunctionalExample {

    @FunctionalInterface
    public interface Calculator {
        public int add(int a, int b);
    }

    public static void main(String args[]) {

        Calculator cal = (a, b) -> a + b;
        /*
         * new Calculator() {
         * 
         * @Override public int add(int a, int b) { return a + b; } };
         */
        System.out.println(cal.add(10, 15));
    }
}
