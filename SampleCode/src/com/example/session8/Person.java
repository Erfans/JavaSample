package com.example.session8;

import java.util.Date;

public class Person {
    protected String firstName;
    protected String lastName;
    protected String personalId;
    protected Date birthday;

    public Person(String firstName, String lastName, String personalId, Date birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalId = personalId;
        this.birthday = birthday;
    }

    public String doTask() {
        return "Not identified";
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPersonalId() {
        return personalId;
    }

    public void setPersonalId(String personalId) {
        this.personalId = personalId;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", personalId='" + personalId + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
