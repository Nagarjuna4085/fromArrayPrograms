package stringprograms;

public class ConcatenateStrings {
    public static void main(String[] args) {
        String str1 = "PHP Exercises and ";
        String str2 = "Python Exercises";

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // Using the .concat() method to join them
        String combinedString = str1.concat(str2);

        // Displaying the result
        System.out.println("The concatenated string: " + combinedString);
    }
}