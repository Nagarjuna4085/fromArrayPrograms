package exceptionHandling;

public class VowelChecker {

    public static void validateVowels(String input) throws Exception {
        boolean foundVowel = false;
        // Convert to lowercase so we don't have to check for 'A', 'E', etc.
        String lowerInput = input.toLowerCase();

        for (int i = 0; i < lowerInput.length(); i++) {
            char c = lowerInput.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                foundVowel = true;
                break; // We found one! No need to check the rest of the string.
            }
        }

        if (!foundVowel) {
            throw new Exception("Invalid String: '" + input + "' contains no vowels!");
        }
    }

    public static void main(String[] args) {
        String test1 = "Hello";
        String test2 = "Rhythm"; // No vowels (y is technically a vowel sometimes, but not in basic char checks)

        try {
            System.out.println("Checking: " + test1);
            validateVowels(test1);
            System.out.println("Result: Valid");

            System.out.println("\nChecking: " + test2);
            validateVowels(test2);
            System.out.println("Result: Valid");

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
