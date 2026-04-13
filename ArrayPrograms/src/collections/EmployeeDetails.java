package collections;

import java.util.HashSet;
import java.util.Set;

public class EmployeeDetails {
	public static void main(String[] args) {
		EmployeeList emps = new EmployeeList();
		emps.empList.add(new Employee("001","Abcd","Male","CSE","working",456787.9869));
		
//		System.out.println(emps.empList);
		//using list
		for(Employee emp : emps.empList) {
			System.out.println(emp.empName);
		}
		
		// set 
		Set<Employee> setEmps = new HashSet<>();
		for(Employee emp : emps.empList) {
			setEmps.add(emp);
		}
		
		for(Employee emp : setEmps) {
			System.out.println(emp.empId);
		}
		
	}

}
