package av.java.algo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangrams_AtoZ {
	
	public static String havingAtoZ(String s) {
		
		Set<Character> charSet = new HashSet<>();
		s = s.toLowerCase();
		boolean isPresent = s.chars()
							// .filter(intC -> ((intC>=65 && intC<=90) || (intC>=97 && intC<=122)))
							 .filter(intC -> (intC>=97 && intC<=122))
							 .filter(intC -> charSet.add((char) intC))
							 .filter(intC -> charSet.size()==26)
							 .findAny()
							 .isPresent();
		
		return isPresent? "pangram" : "not pangram";
	}

	public static void main(String[] args) {
		String s = "We promptly judged antique ivory buckles for the next prize";
		System.out.println(havingAtoZ(s));
		
		String s1 = "We promptly judged antique ivory buckles for the prize";
		System.out.println(havingAtoZ(s1));
		
		Scanner scanner = new Scanner(System.in);
		int qNum = scanner.nextInt();
		for(int i = 0; i<qNum; i++) {
			String msg = scanner.nextLine();
			
			System.out.println(Pangrams_AtoZ.havingAtoZ(msg));
		}
		scanner.close();
	}

}
