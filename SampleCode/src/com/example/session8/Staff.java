package com.example.session8;

import java.util.Date;

public class Staff extends Person{
    protected double salary;

    public Staff(String firstName, String lastName, String personalId, Date birthday, double salary) {
        super(firstName, lastName, personalId, birthday);
        this.salary = salary;
    }

    public String doTask() {
        return "do stuff";
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", personalId='" + personalId + '\'' +
                ", birthday=" + birthday +
                ", salary=" + salary +
                '}';
    }
}
