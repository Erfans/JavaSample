package com.example.session8;

import java.util.Date;

public class Student extends Person {

    protected String major;

    public Student(String firstName, String lastName, String personalId, Date birthday, String major) {
        super(firstName, lastName, personalId, birthday);
        this.major = major;
    }

    public String doTask() {
        return "Learn!!!";
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", personalId='" + personalId + '\'' +
                ", birthday=" + birthday +
                ", major='" + major + '\'' +
                '}';
    }
}
