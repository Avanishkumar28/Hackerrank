package av.code.delhi;

public class MaxProductSubArray {
	
	public static int findMaxProduct(int[] array){
		if(array == null || array.length<1)
			return 0;
		
		int maxProduct = array[0];
		int maxProductSoFar = maxProduct;
		int minProductSoFar = maxProduct;
		
		for(int i = 1; i<array.length; i++) {
			if(array[i]==0) {
				maxProductSoFar = 0;
				minProductSoFar = 0;
			}
			maxProductSoFar = Math.max(maxProductSoFar, Math.max(maxProductSoFar*array[i], array[i]));
			maxProductSoFar = Math.max(maxProductSoFar, minProductSoFar*array[i]);
			
			minProductSoFar = Math.min(minProductSoFar, Math.min(minProductSoFar*array[i], array[i]));
			minProductSoFar = Math.min(minProductSoFar, maxProductSoFar*array[i]);
			
			/*maxProductSoFar = findMax(maxProductSoFar, maxProductSoFar*array[i], array[i]);
			minProductSoFar = findMin(minProductSoFar, minProductSoFar*array[i], array[i]);*/
			
			if(maxProduct<maxProductSoFar) {
				maxProduct = maxProductSoFar;
			}
			
			System.out.println("At: "+i+"  Max so far: "+maxProductSoFar+"  Min so far: "+minProductSoFar+"  Max Product: "+maxProduct);
		}
		
		return maxProduct;
	}

	public static void main(String[] args) {
		int[] array = {1,0,-3,5,-2,1,0,3,-2,2,3,-3};
		System.out.println(findMaxProduct(array));

	}

}
