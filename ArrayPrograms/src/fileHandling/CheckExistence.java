package fileHandling;

import java.io.File;

public class CheckExistence {
    public static void main(String[] args) {
        // Provide the path you want to check
        File file = new File("C:/Users/");

        if (file.exists()) {
            System.out.println("Success! The path exists.");
            
            // Distinguish between a file and a folder
            if (file.isFile()) {
                System.out.println("It is a file.");
            } else if (file.isDirectory()) {
                System.out.println("It is a directory.");
            }
        } else {
            System.out.println("The specified path does not exist.");
        }
    }
}