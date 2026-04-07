package stringprograms;

public class ContainsSequence {
    public static void main(String[] args) {
        String str = "PHP Exercises and Python Exercises";
        String sequence = "and";

        System.out.println("Original String: " + str);
        System.out.println("Specified sequence of char values: " + sequence);

        // Check if the string contains the specified sequence
        boolean result = str.contains(sequence);

        // Display the boolean result
        System.out.println(result);
    }
}