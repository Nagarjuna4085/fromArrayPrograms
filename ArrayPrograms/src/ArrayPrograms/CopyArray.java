package ArrayPrograms;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] originalArray = {5, 10, 15, 20, 25};
        
        // 1. Create the destination array with the same size
        int[] copiedArray = new int[originalArray.length];

        // 2. Iterate and Copy
        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }

        // 3. Verify they are the same
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Copied Array:   " + Arrays.toString(copiedArray));

        // 4. Prove they are separate objects in memory
        if (originalArray != copiedArray) {
            System.out.println("\nSuccess: These are two different objects in memory!");
        }
    }
}