package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralTest {

    @Test
    void convert() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("I");

        Assertions.assertEquals(1, result);
    }

}