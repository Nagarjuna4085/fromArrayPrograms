package fileHandling;

import java.io.File;

public class GetFileSize {
	public static void main(String[] args) {
		File file = new File("C:/Users/User/Untitled2.ipynb");
		if (file.exists()) {
            // length() returns the size in bytes (long)
            long bytes = file.length();
            
            // Convert to higher units using double for precision
            double kilobytes = (double) bytes / 1024;
            double megabytes = kilobytes / 1024;
            double gigabytes = megabytes / 1024;

            System.out.println("File Details:");
            System.out.println("Bytes: " + bytes);
            
            // Formatting to 2 decimal places for readability
            System.out.printf("Kilobytes: %.2f KB%n", kilobytes);
            System.out.printf("Megabytes: %.2f MB%n", megabytes);
            System.out.printf("Gigabytes: %.2f GB%n", gigabytes);
            
        } else {
            System.out.println("The file does not exist.");
        }

	}

}
