package av.code.delhi;

public class SubStringOf_1 {
	
	/**
	 * find number of sub string which start and ends at 1
	 * 
	 * given string having only 0 and 1
	 * 
	 * subString>1
	 * **/
	
	
	public int subStringStartandEndat_1(String input) {
		int result = 0;
		
		int size = input.length();
		
		input = input.replaceAll("1", "");
		
		result = size-input.length();
		
		return result*(result-1)/2;
	}

}
