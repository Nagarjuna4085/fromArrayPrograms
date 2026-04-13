package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountofEmp {
	public static void main(String[] args) {
		EmployeeList list1 = new  EmployeeList();
		
		Map<String,Integer> depCount = new HashMap();
		for(Employee emp : list1.empList) {
			depCount.put(emp.depName,depCount.getOrDefault(emp.depName, 0)+1);
		}
		
//		for(Map.Entry<String, Integer> entry:depCount.entrySet()) {
//			System.out.println(entry.getKey() + "  " + entry.getValue());
//			
//		}
		
//		depCount.forEach((k,v)->{
//			System.out.println(k+" " +v);
//		});
		
//		for(int i=0;i<list1.empList.size();i++) {
//			String key = list1.empList.get(i).depName;
//			if(depCount.containsKey(key)) {
//				System.out.println(key+ " " + depCount.get(key));
//			}
//		}
		
	Set<String> keys =	depCount.keySet();
	System.out.println(keys);
	for(String k : keys) {
		System.out.println(k + " " + depCount.get(k));
	}
		
	Collection<Integer> vals =  depCount.values();
	for(Integer val : vals) {
		System.out.println("val " + val);
	}
		
		
	}

}
