package com.vik.generics.test.exc8;

import java.util.function.Function;

public class TestExercise9 {

    public static void main(final String args[]) {
        final Function<Integer, Double> converter = integerValue -> integerValue.doubleValue();
        final Function<String, String> appender = firstname -> firstname.concat("Ramasahayam");

        System.out.println(appender.apply("Vikram "));
    }

}
