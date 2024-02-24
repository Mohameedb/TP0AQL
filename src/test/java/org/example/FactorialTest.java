package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void factorialShouldraiseExceptionIfNumberIsLessThanZero() {
        assertThrows(IllegalArgumentException.class,()->Factorial.factorial(-5));
    }
    @Test
    void factorialShouldReturnOneIfNumberIsZeroOrOne(){
        assertEquals(1,Factorial.factorial(0));
        assertEquals(1,Factorial.factorial(1));

    }
    @Test
    void factorialShouldReturnTheRightResultIfNumberIsBiggerThanONE(){
        assertEquals(120,Factorial.factorial(5));

    }

}