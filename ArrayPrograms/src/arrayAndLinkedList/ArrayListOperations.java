package arrayAndLinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListOperations {
    public static void main(String[] args) {

        // Original list
        List<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("Original list: " + colors);

        // 16. Clone ArrayList
        List<String> clonedList = new ArrayList<>(colors);
        System.out.println("16. Cloned list: " + clonedList);

        // 17. Empty ArrayList (removeAll)
        colors.removeAll(colors);
        System.out.println("17. After removeAll (empty): " + colors);

        // Recreate list for further operations
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // 18. Check if empty
        System.out.println("18. Is list empty? " + colors.isEmpty());

        // 19. Trim capacity to size
        ArrayList<String> arrayList = new ArrayList<>(colors);
        arrayList.trimToSize();   // reduces capacity to current size
        System.out.println("19. After trimToSize: " + arrayList);

        // 20. Increase capacity (using ensureCapacity concept)
        ArrayList<String> capacityList = new ArrayList<>();
        capacityList.ensureCapacity(100); // increase internal capacity

        capacityList.add("A");
        capacityList.add("B");

        System.out.println("20. Capacity list: " + capacityList);
    }
}