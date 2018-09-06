package av.code.random;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		findTallestStudent();

	}

	private static void findTallestStudent() {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		for(int i = 0; i<testCase; i++) {
			int numOfStudents = scanner.nextInt();
			int[] students = new int[numOfStudents];
			for(int j=0; j<students.length; j++){
				students[j] = scanner.nextInt();
			}
			System.out.println();
			System.out.println("TestCase "+i+":: "+tallerStudent(students));
		}
		
		scanner.close();
		
	}

	private static int tallerStudent(int[] students) {
		int tallerStudentAt = 0;
		int seeCount = 1;
		int maxSeeCount = seeCount;
		Map<Integer, Integer> tallStudentMap = new HashMap<>();
		boolean noTaller = false;
		for(int i=1;i<students.length; i++) {
			if(students[tallerStudentAt]<=students[i]) {
				tallStudentMap.put(seeCount, tallerStudentAt+1);
				if(maxSeeCount<seeCount)
					maxSeeCount = seeCount;
				tallerStudentAt = i;
				seeCount = 1;
				noTaller = true;
			}
			else 
				seeCount++;
		}
		if(!noTaller) {
			maxSeeCount = seeCount;
			tallStudentMap.put(seeCount, tallerStudentAt+1);
		}
		tallStudentMap.forEach((k,v)-> {System.out.println(k+"  "+v);});
		if(tallStudentMap.isEmpty())
			return tallerStudentAt+1;
		else {
			return tallStudentMap.get(maxSeeCount);
		}
			
	}

}
