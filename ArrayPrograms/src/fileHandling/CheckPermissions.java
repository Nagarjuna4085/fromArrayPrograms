package fileHandling;

import java.io.File;

public class CheckPermissions {
    public static void main(String[] args) {
        // Specify the path to the file or directory
        File myFile = new File("C:/Users/USER");

        if (myFile.exists()) {
            // Check Read Permission
            if (myFile.canRead()) {
                System.out.println("Read permission: YES");
            } else {
                System.out.println("Read permission: NO");
            }

            // Check Write Permission
            if (myFile.canWrite()) {
                System.out.println("Write permission: YES");
            } else {
                System.out.println("Write permission: NO");
            }
            
            // Check Execute Permission
            if (myFile.canExecute()) {
                System.out.println("Execute permission: YES");
            } else {
                System.out.println("Execute permission: NO");
            }
        } else {
            System.out.println("The file does not exist.");
        }
    }
}