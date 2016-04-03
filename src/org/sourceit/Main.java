package org.sourceit;

import org.sourceit.entities.Person;
import org.sourceit.entities.Student;
import org.sourceit.entities.Teacher;
import org.sourceit.entityservice.PersonService;
import org.sourceit.entityservice.impl.PersonSymbolServiceImpl;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {

        PersonService personService = new PersonSymbolServiceImpl();

        Person[] persons = new Person[3];
        persons[0] = new Person("Oleg", "male", 24);
        persons[1] = new Student("Ben", "male", 22, "01", 3.5);
        persons[2] = new Teacher("Olga", "female", 23, 1000, "english");

        personService.writePersons(persons, new File("persons.txt"));

        Person[] persons1 = personService.readPersons(new File("persons.txt"));

        for(int i = 0; i < persons1.length; i++) {
            System.out.println(persons1[i]);
        }

    }
}
