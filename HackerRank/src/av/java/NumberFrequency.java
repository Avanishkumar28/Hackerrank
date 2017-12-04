package av.java;

import java.util.stream.IntStream;

/**
 * Number frequency in string
 *  
 * */

public class NumberFrequency {

	public static void main(String[] args) {
		String num = "28081991";
		
		IntStream.range(0, 1)
				 .forEach(System.out :: println);
		
		for(int i=0; i<=9; i++) {
			System.out.println(i+ " having Frequency: " +(num.length()-(num.replace(i+"", "").length())));
		}

	}

}
