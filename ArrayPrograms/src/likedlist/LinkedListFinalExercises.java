package likedlist;


import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListFinalExercises {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println("Original list: " + list);

        // 21. Retrieve last element (without removing)
        String last = list.getLast();
        System.out.println("\n21. Last element: " + last);

        // 22. Check if element exists
        System.out.println("\n22. Contains 'B'? " + list.contains("B"));

        // 23. Convert LinkedList to ArrayList
        ArrayList<String> arrayList = new ArrayList<>(list);
        System.out.println("\n23. Converted to ArrayList: " + arrayList);

        // 24. Compare two linked lists
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");

        System.out.println("\n24. Lists equal? " + list.equals(list2));

        // 25. Check if list is empty
        System.out.println("\n25. Is list empty? " + list.isEmpty());

        // 26. Replace element
        list.set(1, "Z");   // replace B with Z
        System.out.println("\n26. After replacement: " + list);
    }
} 
