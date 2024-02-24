package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void fibonacciShouldRaiseExceptionIfNumberIsNegative() {
        assertThrows(IllegalArgumentException.class,()-> Fibonacci.fibonacci(-1));
    }
    @Test
    void fibonacciShouldReturnZeroIfNumberIsZero(){
        assertEquals(0,Fibonacci.fibonacci(0));
    }
    @Test
    void fibonacciShouldReturnOneIfNumberIsOne(){
        assertEquals(1,Fibonacci.fibonacci(1));
    }
    @Test
    void fibonacciShouldReturnTheRightResultIfNumberIsNotNegativeAndIsGreaterThanOne(){
        assertEquals(8,Fibonacci.fibonacci(6));
    }

}