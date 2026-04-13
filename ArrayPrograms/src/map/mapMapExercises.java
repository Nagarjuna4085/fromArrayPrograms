package map;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapMapExercises {
    public static void main(String[] args) {

        // 1. Create HashMap and associate key-value
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Blue");

        System.out.println("1. Map: " + map);

        // 2. Size of map
        System.out.println("\n2. Size: " + map.size());

        // 3. Copy map to another map
        Map<Integer, String> mapCopy = new HashMap<>();
        mapCopy.putAll(map);
        System.out.println("\n3. Copied Map: " + mapCopy);

        // 4. Remove all mappings
        Map<Integer, String> tempMap = new HashMap<>(map);
        tempMap.clear();
        System.out.println("\n4. After clear: " + tempMap);

        // 5. Check if map is empty
        System.out.println("\n5. Is map empty? " + map.isEmpty());

        // 6. Shallow copy of HashMap
        Map<Integer, String> shallowCopy = new HashMap<>(map);
        System.out.println("\n6. Shallow copy: " + shallowCopy);

        // 7. Check if key exists
        System.out.println("\n7. Contains key 2? " + map.containsKey(2));

        // 8. Check if value exists
        System.out.println("\n8. Contains value 'Red'? " + map.containsValue("Red"));

        // 9. Set view of mappings (entrySet)
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();

        System.out.println("\n9. Entry Set:");
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 10. Get value by key
        System.out.println("\n10. Value for key 1: " + map.get(1));
        
        // 11.set ok keys
        
        Set<Integer> keys = map.keySet();
        System.out.println("keys" + keys);
       Collection<String> values =map.values();
       System.out.println("values" + values);
    }
}
