package com.vik.generics.test.exc1;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

import com.vik.generics.exc1.Exercise1;
import com.vik.generics.exc1.OddPredicate;

public class TestExercise1 {

    @Test
    public void testCountProperty() {
        Exercise1 exc1 = new Exercise1();

        Collection<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        System.out.println("Count is : " + exc1.countProperty(numbers, new OddPredicate()));
    }

}
