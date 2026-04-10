package fileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadPlainText {
	public static void main(String[] args) {
		String filePath = "C:/Users/USER/test.txt";
		try {
			
			String content = new String(Files.readAllBytes(Paths.get(filePath)));
			System.out.println(content);
			
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Could not read the file: " + e.getMessage());
		}

	}

}
