package main;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
public void test_FileAndStringEquality() throws IOException {

File file = new File("src/test/test.txt");
Scanner sc = new Scanner(file);
String actual = sc.nextLine();
String expected = "test";
assertEquals(expected,actual);
}

}