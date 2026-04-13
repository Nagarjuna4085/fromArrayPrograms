package collections;

import java.util.HashMap;
import java.util.Map;

public class SalaryCompute {
	public static void main(String[] args) {
		EmployeeList list1 = new EmployeeList();
		Map<String, Map<String, Double>> minMax = new HashMap<>();
		for (Employee emp : list1.empList) {
			String dep = emp.depName;
			if (minMax.containsKey(dep)) {
				Map<String, Double> depMap = minMax.get(dep);

				double oldMinSal = depMap.get("minSalary");
				double oldMaxSal = depMap.get("maxSalary");
				depMap.put("minSalary", Math.min(oldMinSal, emp.salary));
				depMap.put("maxSalary", Math.max(oldMaxSal, emp.salary));

			} else {
				Map<String, Double> map1 = new HashMap<>();
				map1.put("minSalary", emp.salary);
				map1.put("maxSalary", emp.salary);

				minMax.put(dep, map1);
			}

		}

		for (Map.Entry<String, Map<String, Double>> entry : minMax.entrySet()) {
			Map<String, Double> val = entry.getValue();
			System.out.println(entry.getKey() + " " + "minSalary :  " + val.get("minSalary") + "  " + "maxSalary:  "
					+ val.get("maxSalary"));
		}

	}

}
