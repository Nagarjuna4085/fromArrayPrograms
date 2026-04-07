package ArrayPrograms;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to search for: ");
        int target = sc.nextInt();

        boolean found = false;

        // Linear Search Logic
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
                break; // Stop the loop immediately
            }
        }

        if (found) {
            System.out.println("Yes! The array contains " + target);
        } else {
            System.out.println("No, the array does not contain " + target);
        }
        
        sc.close();
    }
}