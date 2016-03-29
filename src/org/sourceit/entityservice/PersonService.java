package org.sourceit.entityservice;

import org.sourceit.entities.Person;
import org.sourceit.exception.ReadException;

import java.io.File;
import java.io.IOException;

public interface PersonService {

    /**
     *
     * @param file
     * @return
     * @throws IOException
     */
    Person[] readPersons(File file) throws IOException, ReadException;

    /**
     *
     * @param persons
     * @param file
     * @throws IOException
     */
    void writePersons(Person[] persons, File file) throws IOException;

}
