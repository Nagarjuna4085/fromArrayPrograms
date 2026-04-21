package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Practice {
	public static void main(String[] args) {
		Integer[] oddNums = { 10, 20, 30, 40 };
		List<Integer> nums = new ArrayList<>(Arrays.asList(oddNums));

//		nums.get(89);

//		for (int i = 0; i < nums.size(); i++) {
//			System.out.println(nums.get(i));
//		}

		int[] arr = { 5, 2, 8, 1, 3, 8, 2, 10 };
		IntStream stream = Arrays.stream(arr);

		int[] filterNums = Arrays.stream(arr).filter(x -> x > 3).toArray();

		// map
		int[] squaredArray = Arrays.stream(arr).map(n -> n * n).toArray();
//		for (int i = 0; i < squaredArray.length; i++) {
//			System.out.print(squaredArray[i] + " ");
//
//		}
//		long c = stream.count();
//		System.out.println(c);
		
//		OptionalDouble n = stream.average();
//		System.out.println(",a " + n);
		
//	 boolean all = 	stream.noneMatch(n -> n>2);
//	 System.out.println("all " + all);
		
		int sum = stream.reduce(0,(a,b) -> a+b);
		System.out.println("sum _ " + sum);
		

	}

}
