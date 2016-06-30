package com.vik.generics.exc2;

/*
 * Will the following class compile? If not, why?
 */
public class Excersie2 {

    public static <T> T max(T x, T y) {
        // return x > y ? x : y; // Will give compilation error because ">" operator works for only primitives
        return x;
    }
}
