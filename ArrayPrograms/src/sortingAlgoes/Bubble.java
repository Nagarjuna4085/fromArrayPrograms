package sortingAlgoes;

import java.util.Arrays;

public class Bubble {
	public static void main(String[] args) {
		int[] arr = {5, 3, 2, 4};
		for(int i=0;i<arr.length-1;i++) {
		for(int j=0;j<arr.length-1-i;j++) {
			if(arr[j]>arr[j+1]) {
				int t = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = t;
			}
		}
	}
		
		Arrays.stream(arr).forEach(n -> System.out.println(n));

	}

}
