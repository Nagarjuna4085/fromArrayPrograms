package fileHandling;

import java.io.File;

public class TypeCheck {
    public static void main(String[] args) {
        File path = new File("C:/Users/USER");

        if (path.exists()) {
            if (path.isDirectory()) {
                System.out.println(path.getName() + " is a directory.");
            } else if (path.isFile()) {
                System.out.println(path.getName() + " is a file.");
            }
        } else {
            System.out.println("Path does not exist.");
        }
    }
}