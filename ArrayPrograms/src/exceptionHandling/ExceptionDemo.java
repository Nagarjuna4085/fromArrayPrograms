package exceptionHandling;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            // 1. Code that might cause an error
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator; // This will throw an exception
            
            System.out.println("Result: " + result); // This line will NEVER run

        } catch (ArithmeticException e) {
            // 2. Code that runs ONLY if an error happens
            System.err.println("Error: You cannot divide by zero!");
            System.err.println("Message from Java: " + e.getMessage());
            
        } finally {
            // 3. Optional: Code that runs no matter what (even if there's no error)
            System.out.println("Cleaning up... Program execution finished.");
        }
    }
}