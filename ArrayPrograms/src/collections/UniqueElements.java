package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueElements {
 public static void main(String[] args) {
	 String[] fruits = {"apple","banana","mango","apple"};
	 List<String> uniqFruits = new ArrayList<>();
	 
	 
	 for(String f:fruits) {
		 if(!uniqFruits.contains(f)) {
			 uniqFruits.add(f);
		 }
		 
	 }
	 System.out.println(uniqFruits);	  	 
	 uniqFruits.forEach(System.out::println);
	 
	 
	 // array to list
	 String[] names = {"cat","lion","tiger"};
	 
	 List<String> namesasList = new ArrayList<>(Arrays.asList(names));
	 namesasList.add("cow");
	 
	 System.out.println(namesasList);
	 
	 
	 // list to array
	 String[] animals = namesasList.toArray(new String[namesasList.size()]);
	 
	 System.out.println(Arrays.toString(animals));
	 
	 if(namesasList instanceof List) {
		 System.out.println("yes");
	 }
	 if(animals instanceof String[]) {
		 System.out.println("yes");
	 }
	 
	 int[] nums = {1,2,3};
	 Integer[] odds = {1,3,5};
	 
	 
	// 3. The instanceof Test
	 if (nums instanceof int[]) {
	     System.out.println("This is a primitive int array");
	 }

	 if (odds instanceof Integer[]) {
	     System.out.println("This is an Integer Object array");
	 }
	 Collections.sort(namesasList);
	 System.out.println(namesasList);
}
}
