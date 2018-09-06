package av.code.delhi;


public class Power {

	
	/**
	 * calculate n^m where  n,m is +ve number
	 * 
	 * **/
	
	public int getPower(int n, int m) {
		if(m==0)
			return 1;
		if(m<2)
			return n;
		else
			return n*getPower(n, m-1);
	}
	
	public static void main(String[] args) {
		Power pow = new Power();
		
		int result = pow.getPower(4, 3);
		System.out.println(result);
		
		int result2 = pow.getPower(4, 0);
		System.out.println(result2);

	}

}
