package com.example.sortingtriangles;

import com.example.CustomScanner;

import java.util.Objects;

import static com.example.sortingtriangles.Area.getArea;

/**
 * A Class, in which is the method for the answer,
 * whether to continue the implementation of the program.
 */

public class Answer {

    /**
     * The method for the answer,
     * whether to continue the implementation of the program.
     * @return state.
     */
    public static boolean answered() {

        String answer = CustomScanner.getNextString("Do you want to continue? Yes or no? ");

        if (Objects.equals(answer, "Y")
                || Objects.equals(answer, "y")
                || Objects.equals(answer, "YES")
                || Objects.equals(answer, "Yes")
                || Objects.equals(answer, "yes")) {
            getArea();
            answered();
        } else if (Objects.equals(answer, "N")
                || Objects.equals(answer, "n")
                || Objects.equals(answer, "NO")
                || Objects.equals(answer, "No")
                || Objects.equals(answer, "no")) {
            System.out.print("That is the end of the program!");
        } else {
            System.out.print("Enter a valid option!");
        }

        return false;
    }
}