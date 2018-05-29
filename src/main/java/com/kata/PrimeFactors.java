package com.kata;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public List<Integer> factorsOf(Integer n) {

        List<Integer> integers = new ArrayList<>();

        while (n % 2 == 0) {
            integers.add(2);
            n /= 2;
        }
        return integers;
    }
}
