package ArrayPrograms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateStrings {
    public static void main(String[] args) {
        String[] languages = {"Java", "Python", "C++", "Java", "JavaScript", "Python", "Ruby"};
        
        Map<String, Integer> fr = new HashMap<>();

        // 1. Build the Frequency Map
        for (String lang : languages) {
            fr.put(lang, fr.getOrDefault(lang, 0) + 1);
        }

        // 2. Simple Way to Print (Using the Lambda we discussed!)
        System.out.println("Duplicate Strings found:");
        fr.forEach((key, value) -> {
            if (value > 1) {
                System.out.println(key + " (Repeated " + value + " times)");
            }
        });
    }
}