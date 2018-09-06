package av.java;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(reverseString2("HelloA"));

	}

	public static String reverseString(String s) {
       if(s==null || s.length()<2)
           return s;
        return s.charAt(s.length()-1)+reverseString(s.substring(0, s.length()-1));
	}
	
	public static String reverseString2(String s) {
	       if(s==null || s.length()<2)
	           return s;
	       char[] charArr = new char[s.length()];
	       if(s.length()%2==1)
	    	   charArr[(s.length()/2)] = s.charAt((s.length()/2));
	       for(int i=0; i<s.length()/2; i++ ) {
	    	   charArr[(s.length()-1)-i] = s.charAt(i);
	    	   charArr[i] = s.charAt((s.length()-1)-i);
	       }
	       
	       return new String(charArr);
		}
}
