package map;


import java.util.TreeMap;
import java.util.NavigableSet;

public class TreeMapNavigation {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(10, "A");
        map.put(20, "B");
        map.put(30, "C");
        map.put(40, "D");
        map.put(50, "E");

        System.out.println("Original Map: " + map);

        // 15. least key > given key
        System.out.println("\n15. higherKey(20): " + map.higherKey(20));

        // 16. greatest key < given key (entry)
        System.out.println("16. lowerEntry(30): " + map.lowerEntry(30));

        // 17. greatest key < given key
        System.out.println("17. lowerKey(30): " + map.lowerKey(30));

        // 18. NavigableSet view of keys
        NavigableSet<Integer> navSet = map.navigableKeySet();
        System.out.println("18. NavigableSet: " + navSet);

        // 19. remove & get least key entry
        System.out.println("19. pollFirstEntry(): " + map.pollFirstEntry());

        // 20. remove & get greatest key entry
        System.out.println("20. pollLastEntry(): " + map.pollLastEntry());

        System.out.println("Map after polling: " + map);

        // Rebuild map for remaining operations
        map.put(10, "A");
        map.put(20, "B");
        map.put(30, "C");
        map.put(40, "D");
        map.put(50, "E");

        // 21. range: fromKey inclusive to toKey exclusive
        System.out.println("21. subMap(20, 40): " + map.subMap(20, 40));

        // 22. range inclusive both sides
        System.out.println("22. subMap(20, true, 40, true): " +
                map.subMap(20, true, 40, true));

        // 23. keys >= given key
        System.out.println("23. tailMap(30): " + map.tailMap(30));

        // 24. keys > given key
        System.out.println("24. tailMap(30, false): " + map.tailMap(30, false));

        // 25. least key >= given key (entry)
        System.out.println("25. ceilingEntry(25): " + map.ceilingEntry(25));

        // 26. least key >= given key
        System.out.println("26. ceilingKey(25): " + map.ceilingKey(25));
    }
}