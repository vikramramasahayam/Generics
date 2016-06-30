package com.vik.generics.exc1;

import java.util.function.Predicate;

public class OddPredicate implements Predicate<Integer> {

    @Override
    public boolean test(Integer t) {
        return (t % 2 == 0) ? false : true;
    }

    /*
     * @Override public boolean test(Integer t) { boolean result = false; if (t % 2 == 0) { result = false; } else { result = true; } return result; }
     */

}
