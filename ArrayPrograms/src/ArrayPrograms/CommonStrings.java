package ArrayPrograms;

import java.util.HashSet;
import java.util.Arrays;

public class CommonStrings {
    public static void main(String[] args) {
        String[] array1 = {"Java", "Python", "PHP", "C#", "C++", "SQL"};
        String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "PHP"};

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

        // 1. Put the first array into a HashSet
        HashSet<String> set = new HashSet<>(Arrays.asList(array1));

        System.out.println("\nCommon elements are:");
        
        // 2. Iterate through the second array and check the Set
        for (String element : array2) {
            if (set.contains(element)) {
                System.out.println(element);
            }
        }
    }
}