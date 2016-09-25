package com.vik.generics.test.exc8;

import java.util.Properties;

public class PrintSystemProperties {

    public static void main(final String[] args) {
        final Properties properties = System.getProperties();

        properties.keySet().stream().forEach((obj) -> {
            final String key = (String) obj;
            System.out.println("Key : " + key + " Value is : " + properties.getProperty(key));
        });
    }

}
