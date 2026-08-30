package com.example.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void shouldAddNumbers() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void shouldSubtractNumbers() {
        assertEquals(6, calculator.subtract(10, 4));
    }

    @Test
    void shouldMultiplyNumbers() {
        assertEquals(30, calculator.multiply(5, 6));
    }

    @Test
    void shouldDivideNumbers() {
        assertEquals(5.0, calculator.divide(10, 2));
    }

    @Test
    void shouldRejectDivisionByZero() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.divide(10, 0));
    }
}
