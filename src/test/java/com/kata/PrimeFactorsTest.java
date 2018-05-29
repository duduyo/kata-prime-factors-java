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
    void should_return_factors_for_power_of_2() {
        assertThat(primeFactors.factorsOf(2)).containsExactlyInAnyOrder(2);
        assertThat(primeFactors.factorsOf(2*2)).containsExactlyInAnyOrder(2, 2);
        assertThat(primeFactors.factorsOf(2*2*2)).containsExactlyInAnyOrder(2, 2, 2);
    }

    @Test
    void should_return_factors_for_power_of_3() {
        assertThat(primeFactors.factorsOf(3)).containsExactlyInAnyOrder(3);
        assertThat(primeFactors.factorsOf(3*3)).containsExactlyInAnyOrder(3, 3);
        assertThat(primeFactors.factorsOf(3*3*3)).containsExactlyInAnyOrder(3, 3, 3);
    }

    @Test
    void should_return_factors_for_power_of_5() {
        assertThat(primeFactors.factorsOf(5)).containsExactlyInAnyOrder(5);
        assertThat(primeFactors.factorsOf(5*5)).containsExactlyInAnyOrder(5, 5);
        assertThat(primeFactors.factorsOf(5*5*5)).containsExactlyInAnyOrder(5, 5, 5);
    }


    @Test
    void should_return_factors_for_30() {
        assertThat(primeFactors.factorsOf(30)).containsExactlyInAnyOrder(2, 3, 5);
    }


    @Test
    void should_return_factors_for_big_number() {
        assertThat(primeFactors.factorsOf(43961)).containsExactlyInAnyOrder(43961);
    }
}
