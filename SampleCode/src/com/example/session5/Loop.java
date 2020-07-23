package com.example.session5;

public class Loop {
    public static void main(String[] args) {
        int index = 1;
        System.out.println("While loop");
        while(index <= 20) {
            System.out.println(index);
            index = index + 5;// index += 1; index++; ++index;
        }
        System.out.println("For loop");
        for(int i = 20; i > 0; i-=5){
            System.out.println(i);
        }
        System.out.println("While look for");
        int i = 20;
        for(; i > 0;){
            System.out.println(i);
            i --;
        }
    }
}
