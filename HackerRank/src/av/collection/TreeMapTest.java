package av.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		/*Map<Integer, String> sortedMap = new TreeMap<>();
		for(int i = 0; i<=10; i++) {
			sortedMap.put(i, "Value_"+i);
		}
		
		System.out.println(sortedMap);*/
		
		Map<Employee, String> sortedEmplotee = new TreeMap<>();
		
		for(int i = 0; i<=10; i++) {
			
			sortedEmplotee.put(new Employee(i, "Emp_"+i, i*150), "Value_"+i);
		}
		
		System.out.println(sortedEmplotee);
	}

}
