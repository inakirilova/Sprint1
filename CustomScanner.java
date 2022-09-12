package com.example;

import java.util.Scanner;

/**
 * A generic scanner that can
 * be used by all other projects forever.
 */

public class CustomScanner {
  public static float getNextFloat(String message) {
    System.out.print(message);
    Scanner scanner = new Scanner(System.in);
    return scanner.nextFloat();
  }

  public static String getNextString(String message) {
    System.out.print(message);
    Scanner scanner = new Scanner(System.in);
    return scanner.nextLine();
  }

  public static int getNextInt(String message) {
    System.out.print(message);
    Scanner scanner = new Scanner(System.in);
    return scanner.nextInt();
  }
}