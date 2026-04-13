package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Status {
	public static void main(String[] args) {
		EmployeeList list1 = new EmployeeList();
		List<Employee> activeList = new ArrayList<>();
		List<Employee> inactiveList = new ArrayList<>();
		List<Double> salaries = new ArrayList<>();
		
		
		Double maxSalary = Double.MIN_VALUE;
		Double minSalary = Double.MAX_VALUE; 
		for(Employee emp :list1.empList) {
			if(emp.status.equals("active")) {
				activeList.add(emp);
			}else {
				inactiveList.add(emp);
				
			}
		}
		// active list
		for(Employee ac : activeList) {
//			System.out.println(ac.status);
		}
		
		//inactive list
		
		for(Employee inac : inactiveList) {
//			System.out.println(inac.status);
		}
		
		// lets create map with two keys active and inactive
		Map<String,List<Employee>> statusOfEmp = new HashMap();
		
		for(Employee emp : list1.empList) {
			
			salaries.add(emp.salary);
			maxSalary = Math.max(maxSalary, emp.salary);
			minSalary = Math.min(minSalary, emp.salary);
//			statusOfEmp.put(null, emp)
//			if(statusOfEmp.containsKey(emp.status)) {
//				statusOfEmp.get(emp.status).add(emp);
//			}else {
				// general way 
//		        List<Employee> list = new ArrayList<>();
//		        list.add(emp);
//				statusOfEmp.put(emp.status, list);
				
				// with put if absent
				
				statusOfEmp.putIfAbsent(emp.status, new ArrayList<>());
				statusOfEmp.get(emp.status).add(emp);
//			}
		}
		
		
//		System.out.println(statusOfEmp);
		
		
		
		// max and min of salary
		
		System.out.println("max salary" + maxSalary);
		System.out.println("min salary" + minSalary);
		
		

	}
}
