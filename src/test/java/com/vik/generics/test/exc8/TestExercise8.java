package com.vik.generics.test.exc8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

import com.vik.generics.exc8.Excersie8;

public class TestExercise8 {

    @Test
    public void testFindMaxElement() {
        List<Integer> numbers = Arrays.asList(1, 30, 30, 20, 9);

        Integer maxval = Excersie8.findMaxElement(numbers, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                Integer result = 0;
                if (o1.compareTo(o2) > 0) {
                    result = 1;
                } else if (o1.compareTo(o2) < 0) {
                    result = -1;
                }
                return result;
            }

        });

        System.out.println(maxval);
    }

}
