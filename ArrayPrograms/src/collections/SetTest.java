package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		Set<String> animals = new HashSet<>(Set.of("cat","tiger"));
		set.add("apple");
		set.add("banana");
		set.add("apple"); // This is ignored!
 
		Integer[] nums = {1,2,3,4,5,1,2,3};
		
		Set<Integer> uniqNums = new HashSet<>(Arrays.asList(nums));
		System.out.println(uniqNums);
		animals.addAll(set);
		System.out.println(set); 
		System.out.println(animals);
		// Output: [banana, apple] (Note: the order might be different!)
		
		
		
		// with primitive
		int[] odds = {1,3,3,5,7,7,9,9,13,1,5,13,5};
	     List<Integer> list = Arrays.stream(odds).boxed().toList();
		
		Set<Integer> oddUniqs = new HashSet<>(list);
		
		
		System.out.println(oddUniqs);
	}

}

	