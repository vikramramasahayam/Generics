package com.vik.generics.exc7;

import java.util.List;

public class Excersie7 {
    public static void print(List<? extends Number> list) {
        for (Number n : list) {
            System.out.println(n + "");
            System.out.println();
        }
    }
}
