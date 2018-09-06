package av.java.algo;

import java.util.stream.IntStream;

public class PrimeNumber {

	/*public static void printPrimeNumber(int range){
		int primeOne = 1;
		int primeTwo = 2;
		if(range>=primeOne)
			System.out.println(primeOne);
		if(range>=primeTwo)
			System.out.println(primeTwo);
		if(range>=3)
			System.out.println(3);
		
		int n=1;
		while(range>primeOne && range>primeTwo) {
			System.out.println("n>>>>>>> "+n);
			primeOne = (n*6)-1;
			System.out.println(primeOne);
			if(n%4!=0) {
				primeTwo = (n*6)+1;
				System.out.println(primeTwo);
			}
			
			n++;
		}
	}*/
	
	public static void printAllPrimeNumber(int range) {
		IntStream.rangeClosed(2, range)
		//.filter(PrimeNumber :: isPrimeNumberByArti)
		//.peek(n -> {System.out.println("By Arti: "+n);})
		.filter(PrimeNumber :: isPrimeNumber)
		.forEach(System.out :: println);
	}
	
	public static boolean isPrimeNumber(int n) {
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
	
	/* 
	public static boolean isPrimeNumberByArti(int n) {
		if (n<=1)
	        return false;
	     else if (n<= 3)
	        return true;
	     else if ((n%2==0) || (n%3==0) || (n%5==0) || (n%7==0) || (n%11==0))
	        return false;
	     else
	    	 return true;
    int i=5;
     while (i * i <= n) {
    	 if((n%i==0) || (n%(i + 2))==0)
    	            return false;
    	  i += 6;
     }
        
     return true;
	}
*/
	
	public static void main(String[] args) {
		
		printAllPrimeNumber(100);
	}

}
