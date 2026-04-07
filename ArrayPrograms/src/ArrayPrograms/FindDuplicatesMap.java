package ArrayPrograms;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesMap {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 5, 5, 6, 6, 7, 2, 8, 9, 1 };
		Map<Integer, Integer> fr = new HashMap();
		
		for(int num:numbers) {
			fr.put(num,fr.getOrDefault(num,0)+1);
		}
		
//		for(Map.Entry<Integer, Integer> entry : fr.entrySet()) {
//		    if(entry.getValue() > 1) {
//		        // Change this line to see WHICH numbers are duplicates
//		        System.out.println("Duplicate found: " + entry.getKey() + " (Seen " + entry.getValue() + " times)");
//		    }
//		}
		
//		fr.forEach((k,v)->{
//			if(v>1) {
//				System.out.println(k);
//			}
//		});
		
		for (Integer key : fr.keySet()) {
		    if (fr.get(key) > 1) {
		        System.out.println("Duplicate: " + key);
		    }
		}

	}

}
