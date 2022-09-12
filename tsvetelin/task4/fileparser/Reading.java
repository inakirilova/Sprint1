package com.example.fileparser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * A class that checks
 * how many times a phrase occurs.
 */

public class Reading {

    /**
     * A method that checks how many times a phrase occurs.
     *
     * @throws IOException - exceptions.
     */

    public static int read() throws IOException {

        int count;
        try (BufferedReader in = new BufferedReader(new FileReader("D:/Java/JavaTasks/src/com/example/fileparser/text.txt"))) {
            System.out.print("Enter the word to look for: ");
            Scanner scan = new Scanner(System.in);

            String word = scan.nextLine();
            String line = in.readLine();
            count = 0;

            while (line != null) {

                for (String element : line.split("")) {
                    if (element.equals(word)) {
                        count++;
                    }
                }
                line = in.readLine();
            }
            System.out.print("There are " + count + " occurrences of " + word + " in the file! ");
            System.out.println();
        }
        return count;
    }
}
