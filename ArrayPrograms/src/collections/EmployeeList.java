package collections;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
	List<Employee> empList = new ArrayList<>();

	public EmployeeList() {
//		 empId,empName,gender,depName,status,salary.

		// TODO Auto-generated constructor stub
		empList.add(new Employee("001","Abcd","Male","CSE","active",456787.9869));
		empList.add(new Employee("002","Abcdw","Female","ECE","inactive",4567.986));
		empList.add(new Employee("003","Abcdwfe","Male","MECH","active",45647.986));
		empList.add(new Employee("004","Abcdqwed","Female","CIVIL","inactive",4567.9886));
		empList.add(new Employee("005","Abcdqed","Female","CSE","active",456.986));
		empList.add(new Employee("006","Abcd2ff","Male","Food","active",467.986));
		empList.add(new Employee("007","Abcdesfdggrf","Female","CSE","inactive",567.986));
	}

	static void main(String[] args) {

	}

}
