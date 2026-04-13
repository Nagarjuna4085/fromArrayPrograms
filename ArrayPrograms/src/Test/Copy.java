package Test;

public class Copy {
	public static void main(String[] args) {
		int[] nums = new int[10];
		int n = 0;
		while (n < 5) {
			nums[n] = n * 10 + 10;
			++n;
		}
//		print nums
//		for (int i : nums) {
//
//			System.out.println(i);
//		}

		int[] nums2 = nums;
		nums2[6] = 70;

		// after change
//		System.out.println("after change");
//		for (int i : nums) {
//
//			System.out.println(i);
//		}
		
//		nums[6] = 101;
		System.out.println("another change");
		
//		System.out.println("after change");
//		for (int i : nums2) {
//
//			System.out.println(i);
//		}
	}

}
