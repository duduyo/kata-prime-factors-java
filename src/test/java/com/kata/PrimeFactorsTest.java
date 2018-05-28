package com.kata;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PrimeFactorsTest {

    @Test
    void should_return_no_factors_for_1() {
        PrimeFactors primeFactors = new PrimeFactors();
        List<Integer> factors =  primeFactors.factorsOf(1);
        assertThat(factors).isEmpty();
    }
}
