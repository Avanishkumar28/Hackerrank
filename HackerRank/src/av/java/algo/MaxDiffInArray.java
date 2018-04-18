package av.java.algo;

public class MaxDiffInArray {

	public static void main(String[] args) {
		int[] input = {5, 10, 8, 7, 6, 5};
		System.out.println(findMaxDiff(input));
		
		int[] input_2 = {15, 10, 2, 7, 6, 9};
		System.out.println(findMaxDiff(input_2));
		
		int[] input_3 = {10, 8, 7, 6, 5};
		System.out.println(findMaxDiff(input_3));
		
		int[] input_4 = {10, 10, 10, 10, 10};
		System.out.println(findMaxDiff(input_4));
	}
	
	private static int findMaxDiff(int[] input) {
		int min = input[0];
		int max = input[1];
		
		for(int i = 2; i<input.length; i++) {
			if(min>input[i]) {
				min = input[i];
				max = 0;
			}else if(max<input[i])
				max = input[i];
		}
		
		return max<min? -1 : max-min;
	}

}
