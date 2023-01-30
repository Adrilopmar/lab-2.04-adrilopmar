package com.ironhack.lab204.main.classes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonsListTest {
    private PersonsList personsLists;
    private Person person1;
    private Person person2;
    private Person person3;
    private Person person4;
    private Person person5;

    @BeforeEach
    void setUp() {
        person1 = new Person("adri", 20);
        person2 = new Person("cris", 20);
        person3 = new Person("boris", 20);
        person4 = new Person("monica", 20);
        person5 = new Person("dani", 20);

        List<Person> personListTest1 = new ArrayList();
        personListTest1.add(person1);
        personListTest1.add(person2);
        personListTest1.add(person3);
        personListTest1.add(person4);
        personListTest1.add(person5);

        personsLists = new PersonsList(personListTest1);

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void findByName_CorrectPersonDetails_AddToPersonList() {
        assertEquals(person1, personsLists.findByName("adri"));
        assertEquals(person2, personsLists.findByName("cris"));
    }

    @Test
    void findByName_IncorrectPersonDetails_Throw() {
        assertThrows(IllegalArgumentException.class, () -> personsLists.findByName("sdaew"));
    }
}