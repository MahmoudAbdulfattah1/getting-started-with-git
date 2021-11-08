package com.git.learn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testAdder_positiveNumbers() {
        // Given
        Main main = new Main();
        int num1 = 5;
        int num2 = 6;

        // When
        int sum = main.adder(num1, num2);

        // Then
        assertEquals(11, sum);
    }
}
