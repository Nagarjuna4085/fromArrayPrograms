package fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineByLine {
	public static void main(String[] args) {
		String filePath = "C:/Users/USER/test.txt";
		try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
		} catch (IOException e) {
			// TODO: handle exception
			System.err.println("An error occurred: " + e.getMessage());
		}
	}

}
