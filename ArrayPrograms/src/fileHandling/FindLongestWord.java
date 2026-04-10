package fileHandling;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FindLongestWord {
    public static void main(String[] args) {
        String longestWord = "";
        String currentWord;
        String fileName = "C:/Users/User/test.txt";

        
        // Using Scanner is easiest here because .next() automatically 
        // finds the next word separated by whitespace
        try (Scanner sc = new Scanner(new File(fileName))) {
            
            while (sc.hasNext()) {
            	System.out.println("next++++++++"+sc.next());
                currentWord = sc.next();
               
                
                // Clean the word (remove commas, periods, etc.)
                currentWord = currentWord.replaceAll("[^a-zA-Z]", "");

                // If the new word is longer than our 'champion', replace it
                if (currentWord.length() > longestWord.length()) {
                    longestWord = currentWord;
                }
            }

            if (longestWord.equals("")) {
                System.out.println("No words found in the file.");
            } else {
                System.out.println("The longest word is: " + longestWord);
                System.out.println("Number of characters: " + longestWord.length());
            }

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }
}
