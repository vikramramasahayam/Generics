package com.vik.generics.test.exc3;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

import com.vik.generics.exc3.Exercise3;

public class TestExercise3 {

    @Test
    public void testExchange() {
        String names[] = { "One", "Two", "Three" };
        names = Exercise3.exchange(names, 0, 1);
        Collection<String> names_list = Arrays.asList(names);
        System.out.println(names_list);
    }

}
