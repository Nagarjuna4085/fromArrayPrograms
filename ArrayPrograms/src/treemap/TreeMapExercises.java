package treemap;


import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapExercises {
    public static void main(String[] args) {

    	
        // 1. Create TreeMap and add values
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(10, "A");
        map.put(30, "C");
        map.put(20, "B");
        map.put(40, "D");

        System.out.println("1. TreeMap: " + map);

        // 2. Copy TreeMap to another
        TreeMap<Integer, String> copyMap = new TreeMap<>(map);
        System.out.println("\n2. Copied TreeMap: " + copyMap);

        // 3. Search key
        System.out.println("\n3. Contains key 20? " + map.containsKey(20));

        // 4. Search value
        System.out.println("4. Contains value 'B'? " + map.containsValue("B"));

        // 5. Get all keys
        System.out.println("5. Keys: " + map.keySet());

        // 6. Delete all elements
        TreeMap<Integer, String> temp = new TreeMap<>(map);
        temp.clear();
        System.out.println("6. After clear: " + temp);

        // 7. Sort keys using comparator (descending order)
        TreeMap<Integer, String> descMap =
                new TreeMap<>(Comparator.reverseOrder());
        descMap.putAll(map);
        System.out.println("7. Desc order map: " + descMap);

        // 8. Greatest and least key entry
        System.out.println("8. First Entry: " + map.firstEntry());
        System.out.println("8. Last Entry: " + map.lastEntry());

        // 9. First and last key
        System.out.println("9. First Key: " + map.firstKey());
        System.out.println("9. Last Key: " + map.lastKey());

        // 10. Reverse order view
        System.out.println("10. Reverse Map: " + map.descendingMap());

        // 11. Floor entry (greatest <= key)
        System.out.println("11. floorEntry(25): " + map.floorEntry(25));

        // 12. Floor key
        System.out.println("12. floorKey(25): " + map.floorKey(25));

        // 13. headMap (keys < given key)
        System.out.println("13. headMap(30): " + map.headMap(30));

        // 14. headMap inclusive version
        System.out.println("14. headMap(30, true): " + map.headMap(30, true));

        // 15. higherKey (least key > given key)
        System.out.println("15. higherKey(20): " + map.higherKey(20));
    }
}