package com.kata;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public List<Integer> factorsOf(Integer n) {

        List<Integer> integers = new ArrayList<>();

        for (Integer primeCandidate = 2; primeCandidate <= n; primeCandidate++)
            for (;n % primeCandidate == 0;n /= primeCandidate)
                integers.add(primeCandidate);

        return integers;
    }
}
