package com.vik.generics.exc8;

import java.util.Comparator;
import java.util.List;

/*
 * Write a generic method to find the maximal element in the range [begin, end) of a list.
 * 
 */

public class Excersie8 {

    public static <T> T findMaxElement(List<T> list, Comparator<T> comp) {

        T max = null;

        if (list.size() > 0) {
            max = list.get(0); // assume first element is max.
        }

        for (T e : list) {
            if (comp.compare(e, max) > 0) {
                max = e;
            }
        }

        return max;
    }

}
