package av.java.algo;

public class SuperNumber {

	public static int getSuperNumber(int num) {
		if(num<10 && num>0)
			return num;
		int temp = num%10;
		num = temp+getSuperNumber(num/10);
		
		return getSuperNumber(num);
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(getSuperNumber(12345));
		
		System.out.println(getSuperNumber(99999));
		System.out.println(getSuperNumber(939398979));

	}

}
