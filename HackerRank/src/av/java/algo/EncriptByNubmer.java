package av.java.algo;

import java.util.stream.Collectors;

public class EncriptByNubmer {
	
	private static String encript(String msg, int num) {
		
		return  msg.chars()
					//.sequential()
				    //.peek(System.out :: println)
				    .map(c -> EncriptByNubmer.encriptToNum(c,num))
				    .mapToObj(c -> String.valueOf((char)c) )
				    .collect(Collectors.joining());
		
	}
	
	private static int encriptToNum(int charNum, int num) {
		if(97<= charNum && charNum<=122) {
			charNum += num;
			while(charNum>122)
				charNum = (charNum-122)+96;
		}
		if(65<= charNum && charNum<=90) {
			charNum += num;
			while(charNum>90)
				charNum = (charNum-90)+64;
		}
		
		return charNum;
	}

	public static void main(String[] args) {
		
		//System.out.println(encript("ABabcd-#wxyzYZ", 2));
		System.out.println(encript("a-z", 100));
	}

}
