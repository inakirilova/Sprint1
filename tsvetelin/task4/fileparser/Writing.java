package com.example.fileparser;

import com.example.CustomScanner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * A class in which the replacement of
 * one phrase with another takes place.
 */

public class Writing {

    /**
     * A method that replaces one phrase with another.
     * @throws IOException - exceptions.
     */

    public static String write() throws IOException {
        String oldText = CustomScanner.getNextString("Enter the string to search for: ");
        String newText = CustomScanner.getNextString("Enter the string to replace: ");
        System.out.println();
        String text = "";
        try (BufferedReader reader = new BufferedReader(new FileReader("D:/Java/JavaTasks/src/com/example/fileparser/text.txt"))){
            String line = reader.readLine();
            while (line != null) {
                text = text + line + System.lineSeparator();
                line = reader.readLine();
            }
            String newContent = text.replaceAll(oldText, newText);
            try (FileWriter writer = new FileWriter("D:/Java/JavaTasks/src/com/example/fileparser/text.txt")) {
                writer.write(newContent);
                System.out.println("Replacement successful! ");
            }
        }
        return newText;
    }
}