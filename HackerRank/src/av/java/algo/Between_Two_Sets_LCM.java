package av.java.algo;

import java.util.stream.IntStream;
import java.util.stream.LongStream;


/**
 * You will be given two arrays of integers. You will be asked to determine all integers that satisfy the following two conditions:

The elements of the first array are all factors of the integer being considered
The integer being considered is a factor of all elements of the second array
These numbers are referred to as being between the two arrays. You must determine how many such numbers exist.

Constraints

Raw Input Format

The first line contains two space-separated integers describing the respective values of , the number of elements in array , and , the number of elements in array . 
The second line contains  distinct space-separated integers describing . 
The third line contains  distinct space-separated integers describing .

Sample Input 0

2 3
2 4
16 32 96
Sample Output 0

3
Explanation 0

2 and 4 divide evenly into 4, 8, 12 and 16. 
4, 8 and 16 divide evenly into 16, 32, 96.

4, 8 and 16 are the only three numbers for which each element of A is a factor and each is a factor of all elements of B.
**/
public class Between_Two_Sets_LCM {

	public static void main(String[] args) {
		//int[] firstArray = {2,4};
		//int[] secondArray = {16, 32, 96};
		
		int[] firstArray = {100, 99, 98, 97, 96, 95, 94, 93, 92, 91};
		int[] secondArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println(lcm(firstArray));
		long firstLCM =  lcm(firstArray);
		
		System.out.println(gcd(secondArray));
		long secondGCD =  gcd(secondArray);
		
		LongStream.rangeClosed(firstLCM, secondGCD)
				.filter(num -> num%firstLCM==0)
				.filter(num -> secondGCD%num==0)
				.peek(System.out :: println)
				//.forEach(System.out :: println);
				.count();

	}

	private static long lcm(long a, long b){
	    return a * (b / gcd(a, b));
	}

	private static long lcm(int... input){
	    long result = input[0];
	    for(int i : input) 
	    	result = lcm(result, i);
	    return result;
	}
	
	private static long gcd(long a, long b){
	    while (b > 0){
	        long temp = b;
	        b = a % b; // % is remainder
	        a = temp;
	    }
	    return a;
	}

	private static long gcd(int... input){
	    long result = input[0];
	    for(int i : input) 
	    	result = gcd(result, i);
	    return result;
	}
}
