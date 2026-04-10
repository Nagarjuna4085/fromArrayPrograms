package fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileToVariable {
    public static void main(String[] args) {
    	
		String filePath = "C:/Users/USER/test.txt";

        // This variable will hold our final result
        String fileContent = "";
        
        // StringBuilder is the efficient way to collect lines
        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine();

            while (line != null) {
                // Append the line and add a newline character back in
                sb.append(line).append("\n");
                line =br.readLine();
            }
            
            // Convert the builder into a single String
            fileContent = sb.toString();

            // Now you can use the 'fileContent' variable anywhere!
            System.out.println("Variable successfully loaded. Length: " + fileContent.length());
            System.out.println(fileContent);

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
