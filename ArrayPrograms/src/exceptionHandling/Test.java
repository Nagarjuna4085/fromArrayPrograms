package exceptionHandling;

public class Test {
	public static void main(String[] args) {
		try {
		    // OUTER TASK: Open a file
		    System.out.println("Opening the big file...");

		    try {
		        // INNER TASK: Do some math with data from that file
		        int data = 100 / 0; 
		    } catch (ArithmeticException e) {
		        System.out.println("Inner Catch: Math failed, but I still have the file open!");
		    }

		    // This code still runs because the inner catch "saved" the program
		    System.out.println("Continuing with other file operations...");

		} catch (Exception e) {
		    System.out.println("Outer Catch: The file couldn't even be opened!");
		}}
	}

}
