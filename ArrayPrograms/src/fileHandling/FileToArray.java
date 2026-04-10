package fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileToArray {
    public static void main(String[] args) {
		String filePath = "C:/Users/USER/test.txt";

        // 1. Use a List to collect lines (because we don't know the count yet)
        List<String> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }

            // 2. Convert the List to a standard String Array
            String[] lineArray = list.toArray(new String[0]);

            // 3. Test: Print the array elements
            System.out.println("Stored " + lineArray.length + " lines in the array.");
            for (String s : lineArray) {
                System.out.println("Line: " + s);
            }

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}