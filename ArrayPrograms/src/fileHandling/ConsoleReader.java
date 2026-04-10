package fileHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ConsoleReader {
    public static void main(String[] args) throws IOException {
        // We wrap System.in in an InputStreamReader, then into a BufferedReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Type something: ");
        String input = reader.readLine();

        System.out.println("You typed: " + input);
    }
}