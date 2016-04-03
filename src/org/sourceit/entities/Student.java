package org.sourceit.entities;

public class Student extends Person {

    static {
        System.out.println("Student static block");
    }

    protected String id;
    protected double gpa;

    public static final String NAME_OF_CLASS = "student";

    public Student() {
        this.id = "00000000";
        this.gpa = 3.5;
    }

    public Student(String id, double gpa) {
        this.id = id;
        this.gpa = gpa;
    }

    public Student(String name, String gender, int age, String id, double gpa) {
        super(name, gender, age);
        this.id = id;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return Student.NAME_OF_CLASS + "; " +
                this.name + "; " +
                this.age + "; " +
                this.gender + "; " +
                this.id + "; " +
                this.gpa + ";";
    }
}
