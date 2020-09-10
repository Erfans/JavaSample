package com.example.session9b;

public class Staff implements Human {

    private final String firstName;
    private final String lastName;

    public Staff(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String getName() {
        return this.lastName + ", " + this.firstName;
    }
}
