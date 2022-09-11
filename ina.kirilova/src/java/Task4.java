
import java.io.*;
import java.util.Scanner;


public class Task4 {
    public static void read() throws IOException {

        BufferedReader in = new BufferedReader(new FileReader("src/resources/text.txt"));
        System.out.print("Enter the word to look for: ");
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();
        String line = in.readLine();
        int count = 0;
        while (line != null) {

            for (String element : line.split("")) {
                if (element.equals(word)) {
                    count++;
                }
            }
            line = in.readLine();
        }
        System.out.print("There are " + count + " occurrences of " + word + " in the file ");
        System.out.println();
    }

    public static void write() throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter what do you want to write");
        String oldtext = sc.nextLine();
        System.out.println("Enter what do you want to replace");
        String newtext = sc.nextLine();
        String text = "";
        BufferedReader reader = new BufferedReader(new FileReader("src/resources/text.txt"));
        String line = reader.readLine();
        while (line != null) {


            text = text + line + System.lineSeparator();
            line = reader.readLine();

        }
        String newContent = text.replaceAll(oldtext, newtext);
        FileWriter writer = new FileWriter("src/resources/text.txt");
        writer.write(newContent);
        System.out.println("Write successful");
        reader.close();
        writer.close();
    }


    public static void main(String[] args) throws IOException {

        read();
        write();
    }
}



