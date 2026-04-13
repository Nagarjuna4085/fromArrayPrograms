package arrayAndLinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class colors {
    public static void main(String[] args) {

        // 1. Create list and add colors
        List<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("1. Original List: " + colors);

        // 2. Iterate through all elements
        System.out.println("\n2. Iterating list:");
        for (String color : colors) {
            System.out.println(color);
        }

        // 3. Insert at first position
        colors.add(0, "Orange");
        System.out.println("\n3. After inserting at first position: " + colors);

        // 4. Retrieve element at index 2
        System.out.println("\n4. Element at index 2: " + colors.get(2));

        // 5. Update element at specific index
        colors.set(2, "Purple");
        System.out.println("\n5. After update: " + colors);

        // 6. Remove 3rd element (index 2)
        colors.remove(2);
        System.out.println("\n6. After removing 3rd element: " + colors);

        // 7. Search element
        System.out.println("\n7. Search Red? " + colors.contains("Red"));
        System.out.println("Index of Red: " + colors.indexOf("Red"));

        // 8. Sort list
        Collections.sort(colors);
        System.out.println("\n8. Sorted list: " + colors);

        // 9. Copy list
        List<String> copyList = new ArrayList<>(colors);
        System.out.println("\n9. Copied list: " + copyList);

        // 10. Shuffle list
        Collections.shuffle(colors);
        System.out.println("\n10. Shuffled list: " + colors);
        
        System.out.println("before reverse");
        
        for (String color : colors) {
            System.out.println(color);
        }
        
        Collections.reverse(colors);
        
        
        System.out.println("after reverse");
        
        for (String color : colors) {
            System.out.println(color);
        }
        
      
        List<String> subList = colors.subList(0, 3);
        System.out.println("sublist size-----"+subList.size());
        System.err.println(colors.equals(subList));
        
        List<String> colors2 = new ArrayList<>(colors);
        System.out.println(colors.equals(colors2));
        
        Collections.swap(colors, 0, 1);
        
        colors.addAll(subList);
        
        for (String color : colors) {
            System.out.println(color);
        }
        
        
        
        
    }
}