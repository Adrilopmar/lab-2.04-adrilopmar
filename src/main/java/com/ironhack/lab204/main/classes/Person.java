package com.ironhack.lab204.main.classes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Map;
import java.util.Objects;

public class Person {
    private int id;
    private String name;
    private String occupation;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.id = (int) (Math.random() * (999 + 1) - 1);
        this.name = name;
        setAge(age);
    }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        setAge(age);
    }

    public Person clonePerson(Person personToClone) {
        Person clonedPerson = new Person(personToClone.getName(), personToClone.getAge());
        return clonedPerson;
    }

    public void writePersonToFile(Person person) throws IOException {
        FileWriter fileWriter = new FileWriter(" personsList.txt", true);
        fileWriter.write(person.toString());
        fileWriter.close();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(occupation, person.occupation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, occupation, age);
    }

    @Override
    public String toString() {
        return "Person:" +
                " id:" + id +
                " name:" + name + '\'' +
                " occupation:" + occupation + '\'' +
                " age:" + age + "\n";
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = (int) (Math.random() * (999 + 1) - 1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("invalid age");
        }
        this.age = age;
    }
}
