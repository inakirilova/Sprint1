package task4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import static task4.Input.inputValues;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        try {
            inputValues(scanner);
        } catch (FileNotFoundException e) {
            System.out.println("Invalid or not full file path!");
            inputValues(scanner);
        }
    }
}
