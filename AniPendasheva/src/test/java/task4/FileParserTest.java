package task4;

import org.junit.jupiter.api.Test;
import task3.Triangle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class FileParserTest {

    @Test
    void countWordInFile() {
        String path = "C:/Users/user/Desktop/testFileToCount.txt";

        assertAll(
                () -> assertEquals(2, FileParser.countWordInFile(new Scanner(new File(path)), "aba"), "Number of str 'aba' in file"),
                () -> assertEquals(1, FileParser.countWordInFile(new Scanner(new File(path)), "aba bala"), "Number of str 'aba bala' in file"),
                () -> assertEquals(2, FileParser.countWordInFile(new Scanner(new File(path)), "bala"), "Number of str 'bala' in file"),
                () -> assertEquals(0, FileParser.countWordInFile(new Scanner(new File(path)), "alabala"), "Number of str 'alabala' in file")
        );
    }

    @Test
    void replaceStrInFile() {
        String path = "C:/Users/user/Desktop/testFileToParse.txt";
        assertAll(
                () -> assertEquals(true, FileParser.replaceStrInFile(path, new Scanner(new File(path)), "aba", "baba"), "String Replaced?"),
                () -> assertEquals(false, FileParser.replaceStrInFile(path, new Scanner(new File(path)), "testFail", "baba"), "String Replaced?")
        );

    }
}