package com.kata;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public List<Integer> factorsOf(Integer n) {

        List<Integer> integers = new ArrayList<>();

        Integer primeCandidate = 2;
        while (n % primeCandidate == 0) {
            integers.add(primeCandidate);
            n /= primeCandidate;
        }

        primeCandidate = 3;
        while (n % primeCandidate == 0) {
            integers.add(primeCandidate);
            n /= primeCandidate;
        }

        return integers;
    }
}
