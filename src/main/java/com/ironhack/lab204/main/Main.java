package com.ironhack.lab204.main;

import com.ironhack.lab204.main.classes.Person;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Person person1 = new Person(1, "adri", 20);
        Person person = new Person();
        person.writePersonToFile(person1);
    }
}