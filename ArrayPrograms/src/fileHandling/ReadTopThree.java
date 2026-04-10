package fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTopThree {
    public static void main(String[] args) {
        String fileName = "data.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int count = 0;

            System.out.println("Reading the first 3 lines of " + fileName + ":");

            // Loop runs as long as there is a line AND we haven't hit 3 lines yet
            while (count < 3 && (line = br.readLine()) != null) {
                System.out.println("Line " + (count + 1) + ": " + line);
                count++;
            }

            if (count < 3) {
                System.out.println("\n(Note: The file ended before reaching 3 lines.)");
            }

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}