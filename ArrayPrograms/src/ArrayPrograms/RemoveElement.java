package ArrayPrograms;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] originalArray = {10, 20, 30, 40, 50};
        int indexToRemove = 2; // We want to remove '30' (at index 2)

        // 1. Create a new array with size - 1
        int[] newArray = new int[originalArray.length - 1];

        // 2. Copy elements
        int k = 0; // Index for the new array
        for (int i = 0; i < originalArray.length; i++) {
            // Skip the index we want to remove
            if (i == indexToRemove) {
                continue; 
            }
            newArray[k++] = originalArray[i];
        }

        System.out.println("Original: " + Arrays.toString(originalArray));
        System.out.println("After Removal: " + Arrays.toString(newArray));
    }
}