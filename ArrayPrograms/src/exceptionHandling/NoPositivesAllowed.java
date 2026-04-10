package exceptionHandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NoPositivesAllowed {

    public static void checkFileForPositives(String fileName) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            
            while ((line = br.readLine()) != null) {
                // Convert the string line to an actual number
                int number = Integer.parseInt(line.trim());

                if (number > 0) {
                    // Trigger the exception the moment a positive is found
                    throw new RuntimeException("Invalid Data: Found positive number (" + number + ")");
                }
                
                System.out.println("Processed valid number: " + number);
            }
        }
    }

    public static void main(String[] args) {
        // Assume 'numbers.txt' contains: -5, -10, 3, -2
        try {
            checkFileForPositives("numbers.txt");
            System.out.println("Success! No positive numbers found.");
            
        } catch (IOException e) {
            System.err.println("File Error: " + e.getMessage());
        } catch (RuntimeException e) {
            // This catches our "Positive Number" error
            System.err.println("Data Error: " + e.getMessage());
        }
    }
}}
