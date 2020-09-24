package com.example.session11;

public class ExceptionSample {

    public static void main(String[] args) {

        int firstNumber = 5;
        int secondNumber = 0;

        try {
            int result = firstNumber / secondNumber;
            String arg = args[3];

            System.out.println(result);
        } catch (ArithmeticException ex) {
            System.out.println("infinite");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index is out of bounds");
        } catch (Exception ex) {
            System.out.println("Some exceptions happened");
        } finally {
            System.out.println("it always run!!");
        }

    }
}
