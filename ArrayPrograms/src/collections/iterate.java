package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class iterate {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		
		Iterator<Integer> it = nums.iterator();
		
		while(it.hasNext()) {
			int n = it.next();
			if(n==30) {
				it.remove();
			}
			System.out.println(n);
			
		}
		System.out.println(nums);
		
		
		//
		for(Integer n:nums) {
			System.out.println(n);
		}
		
		// using size
		System.out.println("using size");
		for(int i=0;i<nums.size();i++) {
			System.out.println(nums.get(i));
		}
		
		System.out.println("using list iterator");
		
		ListIterator<Integer> lit = nums.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		
		
		//print from back using list iterator
		System.out.println("print from back using list iterator");
		ListIterator<Integer> rlt = nums.listIterator(nums.size());
		while(rlt.hasPrevious()) {
			System.out.println(rlt.previous());
		}
		
		// using foreach 
		System.out.println("using foreach");
		
		nums.forEach(n -> System.out.println(n));
		
		
	}
}
