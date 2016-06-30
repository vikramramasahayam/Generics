package com.vik.generics.exc3;

/*
 * Write a generic method to exchange the positions of two different elements in an array.
 */
public class Exercise3 {

    public static <T> T[] exchange(T arr[], int pos1, int pos2) {

        T e = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = e;

        return arr;
    }
}
