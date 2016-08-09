package com.vik.generics.exec12;

import java.text.DecimalFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        float number = 1.03f;

        System.out.format("Float value %f %n", number);

        System.out.printf("Flat value %08d %n", 100);

        System.out.format(Locale.UK, "Float Value %f %n", number);

        DecimalFormat format = new DecimalFormat("###,###.###");
        System.out.println(format.format(123456.789));
    }

}
