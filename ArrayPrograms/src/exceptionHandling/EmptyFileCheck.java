package exceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;

public class EmptyFileCheck {

    public static void checkFileContent(String fileName) throws Exception {
        File file = new File(fileName);

        // Optional: Pre-check using the File object's length
        if (file.exists() && file.length() == 0) {
            throw new Exception("The file " + fileName + " is physically empty (0 bytes).");
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            // Try to read the very first line
            String firstLine = br.readLine();

            if (firstLine == null) {
                throw new Exception("The file was opened, but it contains no text.");
            }

            System.out.println("First line of file: " + firstLine);
            // ... continue processing the file if needed ...
        }
    }

    public static void main(String[] args) {
        String targetFile = "test.txt";

        try {
            checkFileContent(targetFile);
            System.out.println("File processed successfully!");

        } catch (IOException e) {
            System.err.println("System Error: Could not find or access the file.");
        } catch (Exception e) {
            // This catches our custom "Empty" message
            System.err.println("Validation Error: " + e.getMessage());
        }
    }
}