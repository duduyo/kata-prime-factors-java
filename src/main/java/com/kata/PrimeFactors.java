package com.kata;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;

public class PrimeFactors {
    public List<Integer> factorsOf(Integer n) {

        if (n  == 2) {
            return asList(2);
        }
        return emptyList();
    }
}
