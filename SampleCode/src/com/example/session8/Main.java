package com.example.session8;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Student soroush = new Student("Soroush",
                "Vedaei", "4897987978",
                new Date(1988,3,21),
                "Informatik");

        Staff professor = new Staff("Erfan",
                "Shamabadi", "879482734",
                new Date(1988,4,20),
                85342.0F);


        Person service = new Person("Amid",
                "Sanai", "4897987978",
                new Date(2007,8,8));

        Person[] persons = {soroush, professor, service};

        for (Person p: persons) {
            System.out.println(p);
        }

        for(int i =0; i< persons.length; i++) {
            Person p = persons[i];
        }
    }
}
