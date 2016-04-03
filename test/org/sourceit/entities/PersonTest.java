package org.sourceit.entities;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PersonTest {

    private Person person;

    @Test(alwaysRun = true)
    public void testCreationOfPerson() {
        person = new Person();
        Assert.assertEquals(person.getName(), "Oleg");
        Assert.assertEquals(person.getAge(), 24);
        Assert.assertEquals(person.getGender(), "male");

    }

    @Test
    public void testToStringPersonMethod() {
        Assert.assertEquals(person.toString(), "person; Oleg; 24; male;");
    }

}
