package com.vik.generics.exc9;

public class Singleton<T> {

    /*
     * Cann't create static field of type
     * 
     */
    // private static T instance = null;

    private T instance = null;

    public T getInstance(Class<T> clazz) throws InstantiationException, IllegalAccessException {
        if (instance == null) {
            instance = clazz.newInstance();
        }
        return instance;
    }
}
