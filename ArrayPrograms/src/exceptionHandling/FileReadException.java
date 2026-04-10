package exceptionHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadException {

    // The 'throws' keyword warns the caller that this method is "dangerous"
    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        
        // This line is the "danger zone"
        FileReader reader = new FileReader(file);
        
        System.out.println("File opened successfully!");
    }

    public static void main(String[] args) {
        String myFile = "secret_data.txt";

        try {
            // Since readFile 'throws' an exception, we MUST wrap it in a try-catch
            readFile(myFile);
            
        } catch (FileNotFoundException e) {
            // This runs if the file isn't on the hard drive
            System.err.println("CRITICAL ERROR: The file '" + myFile + "' is missing.");
            System.err.println("Technical Details: " + e.getMessage());
        }
    }
}