package ArrayPrograms;

import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find its index: ");
        int target = sc.nextInt();

        int index = -1; // Default to -1 (not found)

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
                break; // Exit once found
            }
        }

        if (index != -1) {
            System.out.println("The element " + target + " is at index: " + index);
        } else {
            System.out.println("Element not found in the array. Result: " + index);
        }
        
        sc.close();
    }
}