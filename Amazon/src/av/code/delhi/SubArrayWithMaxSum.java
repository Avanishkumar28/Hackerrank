package av.code.delhi;

public class SubArrayWithMaxSum {
	
	private static int maxSumBySubArray(int[] array) {
		if(array == null || array.length<1)
			return 0;
		
		int maxSum = array[0];
		int maxSumSoFar = maxSum;
		for(int i = 1; i<array.length; i++) {
			/*int temp = maxSumSoFar + array[i];
			if(temp < array[i])
				maxSumSoFar = array[i];
			else {
				maxSumSoFar = temp;
			}*/
			
			maxSumSoFar = Math.max(array[i], maxSumSoFar + array[i]);
			
			/*if(maxSum < maxSumSoFar) {
				maxSum = maxSumSoFar;
			}*/
			
			maxSum = Math.max(maxSum, maxSumSoFar);
		}
		
		return maxSum;
	}

	public static void main(String[] args) {
		int[] array = {1,-2,-3,3,-2,4,-1,6,-7};  //{3,-2,4,-1,6}=10
		System.out.println(maxSumBySubArray(array));
		
		int[] array_2 = {1,7,-3,3,-2,4,-1,6,-7};  //{1,7,-3,3,-2,4,-1,6}=15
		System.out.println(maxSumBySubArray(array_2));

	}

}
