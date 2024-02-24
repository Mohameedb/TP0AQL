package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    @Test
    void isPrimeShouldReturnFlaseIfNumberIsLessThanTwo() {

        assertFalse(Prime.isPrime(-5));
    }
    @Test
    void isPrimeShouldReturnFlaseIfNumberIsNotPrime() {
        assertFalse(Prime.isPrime(20));
    }
    @Test
    void isPrimeShouldReturnTrueIfNumberIsPrime() {
        assertTrue(Prime.isPrime(29));
    }
    @Test
    void isPrimeShouldReturnFalseIfNumberIsTwoOrThree() {//for boundry testing(cas limite)
        assertTrue(Prime.isPrime(2));
        assertTrue(Prime.isPrime(3));
    }
   /* @Test
     void isPrimeShouldRaiseExceptionIfNumberIsTooLong()
    {
        assertThrows(ArithmeticException.class,()->Prime.isPrime(154334846113));
    }*/
}