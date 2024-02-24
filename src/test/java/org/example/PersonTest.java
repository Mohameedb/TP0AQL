package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getFullNameShouldeReturnFirstNameAndLastName() {
        Person person = new Person("bouslah","mohamed",18);
        assertEquals(person.getFullName(),"bouslah mohamed");
    }

    @Test
    void isAdultShouldReturnTrueIfAgeIsGreaterThanOrEqual18FalseIfAgeIsLessThan18() {
        Person person = new Person("bouslah","mohamed",18);
        assertEquals(person.isAdult(),true);

    }
}