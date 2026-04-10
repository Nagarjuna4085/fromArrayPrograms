package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException {
		File myfile = new File("home.txt");
		myfile.createNewFile();
//		if(myfile.exists()) {
//			System.out.println("file is already exists");
//			System.out.println(myfile.getName());
//			System.out.println(myfile.getAbsolutePath());
//			System.out.println(myfile.length());
//			System.out.println(myfile.canRead());
//			System.out.println(myfile.isFile());
//		}
//		myfile.delete();
		FileWriter fw = new FileWriter("home.txt");
		fw.write("Hello world!!!!!!!");
		fw.close();

		FileReader fr = new FileReader("home.txt");
		int ch;
		while ((ch = fr.read()) != -1) {
			System.out.print((char) ch);
		}

		fr.close();

		BufferedWriter bw = new BufferedWriter(new FileWriter("home.txt"));
		bw.write("Hello Nagarjuna");
		bw.newLine(); // adds new line
		bw.write("Learning Java");
		bw.close();

		BufferedReader br = new BufferedReader(new FileReader("home.txt"));

		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}

		br.close();
		

	}

}
