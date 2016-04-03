package org.sourceit.entityservice.impl;

import org.sourceit.entities.Person;
import org.sourceit.entityservice.PersonService;
import org.sourceit.exception.ReadException;
import org.sourceit.service.impl.SymbolParseService;

import java.io.File;
import java.io.IOException;

public class PersonSymbolServiceImpl extends SymbolParseService implements PersonService {

    public Person[] readPersons(File file) throws IOException, ReadException {
        String[] stringArrPersons = super.readEntities(file).split("\\n");
        Person[] persons = new Person[stringArrPersons.length];

        for (int i = 0; i < stringArrPersons.length; i++) {
            Person person = new Person();
            person = person.readProperties(stringArrPersons[i]);
            persons[i] = person;
        }

        return persons;

    }

    public void writePersons(Person[] persons, File file) throws IOException {
        String personString = "";

        for (int i = 0; i < persons.length; i++) {
            personString += persons[i].toString();
            if (i != persons.length - 1) {
                personString += "\n";
            }
        }

        super.writeEntities(personString, file);
    }
}
