package com.ironhack.lab204.main.classes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private Person person = new Person();
    private Person person1;
    private Person person2;
    private Person person3;

    @BeforeEach
    void setUp() {
        person1 = new Person(1, "adri", 20);
        person2 = new Person(2, "Denna", 20);
        person3 = person1.clonePerson(person1);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void Equals_CorrectClone_NewClone() throws CloneNotSupportedException {
        assertEquals(true, person1.equals(person3));

    }
}