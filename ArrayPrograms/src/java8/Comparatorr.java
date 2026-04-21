package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparatorr {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 2, 8, 1);
		
		Comparator<Integer> comp = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
		};
		
		Collections.sort(list, comp);

		System.out.println(list);

	}

}
