package ArrayPrograms;

import java.util.Arrays;

public class InsertElementSingleVar {
    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50};
        int newValue = 25;
        int position = 2;

        int[] result = new int[original.length + 1];

        for (int i = 0; i < result.length; i++) {
            if (i < position) {
                // Before the insertion point: copy directly
                result[i] = original[i];
            } 
            else if (i == position) {
                // At the insertion point: drop in the new value
                result[i] = newValue;
            } 
            else {
                // After the insertion point: "Look back" 1 step
                result[i] = original[i - 1];
            }
        }

        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Result:   " + Arrays.toString(result));
    }
}