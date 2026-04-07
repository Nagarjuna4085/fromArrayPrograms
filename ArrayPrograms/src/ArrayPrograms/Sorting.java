package ArrayPrograms;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        
        // 1. Numeric Array
        int[] numericArray = {23, 3, 5, 2, 4};
        
        System.out.println("Original Numeric Array: " + Arrays.toString(numericArray));
        
        // Sort the numeric array
        Arrays.sort(numericArray);
        
        System.out.println("Sorted Numeric Array: " + Arrays.toString(numericArray));
        
        System.out.println("---------------------------------------------");

        // 2. String Array
        String[] stringArray = {"Rama", "Krishna", "arjun", "Arjun","Bheem"};
        
        System.out.println("Original String Array: " + Arrays.toString(stringArray));
        
        // Sort the string array (Alphabetical order)
        Arrays.sort(stringArray);
        
        System.out.println("Sorted String Array: " + Arrays.toString(stringArray));
    }
}