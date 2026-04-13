package collections;

import java.util.HashMap;
import java.util.Map;

public class MaxSalary {
	public static void main(String[] args) {
		EmployeeList list1 = new EmployeeList();
		Map<String, Double> mxSal = new HashMap();

		for (Employee emp : list1.empList) {

			// with merge

//			mxSal.merge(emp.depName, emp.salary, (oldval,newVal) ->Math.max(oldval, newVal));

			// with putifabsent

//			mxSal.putIfAbsent(emp.depName, emp.salary);
//			mxSal.put(emp.depName, Math.max(emp.salary, mxSal.get(emp.depName)));
			
			//with compute
			
			mxSal.compute(emp.depName, (k,v) -> {
				if(v == null) {
					return emp.salary;
				}else {
					return Math.max(v, emp.salary);
				}
			});
		}

		mxSal.forEach((k, v) -> {
			System.out.println(k + " " + v);
		});

	}
}
