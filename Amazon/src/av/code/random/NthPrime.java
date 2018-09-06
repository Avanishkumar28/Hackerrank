package av.code.random;

public class NthPrime {

	public static void findNthPrime(int nth) {
		int primeCout = 0;
		int i=1;
		while(true) {
			if(isPrime(i)) {
				primeCout++;
				if(primeCout==nth) {
					System.out.println(i);
					break;
				}
			}
			i++;
		}
	}
	
	public static boolean isPrime(int n) {
		if (n<=1)
	        return false;
	     else if (n<= 3)
	        return true;
	     else if ((n%2==0) || (n%3==0))
	        return false;
	     int i=5;
	     while (i * i <= n) {
	    	 if((n%i==0) || (n%(i + 2))==0)
	    	            return false;
	    	  i += 6;
	     }
	        
	     return true;
	}
	
	public static void main(String[] args) {
		
		findNthPrime(3);
	}

}
