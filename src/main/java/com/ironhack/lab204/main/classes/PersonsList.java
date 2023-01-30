package com.ironhack.lab204.main.classes;

import java.util.ArrayList;
import java.util.List;

public class PersonsList {
    private List<Person> personList = new ArrayList();

    public PersonsList(List<Person> personList) {
        this.personList = personList;
    }

    public Person findByName(String personName) {
        Person user = null;
        for (Person person : personList) {
            if (person.getName().equals(personName)) {
                user = person;
            }
        }
        if (user == null) {
            throw new IllegalArgumentException("user not found");
        } else {
            return user;
        }
    }
}

