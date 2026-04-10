package exceptionHandling;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class DuplicateChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // A Set only allows unique elements
        Set<Integer> seenNumbers = new HashSet<>();

        System.out.println("Enter numbers (type 'stop' to finish):");

        try {
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    int num = scanner.nextInt();

                    // .add() returns false if the number already exists in the set
                    if (!seenNumbers.add(num)) {
                        throw new Exception("Duplicate found: " + num);
                    }
                    
                    System.out.println("Added " + num);
                } else {
                    String input = scanner.next();
                    if (input.equalsIgnoreCase("stop")) break;
                    System.out.println("Please enter a valid integer.");
                }
            }
            System.out.println("Success! All numbers were unique.");

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}