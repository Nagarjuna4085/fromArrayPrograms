package likedlist;


import java.util.Collections;
import java.util.LinkedList;

public class LinkedListAdvanced {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println("Original list: " + list);

        // 11. Display elements with positions
        System.out.println("\n11. Elements with positions:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index " + i + " -> " + list.get(i));
        }

        // 12. Remove specified element
        list.remove("B");
        System.out.println("\n12. After removing 'B': " + list);

        // 13. Remove first and last element
        list.removeFirst();
        list.removeLast();
        System.out.println("\n13. After removing first & last: " + list);

        // Re-add elements for next operations
        list.add("E");
        list.add("F");
        list.add("G");

        System.out.println("\nReset list: " + list);

        // 14. Remove all elements
        LinkedList<String> temp = new LinkedList<>(list);
        temp.clear();
        System.out.println("\n14. After clearing list: " + temp);

        // 15. Swap two elements
        Collections.swap(list, 0, 2);
        System.out.println("\n15. After swapping index 0 and 2: " + list);

        // 16. Shuffle elements
        Collections.shuffle(list);
        System.out.println("\n16. After shuffle: " + list);

        // 17. Join two linked lists
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("X");
        list2.add("Y");

        list.addAll(list2);
        System.out.println("\n17. After joining lists: " + list);

        // 18. Clone linked list
        LinkedList<String> cloneList = new LinkedList<>(list);
        System.out.println("\n18. Cloned list: " + cloneList);

        // 19. Remove and return first element
        String first = list.removeFirst();
        System.out.println("\n19. Removed first element: " + first);
        System.out.println("List after removal: " + list);

        // 20. Get first element without removing
        String peek = list.getFirst();
        System.out.println("\n20. First element (without removing): " + peek);
    }
}
