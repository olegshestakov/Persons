package org.sourceit.entities;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StudentTest {

    private Student student;

    @Test(alwaysRun = true)
    public void testCreationOfStudent() {
        student = new Student();
        Assert.assertEquals(student.getName(), "Oleg");
        Assert.assertEquals(student.getAge(), 24);
        Assert.assertEquals(student.getGender(), "male");
        Assert.assertEquals(student.getId(), "00000000");
        Assert.assertEquals(student.getGpa(), 3.5);
    }

    @Test
    public void testToString() {
        Assert.assertEquals(student.toString(), "student; Oleg; 24; male; 00000000; 3.5;");
    }


}
