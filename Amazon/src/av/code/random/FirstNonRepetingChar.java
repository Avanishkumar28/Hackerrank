package av.code.random;

public class FirstNonRepetingChar {
	
	public static String firstChar(String input) {
		if(input == null)
			return "";
		
		while(!input.isEmpty()) {
			char c = input.charAt(0);
			int l = input.length();
			input = input.replaceAll(String.valueOf(c), "");
			if(l-input.length()==1)
				return String.valueOf(c);
		}
		
		return "";
	}

	public static void main(String[] args) {
		
		System.out.println(firstChar("GeeksforGeeks"));
		System.out.println(firstChar("incorrect"));
		System.out.println(firstChar("correct"));
		System.out.println(firstChar("correcttoe"));
		System.out.println(firstChar(null));
	}

}
