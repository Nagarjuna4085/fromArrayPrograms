package fileHandling;

import java.io.File;

public class CompareFiles {
	public static void main(String[] args) {
//		Untitled2.ipynb
//		Untitled3.ipynb
//		Untitled4.ipynb
//		Untitled5.ipynb
		File file1 = new File("C:/Users/User/Untitled2.ipynb");
        File file2 = new File("C:/Users/User/Untitled4.ipynb");
        int result = file1.compareTo(file2);
        System.out.println("result   "  + result);
        if (result == 0) {
            System.out.println("Both file paths are equal.");
        } else if (result < 0) {
            System.out.println(file1.getName() + " comes before " + file2.getName() + " lexicographically.");
        } else {
            System.out.println(file1.getName() + " comes after " + file2.getName() + " lexicographically.");
        }
	}

}
