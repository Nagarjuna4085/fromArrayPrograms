package streams;

import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class EmployeeCount {
	public static void main(String[] args) {

		EmployeeList list = new EmployeeList();

		// 1.write a program to print employee details working in each department ?

		
		list.empList.stream().collect(Collectors.groupingBy(emp -> emp.depName)).forEach((dep,e)->{
			System.out.println(dep);
			e.forEach(em -> System.out.println(em.empName));
			System.out.println();
		});
		
		// 2.write a program to print employees count working in each department ?
		
	 Map<String,Long> depCount = 	list.empList.stream().collect(Collectors.groupingBy(emp -> emp.depName,Collectors.counting()));
	 
	 
	 System.out.println(depCount);
	 
	 // 3.write a program to print active and inactive employees in the given collection ?
	 
	 Map<String, List<Employee>> status = list.empList.stream().collect(Collectors.groupingBy(emp -> emp.status));
	 
	 status.forEach((key, employees) -> {
		    System.out.println("Status: " + key);

		    employees.forEach(emp ->
		        System.out.println(emp.empName)
		    );

		    System.out.println();
		});
	 

//	 4.write a program to print Max/Min employee salary from given collection ?
	 
	 OptionalDouble minSalary = list.empList.stream().mapToDouble(emp -> emp.salary).min();
	 
	 System.out.println("min Salary : " + minSalary);

	 
	 OptionalDouble maxSalary = list.empList.stream().mapToDouble(emp -> emp.salary).max();
	 System.out.println("max Salary : " + maxSalary);


	}

}
