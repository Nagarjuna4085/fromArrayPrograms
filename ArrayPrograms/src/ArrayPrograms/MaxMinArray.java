package ArrayPrograms;

import java.util.Arrays;

public class MaxMinArray {
    public static void main(String[] args) {
        int[] numbers = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        // 1. Initialize max and min with the first element
        int max = numbers[0];
        int min = numbers[0];

        // 2. Iterate through the array
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            } 
            else if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Original Array: " + Arrays.toString(numbers));
        System.out.println("Maximum Value: " + max);
        System.out.println("Minimum Value: " + min);
    }
}