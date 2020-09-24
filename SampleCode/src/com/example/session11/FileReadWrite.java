package com.example.session11;

import java.io.*;

public class FileReadWrite {

    public static void main(String[] args) {

        // folder 1/folder 2/file.jpg

        String directory = System.getProperty("user.dir");
        String fileName = "sample.txt";
        String absolutePath = directory + File.separator + fileName;

        // Write the content in file
        try (FileWriter fileWriter = new FileWriter(absolutePath)) {
            fileWriter.write("This is a sample text.");
        } catch (IOException e) {
            // Cxception handling
        }

        // Read the content from file
        try (FileReader fileReader = new FileReader(absolutePath)) {

            int ch = fileReader.read();
            while (ch != -1) {
                System.out.print((char) ch);
                ch = fileReader.read();
            }

        } catch (FileNotFoundException e) {
            // Exception handling
        } catch (IOException e) {
            // Exception handling
        }
    }
}
