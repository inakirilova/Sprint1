package task4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static task4.FileParser.countWordInFile;
import static task4.FileParser.replaceStrInFile;

public class Input {
    static void inputValues(Scanner scanner) throws IOException {
        System.out.println("The fllowing program has 2 mods (each with different input) - word counter or word replacer!");
        System.out.println("input format for counting a word :  <path to file> <string to count>");
        System.out.println("input format for replacing a word :  <path to file> <string to search for> <string to replace>");

        String input = scanner.nextLine();
        input = input.replaceAll("\\s", "");
        String[] arr = input.split(",", 3);
        System.out.println("arr.lenght = " + arr.length);
        if (arr.length < 2) {
            System.out.println("Invalid input format");
            inputValues(scanner);
        }
        String path = arr[0];
        String toCount = arr[1];
        Scanner file = new Scanner(new File(path));

        if (arr.length == 2) {
            int countStr = countWordInFile(file, toCount);
            System.out.println(countStr);

        } else if (arr.length == 3) {
            String toRepl = arr[2];
            boolean isFileChanged = replaceStrInFile(path, file, toCount, toRepl);
            System.out.println(isFileChanged);
        } else {
            System.out.println("Invalid input format");
            inputValues(scanner);
        }
    }
}
