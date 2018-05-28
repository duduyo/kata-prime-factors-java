package com.kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PrimeFactorsTest {

    @Test
    void should_return_no_factors_for_1() {
        PrimeFactors primeFactors = new PrimeFactors();
        assertThat(primeFactors.factorsOf(1)).isEmpty();
    }

    @Test
    void should_return_factors_for_2() {
        PrimeFactors primeFactors = new PrimeFactors();
        assertThat(primeFactors.factorsOf(2)).containsExactlyInAnyOrder(2);

    }
}
