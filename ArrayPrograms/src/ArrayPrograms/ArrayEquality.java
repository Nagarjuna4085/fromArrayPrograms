package ArrayPrograms;

import java.util.Arrays;

public class ArrayEquality {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {1, 2, 4, 3, 5}; // Different order

        // Method 1: Using the Standard Arrays.equals() method
        boolean isEqual12 = Arrays.equals(array1, array2);
        boolean isEqual13 = Arrays.equals(array1, array3);

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Array 3: " + Arrays.toString(array3));

        System.out.println("\nAre Array 1 and Array 2 equal? " + isEqual12); // true
        System.out.println("Are Array 1 and Array 3 equal? " + isEqual13);   // false
    }
}