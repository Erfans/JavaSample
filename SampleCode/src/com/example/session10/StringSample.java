package com.example.session10;

public class StringSample {

    public static void main(String[] args) {
        String firstName = "Soroush";
        String lastName = "Vedaei";

        String fullName = firstName.concat(" ").concat(lastName);

        System.out.println(fullName);


        String fullName2 = "Amid Sanai";

        System.out.println(fullName.compareToIgnoreCase(fullName2));

        String[] urls = {
                "wwww.google.com",
                "soroush.dev",
                "google.de",
                "facebook.com"
        };

        // List just the .com sites
        System.out.println("List just the .com sites:");
        for (String url: urls) {
            if(url.endsWith(".com")) {
                System.out.println(url);
            }
        }

        //List the sites with de
        System.out.println("List the sites with de");
        for (String url: urls) {
            if(url.contains("de")){
                System.out.println(url);
            }
        }

        //Show url with how many character does it have
        System.out.println("Show url with how many character does it have");
        for (String url: urls) {
            System.out.println(url.length() + "\t" + url);
            System.out.printf("%d\t%s\n", url.length(), url);
        }

    }
}
