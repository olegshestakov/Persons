package org.sourceit.entities;

public class Teacher extends Person /*implements Parseable*/ {

    protected double salary;
    protected String subject;

    public static final String NAME_OF_CLASS = "teacher";

    public Teacher() {
//        super();
        this.salary = 2000.0;
        this.subject = "math";
    }

    public Teacher(double salary, String subject) {
        super("Oleg", "male", 24);
        this.salary = salary;
        this.subject = subject;
    }

    public Teacher(String name, String gender, int age, double salary, String subject) {
        super(name, gender, age);
        this.salary = salary;
        this.subject = subject;
    }

    public Teacher(String name, String gender, double salary, String subject) {
        this(name, gender, 50, salary, subject);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return Teacher.NAME_OF_CLASS + "; " +
                this.name + "; " +
                this.age + "; " +
                this.gender + "; " +
                this.salary + "; " +
                this.subject + ";";
    }
}
