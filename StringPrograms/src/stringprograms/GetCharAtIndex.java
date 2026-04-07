package stringprograms;

public class GetCharAtIndex {
    public static void main(String[] args) {
        // Original String
        String str = "Java Exercises!";
        
        System.out.println("Original String = " + str);

        // Getting character at position 0
        char charAt0 = str.charAt(0);
        
        // Getting character at position 10
        char charAt10 = str.charAt(10);

        // Displaying results
        System.out.println("The character at position 0 is " + charAt0);
        System.out.println("The character at position 10 is " + charAt10);
    }
}