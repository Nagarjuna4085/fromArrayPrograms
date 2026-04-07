package ArrayPrograms;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60};
        
        System.out.println("Original Array: " + Arrays.toString(numbers));

        int n = numbers.length;
        
        // Loop runs only 3 times for a 6-element array
        for (int i = 0; i < n / 2; i++) {
            // 1. Store the first value in a temporary 'bucket'
            int temp = numbers[i];
            
            // 2. Move the last value to the first position
            numbers[i] = numbers[n - 1 - i];
            
            // 3. Put the temp value into the last position
            numbers[n - 1 - i] = temp;
        }

        System.out.println("Reversed Array: " + Arrays.toString(numbers));
    }
}