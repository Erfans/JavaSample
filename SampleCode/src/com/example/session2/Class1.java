package com.example.session2;

public class Class1 {
    public static void main(String[] args) {

        /* here is a multi line comment
        it is totally ignored by computer
        and it is only for people who read the code */

        // and here is a single line code


        /*
        Java data types
        more information https://www.w3schools.com/java/java_data_types.asp
         */

        // integers
        int firstNumber = 32;
        int secondNumber = 25;

        int result = firstNumber + secondNumber;
        System.out.println(result);

        // floats
        float firstFloatNumber = 12.43f;
        float secondFloatNumber = 17.53f;

        float average = (firstFloatNumber + secondFloatNumber) / 2;
        System.out.println(average);

        // doubles
        double aDoubleNumber = 43.1387;
        double anotherDoubleNumber = 19.543;

        double doubleResult = aDoubleNumber * anotherDoubleNumber;
        System.out.println(doubleResult);

        // string
        String message = "Welcome to java course!!";
        System.out.println(message);

    }
}
