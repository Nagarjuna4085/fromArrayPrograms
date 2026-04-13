package likedlist;


import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExercises {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        // 1. Append element at end
        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println("1. After append: " + list);

        // 2. Iterate all elements
        System.out.println("\n2. Iterate all elements:");
        for (String s : list) {
            System.out.println(s);
        }

        // 3. Iterate from specified position (index 1)
        System.out.println("\n3. From index 1:");
        for (int i = 1; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 4. Reverse order iteration
        System.out.println("\n4. Reverse order:");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }

        // 5. Insert at specific position
        list.add(1, "X");
        System.out.println("\n5. After inserting at index 1: " + list);

        // 6. Insert at first and last position
        list.addFirst("START");
        list.addLast("END");
        System.out.println("\n6. Add first & last: " + list);

        // 7. Insert at front
        list.addFirst("FRONT");
        System.out.println("\n7. Insert at front: " + list);

        // 8. Insert at end
        list.addLast("TAIL");
        System.out.println("\n8. Insert at end: " + list);

        // 9. Insert elements at specific position
        LinkedList<String> extra = new LinkedList<>();
        extra.add("P");
        extra.add("Q");

        list.addAll(2, extra);
        System.out.println("\n9. Insert multiple elements at index 2: " + list);

        // 10. First and last occurrence
        list.add("A"); // duplicate for testing

        System.out.println("\n10. First occurrence of A: " + list.indexOf("A"));
        System.out.println("10. Last occurrence of A: " + list.lastIndexOf("A"));
    }
}