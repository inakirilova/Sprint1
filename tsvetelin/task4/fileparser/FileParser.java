package com.example.fileparser;

/**
 * 4. File parser
 * You need to write a program that will have two modes:
 * 1. Count the number of occurrences of a string in a text file.
 * 2. Replace a line with another one in the specified file
 * The program must accept input arguments at startup:
 * 1. <path to file> <string to count>
 * 2. <path to file> <string to search for> <string to replace>
 */

import java.io.IOException;

public class FileParser {
    /**
     * A method named main() that represents the entry or starting point for the program.
     * Main method in which are called all other methods.
     * @param args - list from parameters.
     * @throws IOException - exceptions.
     */
    public static void main(String[] args) throws IOException {
        Reading.read();
        Writing.write();
    }
}
