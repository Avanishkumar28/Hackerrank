package av.java.algo;

public class HackerRank_in_a_String {
	
	public static String isHackerRank_Present(String s) {
		final String hk = "hackerrank";
		int count = 0;
		
		/*s.chars()
		 .mapToObj(intC -> (char) intC)
		 .filter(c -> {
			 if(hk.charAt(count)==c) {
				 count ++;
				 return true;
			 }else 
				 return false;
		 })
		 .map(c -> String.valueOf(c))
		 .collect(Collectors.joining());*/
		
		for(char c : s.toCharArray()) {
			if(hk.charAt(count)==c) {
				 count ++;
			 }
		}
		
		System.out.println(count+" == "+(hk.length()));
		return count==hk.length() ? "YES" : "NO" ;
	}
	
	
	

	public static void main(String[] args) {
		System.out.println(isHackerRank_Present("hereiamstackerrank"));

	}

}
