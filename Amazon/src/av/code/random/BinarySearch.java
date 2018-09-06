package av.code.random;

public class BinarySearch {
	
	public static boolean findNumber(int[] nums, int num) {
		if(nums==null || nums.length<1)
			return false;
		
		return binarySearch(nums, num, 0, nums.length);
	}
	
	private static boolean binarySearch(int[] array, int num, int start, int end) {
		if(start>end)
			return false;
		
		int mid = start+((end-start)/2);
		if(array[mid]==num)
			return true;
		else if(array[mid]<num)
			return binarySearch(array, num, mid+1, end);
		else
			return binarySearch(array, num, start, mid-1); 
	}

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Is 8 in array: "+findNumber(nums, 8));
		
		int[] nums_2 = {1,3,6,7,10,14,18,22,23,25,29,31};
		
		System.out.println("Is 31 in array: "+findNumber(nums_2, 30));
		System.out.println("Is 31 in array: "+findNumber(nums_2, 31));
	}

}
