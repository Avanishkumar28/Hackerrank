package av.java.algo;

import java.util.stream.IntStream;

/**Print Pettren
 * Input: 4
 * Output:  1
 *			121
 *			12321
 *			1234321
 * *************************
 * Input: 5
 * Output: 	1
 *			121
 *			12321
 *			1234321
 *			123454321
 * */

public class ChallengeOne {
	
	public static void main(String[] args) {
		solveChallenge(4);
		solveChallenge(5);
	}

	
	public static void solveChallenge(int num) {
		
		IntStream.rangeClosed(1, num).map(n -> (int) Math.pow(10, n)/9)
							   .mapToObj(n -> n*n )
							   .forEach(System.out::println);
		
		/*for(int num_i = 1; num_i<=num; num_i++) {
			int base = (int) Math.pow(10, num_i)/9;   //---- ((10^i)/9)*((10^i)/9)
			System.out.println(base*base);
		}*/
	}
}
