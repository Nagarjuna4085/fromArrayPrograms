package exceptionHandling;

public class OddNumberCheck {

    // Method that validates if a number is even
    public static void checkIfEven(int number) {
        if (number % 2 != 0) {
            // Manually creating and throwing the "Hot Potato"
            throw new IllegalArgumentException(number + " is an odd number!");
        } else {
            System.out.println(number + " is even. Access granted.");
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("Checking 10...");
            checkIfEven(10); // This works fine

            System.out.println("\nChecking 7...");
            checkIfEven(7);  // This will trigger the catch block

        } catch (IllegalArgumentException e) {
            System.err.println("Caught an Exception: " + e.getMessage());
        }
        
        System.out.println("\nProgram continues running smoothly...");
    }
}
