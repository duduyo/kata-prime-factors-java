package com.kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ApplicationTest {

    private Application application = new Application();

    @Test
    public void sayHello() {
        // Given
        String expected = "Hello";

        // When
        String result = application.sayHello();

        // Then
        assertThat(result).isEqualTo(expected);
    }

}