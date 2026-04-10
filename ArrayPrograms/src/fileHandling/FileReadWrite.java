package fileHandling;

import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {
        String fileName = "C:/Users/User/test.txt";

        // --- PART 1: WRITING ---
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Line 1: Learning Java IO is fun.");
            writer.newLine(); // This adds a proper system line break
            writer.write("Line 2: We are writing and reading now.");
            writer.newLine();
            writer.write("Line 3: End of the file.");
            
            System.out.println("Data successfully written to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred during writing: " + e.getMessage());
        }

        // --- PART 2: READING ---
        System.out.println("\n--- Reading Content Back ---");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred during reading: " + e.getMessage());
        }
    }
}
