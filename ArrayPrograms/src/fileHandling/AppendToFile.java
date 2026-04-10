package fileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {
    public static void main(String[] args) {
        String fileName = "C:/Users/User/test.txt";
        String newText = "This is a new log entry.";

        // The 'true' parameter tells Java to APPEND instead of overwrite
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.newLine(); // Start on a new line
            writer.write(newText);
            
            System.out.println("Successfully appended data to " + fileName);
        } catch (IOException e) {
            System.err.println("Error appending to file: " + e.getMessage());
        }
    }
}
