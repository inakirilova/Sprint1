package com.example.numberinwords;

/**
 * 5. Number in words
 * It is necessary to convert an integer to a capital version: 12 - twelve.
 * The program is launched by calling the main class with parameters.
 */

import java.util.Scanner;

import static com.example.numberinwords.Converting.convertNumberToWords;

class NumberInWords {
  /**
   * A method named main() that represents the entry or starting point for the program.
   * Main method in which are called all other methods.
   * @param args - list from parameters.
   */
  public static void main(String[] args) {
    int number;
    try(Scanner scanner = new Scanner(System.in)) {
      System.out.println("Please Enter a number(max up to 9 digits):");
      number = scanner.nextInt();
      System.out.print("Number in words: " + convertNumberToWords(number));
    } catch (Exception e) {
      System.out.println("Please enter a valid number");
    }
  }
}