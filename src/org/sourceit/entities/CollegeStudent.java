package org.sourceit.entities;

public class CollegeStudent extends Student {

    protected int year;
    protected String major;

    public static final String NAME_OF_CLASS = "college_student";

    public CollegeStudent() {
        this.year = 2008;
        this.major = "math";
    }

    public CollegeStudent(int year, String major) {
        this.year = year;
        this.major = major;
    }

    public CollegeStudent(String id, double gpa, int year, String major) {
        super(id, gpa);
        this.year = year;
        this.major = major;
    }

    public CollegeStudent(String name, String gender, int age, String id, double gpa, int year, String major) {
        super(name, gender, age, id, gpa);
        this.year = year;
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return CollegeStudent.NAME_OF_CLASS + "; " +
                this.name + "; " +
                this.age + "; " +
                this.gender + "; " +
                this.id + "; " +
                this.gpa + ";" +
                this.year + "; " +
                this.major + ";";
    }

}
