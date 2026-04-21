package sortingAlgoes;

public class SelectionSort {
public static void main(String[] args) {
//	find min and swap to position
	int[] arr = { 5, 3, 2, 4 };

	for (int j = 0; j < arr.length; j++) {
		int minIndex = j;
		for (int i = j+1; i < arr.length; i++) {

			if (arr[i] < arr[minIndex])
				minIndex = i;

		}
		int t = arr[j];
		arr[j] = arr[minIndex];
		arr[minIndex] = t;
		
	}

//	System.out.println(minIndex);
	Arrays.stream(arr).forEach(n -> System.out.println(n));
}

}
