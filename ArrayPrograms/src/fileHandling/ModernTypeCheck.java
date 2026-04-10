package fileHandling;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ModernTypeCheck {
	public static void main(String[] args) {
		Path path = Paths.get("C:/Users/USER");
		// The Files class provides static methods to check the Path
		if (Files.exists(path)) {
			if (Files.isDirectory(path)) {
				System.out.println("It's a directory.");
			} else if (Files.isRegularFile(path)) {
				System.out.println("It's a regular file.");
			}
		} else {
			System.out.println("Path does not exist.");
		}
		
	}

}
