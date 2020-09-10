package com.example.session9b;

public class Student implements Human {

    String firstName;
    String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String getName() {
        return this.firstName + " " + this.lastName;
    }
}
