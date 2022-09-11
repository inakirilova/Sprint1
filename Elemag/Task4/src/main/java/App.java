import java.io.*;

import java.util.Scanner;

public class App {
    private static final String instructions = "Enter one word if you want to count how many times it exists in the text file, " +
            "\nor enter two words separated with space if you want to replace the first word with the second one(Example: potato tomato).";
    private static final String fileName = "ourTextFile.txt";

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        while(true){
            System.out.println(instructions);
            String input = cin.nextLine();
            String[] words = input.split(" ");

            if (words.length == 1) {
                findWordInFile(words[0]);
            } else if (words.length == 2) {
                findAndReplace(words[0], words[1]);
            } else {
                System.out.println("Incorrect input. Please read the instructions.");
            }
        }
    }

    private static void findWordInFile(String lookingFor) {
        int counter = 0;
        String line = null;
        String[] wordsInLine = null;

        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
            while ((line = fileReader.readLine()) != null) {
                wordsInLine = line.toLowerCase().split(" ");
                for (String currentWord : wordsInLine) {
                    if (currentWord.contains(lookingFor.toLowerCase())) {
                        counter++;
                    }
                }
            }
            System.out.println("Text \"" + lookingFor + "\" is found " + counter + " times.");
            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
//        try {
//            BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
//            for (String line = fileReader.readLine(); line != null; line = fileReader.readLine()) {
//                System.out.println(line);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    private static void findAndReplace(String lookingFor, String replaceWith) {
        String line = null;
        StringBuilder textBuilder = new StringBuilder();
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
            while ((line = fileReader.readLine()) != null) {
                line = line.replace(lookingFor, replaceWith);
                textBuilder.append(line);
                textBuilder.append("\n");
            }
            String newText = textBuilder.toString();
            fileReader.close();
            toBeWritten(newText);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void toBeWritten(String toBeWritten) {
        try {
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName));
            fileWriter.write(toBeWritten);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
