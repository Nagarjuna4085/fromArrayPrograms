package interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateIntegerArray {
	public static void main(String[] args) {
		int[] nums = { 10, 20, 30, 40, 10 };

		List<Integer> u = new ArrayList<>();
		Set<Integer> duplicates = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			int n = nums[i];

			if (u.contains(n)) {
				duplicates.add(n);
			}
			u.add(n);

		}
		System.out.println(duplicates);

	}

}
