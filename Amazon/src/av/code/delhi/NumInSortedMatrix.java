package av.code.delhi;

public class NumInSortedMatrix {
	
	public static boolean findNumber(int[][] nums, int num) {
		if(nums==null || nums.length<1)
			return false;
		
		return binarySearch(nums, num, 0, 0, nums.length, nums[0].length);
	}
	
	private static boolean binarySearch(int[][] array, int num, int startRow, int startCol, int endRow, int endCol) {
		if(startRow>endRow || startCol>endCol)
			return false;
		
		int midRow = startRow+((endRow-startRow)/2);
		int midCol = startCol+((endCol-startCol)/2);
		
		if(array[midRow][midCol]==num)
			return true;
		else if(array[midRow][midCol]<num)
			return binarySearch(array, num, midRow+1, midCol+1, endRow, endCol);
		else
			return binarySearch(array, num, startRow, startCol, midRow-1, midCol-1); 
	}

	public static void main(String[] args) {
		int array[][] = {{1,2,3,4,5},
						 {6,7,8,9,10},
						 {11,12,13,14,15},
						 {16,17,18,19,20},
						 {21,22,23,24,25}
						};

		System.out.println("Is 8 in array: "+findNumber(array, 8));
	}

}
