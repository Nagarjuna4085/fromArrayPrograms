package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void print(List<Employee> emps) {
		for(Employee e:emps) {
			System.out.println("Id: " + e.getId() + " Name" + e.getName() + " " + e.getAge());
		}

	}

	public static void main(String[] args) {
		Employee e1 = new Employee(0, "john", 26);
		Employee e2 = new Employee(1, "doe", 25);
		Employee e3 = new Employee(2, "abc", 20);
		Employee e4 = new Employee(3, "def", 27);
		Employee e5 = new Employee(1, "jon", 29);
		Employee e6 = new Employee(6, "joesfewhn", 21);
		Employee e7 = new Employee(5, "johnwefe", 25);
		
		System.out.println(e2.compareTo(e1));
		System.out.println(e4.compareTo(e5));

		List<Employee> employees = new ArrayList<>();

		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);
		employees.add(e7);
		
//		Collections.sort(employees); without compare from comparator interface
		
		
		
		Collections.sort(employees,(a,b)->{
			 if (a.getId() > b.getId()) {
			        return 1;
			    } else if (a.getId() == b.getId()) {
			        return 0;
			    } else {
			        return -1;
			    }
		});
		
		print(employees);

	}

}
