package av.java.algo;

import java.util.HashMap;
import java.util.Map;

public class Programmer {
	
	public static int findProgrammer(String line) {
		Map<String, Integer> pMap = new HashMap<>();
		pMap.put("p", 1);
		pMap.put("r", 3);
		pMap.put("o", 1);
		pMap.put("g", 1);
		pMap.put("a", 1);
		pMap.put("m", 2);
		pMap.put("e", 1);
		
		int pCount = 0;
		int index = 0;
		for(char c : line.toCharArray()) {
			if(pCount == 10) {
				if(pMap.get(String.valueOf(c))!= null)
					break;
				index += 1;
			}
			
			if(pMap.get(String.valueOf(c))!= null && pMap.get(String.valueOf(c))>0) {
				pMap.put(String.valueOf(c), pMap.get(String.valueOf(c))-1);
				pCount ++;
			}
			
		}
		
		
		return index;
	}

	public static void main(String[] args) {
		System.out.println(findProgrammer("programmerxprogrammer"));
		System.out.println(findProgrammer("programmerxyzogrprammer"));

	}

}
