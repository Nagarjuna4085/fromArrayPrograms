package Utilityclass;

import java.util.Arrays;

public class ArraysUtility {
	public static void main(String[] args) {
		int[] arr = { 5, 2, 8, 1 };

//		int[] newArr = Arrays.sort(arr);
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		int[] nums = new int[10];
		
		Arrays.fill(nums, -1);
		
		System.out.println(Arrays.toString(nums));
		
//		Arrays.

	}

}
