package com.example.envelopeanalysis;

/**
 * 2. Envelope Analysis
 * There are two envelopes with sides (a,b) and (c,d) to determine if one envelope can be put inside the other.
 * The program must handle the input of floating point numbers.
 * The program asks the user for envelope sizes one parameter at a time.
 * After each calculation, the program asks the user if he wants to continue.
 * If the user answers “y” or “yes” (case-insensitive), the program continues from the beginning,
 * otherwise it terminates the execution.
 */

public class EnvelopeAnalysis {
  /**
   * A method named main() that represents the entry or starting point for the program.
   * Main method in which are called all other methods.
   * @param args - list from parameters.
   */
  public static void main(String[] args) {
    Fit.isFit();
    Answer.answered();
  }
}
