package org.sourceit.entities;

import org.sourceit.exception.ReadException;

public class Person implements Parseable {

    protected String name;
    protected String gender;
    protected int age;

    public static final String NAME_OF_CLASS = "person";

    public Person() {
        this.name = "Oleg";
        this.gender = "male";
        this.age = 24;
    }

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return Person.NAME_OF_CLASS + "; " +
                this.name + "; " +
                this.age + "; " +
                this.gender + ";";
    }

    @Override
    public Person readProperties(String properties) throws ReadException {
        Person person = new Person();
        try {
            String[] values = properties.split(";");

            if (values.length < 4) {
                throw new Exception("This is not person!!!");
            }

            person.setName(values[1].trim());
            person.setAge(Integer.parseInt(values[2].trim()));
            person.setGender(values[3].trim());

        } catch (Exception e) {
            throw new ReadException("Invalid parameters", e);
        }
        return person;
    }
}
