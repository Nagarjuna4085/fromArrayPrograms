package fileHandling;

import java.io.File;
import java.util.Date;

public class FileDate {
	public static void main(String[] args) {
		File file = new File("C:/Users/User/Untitled2.ipynb");
		if (file.exists()) {
			// Get time in milliseconds
			long milliseconds = file.lastModified();

			// Convert to a readable Date object
			Date date = new Date(milliseconds);

			System.out.println("The file was last modified on: " + date);
		} else {
			System.out.println("File does not exist.");
		}
	}

}
