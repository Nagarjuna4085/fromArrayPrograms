package ArrayPrograms;

import java.util.HashSet;
import java.util.Arrays;

public class CommonIntegers {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

        // 1. Create a Set to store unique elements from the first array
        HashSet<Integer> set = new HashSet<>();
        for (int num : array1) {
            set.add(num);
        }

        System.out.print("Common elements: ");

        // 2. Check each element of the second array against the Set
        for (int num : array2) {
            if (set.contains(num)) {
                System.out.print(num + " ");
                
                // 3. OPTIONAL: Remove to avoid printing the same common element twice
                set.remove(num); 
            }
        }
    }
}