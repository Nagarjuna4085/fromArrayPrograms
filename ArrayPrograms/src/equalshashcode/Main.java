package equalshashcode;

import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.id = 1;
		e1.name = "John";

		Employee e2 = new Employee();

		e2.id = 1;
		e2.name = "John";

		// compare
		System.out.println(e1.equals(e2));

//		String name1 = "John";
//		String name2 = "John";
//		System.out.println(name1.equals(name2));
		
		// hash code
		
		
		HashSet<Employee> set = new HashSet<>();
		System.out.println("hashcode of e1 :  " + e1.hashCode());
		System.out.println("hashcode of e2 :  " + e2.hashCode());
		
		set.add(e1);
		set.add(e2);
		
		System.out.println(set.size());
		
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(1);
		
		System.out.println(set1.size());

	}

}
