package ArrayPrograms;

import java.util.Arrays;

public class RemoveDuplicatesManual {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 20, 30, 40, 40, 40, 50};
        
        // Step 1: Ensure it's sorted (Manual logic requires this)
        Arrays.sort(numbers);

        // Step 2: The Manual Swap Logic
        int j = 0; // Index of the last unique element found
        
        for (int i = 0; i < numbers.length - 1; i++) {
            // If current element is NOT equal to the next one
            if (numbers[i] != numbers[i + 1]) {
                numbers[j++] = numbers[i];
            }
        }
        
        // Move the very last element into place
        numbers[j++] = numbers[numbers.length - 1];

        // Step 3: Print only up to the 'j' index
        System.out.println("Unique elements manually found:");
        for (int k = 0; k < j; k++) {
            System.out.print(numbers[k] + " ");
        }
    }
}