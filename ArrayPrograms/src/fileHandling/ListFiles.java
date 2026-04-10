package fileHandling;

import java.io.File;

public class ListFiles {
	public static void main(String[] args) {
		File directory = new File("C:/Users/USER");
		if (directory.exists() && directory.isDirectory()) {
			String[] fileList = directory.list();
			if (fileList != null) {
				for (String l : fileList) {
					System.out.println(l);
				}
			}
		} else {
			System.out.println("The directory does not exist or is not a directory.");
		}
	}

}
