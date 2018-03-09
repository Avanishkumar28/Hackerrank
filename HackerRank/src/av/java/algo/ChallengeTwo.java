package av.java.algo;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChallengeTwo {

	static int birthdayCakeCandles(int n, int[] ar) {
		Map<Integer, Long> candleMap = Arrays.stream(ar)
											 .boxed()
											 .collect(Collectors.groupingBy(a -> a, Collectors.counting()));
		Long maxValue = candleMap.values().stream().max((c, v) -> c.compareTo(v)).get();
		/*
		 * Integer candleHight = candleMap.entrySet() .stream() .filter(e ->
		 * e.getValue()==maxValue) .map(e -> e.getKey()) .findAny() .get();
		 */

		return maxValue.intValue();
	}

	public static void main(String[] args) {
		/*Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ar[ar_i] = in.nextInt();
		}
		int result = birthdayCakeCandles(n, ar);*/
		
		int result = birthdayCakeCandles(4, new int[]{1,3,2,3});
		int result2 = birthdayCakeCandles(7, new int[]{1,3,2,3,4,4,4});
		System.out.println(result);
		System.out.println(result2);
	}
}
