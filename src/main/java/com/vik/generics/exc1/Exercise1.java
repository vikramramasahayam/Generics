package com.vik.generics.exc1;

import java.util.Collection;
import java.util.function.Predicate;

/*
 * Write a generic method to count the number of elements in a 
 * collection that have a specific property (for example, odd integers, prime numbers, palindromes).
 */
public class Exercise1 {

    public static <T> int countProperty(Collection<T> collection, Predicate<T> p) {
        return (int) collection.stream().filter(p).count();
    }

    /*
     * public static <T> int countProperty(Collection<T> collection, Predicate<T> p) { int count = 0; for (T e : collection) { if (p.test(e)) { count++; } }
     * 
     * return count; }
     */
}
