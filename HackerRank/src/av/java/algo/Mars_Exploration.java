package av.java.algo;

import java.util.Arrays;

/** 
 * Sami's spaceship crashed on Mars! She sends n sequential SOS messages to Earth for help.
 * 
 * Letters in some of the SOS messages are altered by cosmic radiation during transmission. 
 * Given the signal received by Earth as a string, S, determine how many letters of Sami's SOS have been changed by radiation.
 * 
 * Output Format
 * 
 * Print the number of letters in Sami's message that were altered by cosmic radiation.
 * 
 * Sample Input 0
 * 
 * SOSSPSSQSSOR
 * Sample Output 0
 * 
 * 3
 * 
 * Explanation 0
 * 
 * S = SOSSPSSQSSOR, and signal length |S|= 12. Sami sent 4 SOS messages (i.e.: 12/3=4).
 * 
 * Expected signal: SOSSOSSOSSOS
 * Recieved signal: SOSSPSSQSSOR
 * 
 * We print the number of changed letters, which is .
 **/

public class Mars_Exploration {
	
	public static int detectSignalError(String signal) {
		if(signal.length()%3 != 0)
			return 0;
		String[] signalArr = signal.split("(?<=\\G.{3})");
		
		return Arrays.stream(signalArr)
				  .mapToInt(boxed -> Mars_Exploration.getMismatchNumber(boxed))
				  .sum();
	}
	
	private static int getMismatchNumber(String boxedSignal) {
		final String SOS = "SOS";
		int mismatch = 0;
		char[] boxArr = boxedSignal.toCharArray();
		for(int i=0; i<boxArr.length; i++) {
			if(SOS.charAt(i) != boxArr[i])
				mismatch ++;
		}
		
		return mismatch;
	}
	
	public static void main(String[] args) {
		System.out.println(detectSignalError("SOSSPSSQSSOR"));
		System.out.println(detectSignalError("SOSSOT"));
	}

}
