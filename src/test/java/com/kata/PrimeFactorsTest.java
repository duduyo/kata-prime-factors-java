package com.kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PrimeFactorsTest {

    private PrimeFactors primeFactors;

    @BeforeEach
    void setUp() {
        primeFactors = new PrimeFactors();
    }

    @Test
    void should_return_no_factors_for_1() {
        assertThat(primeFactors.factorsOf(1)).isEmpty();
    }

    @Test
    void should_return_factors_for_2() {
        assertThat(primeFactors.factorsOf(2)).containsExactlyInAnyOrder(2);
    }
}
