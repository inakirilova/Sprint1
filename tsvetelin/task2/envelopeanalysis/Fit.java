package com.example.envelopeanalysis;

import com.example.CustomScanner;

/**
 * A Class, in which is the method to check,
 * whether the first envelope can fit
 * in the second envelope.
 */
public class Fit {
  /**
   * the method to check,
   * whether the first envelope can fit
   * in the second envelope.
   * @return state.
   */

  public static boolean isFit() {

    float SideA = CustomScanner.getNextFloat("Enter the first side of the first envelope: ");
    float SideB = CustomScanner.getNextFloat("Enter the second side of the first envelope: ");
    float SideC = CustomScanner.getNextFloat("Enter the first side of the second envelope: ");
    float SideD = CustomScanner.getNextFloat("Enter the second side of the second envelope: ");

    if (SideA < SideC && SideB < SideD) {
      System.out.print("The first envelope fits in the second!");
    } else {
      System.out.print("The first envelope can't fit in the second!");
    }
    System.out.println();

    return false;
  }
}
