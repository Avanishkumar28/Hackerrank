package av.code.delhi;

public class MedianOfTwoSortedArray {
	
	public double medianOfTwoSortedArray(int[] a, int[] b) {
		if(a.length<b.length)
			return findMedianOfTwoSortedArray(a, b);
		else
			return  findMedianOfTwoSortedArray(b, a);
			
	}
	
	public double findMedianOfTwoSortedArray(int[] array_One, int[] array_two) {
		int min_index = 0;
		int max_index = array_One.length;
		
		int i = (min_index+max_index)/2;
		int j = (array_One.length+array_two.length+1)/2-i;
		int median = 0;
		
		while(min_index<=max_index) {
			if (i <= array_One.length && j > 0 && array_two[j] > array_One[i-1])     
                min_index = i + 1;
            else if (i > 0 && j <= array_two.length && array_two[j] < array_One[i - 1])     
                max_index = i - 1;
            else{
                if (i == 0)         
                    median = array_two[j - 1];         
                else if (j == 0)         
                    median = array_One[i - 1];         
                else   
                    median = maximum(array_One[i - 1], array_two[j - 1]);         
                break;
            }
		}
		
		if ((array_One.length + array_two.length) % 2 == 1)
            return (double)median;
        if (i == array_One.length)
            return (median + array_two[j]) / 2.0;
        if (j == array_two.length)
            return (median + array_One[i]) / 2.0;
         
        return (median + minimum(array_One[i],array_two[j]));
		
	}

	private int minimum(int a, int b) {
		return a<b? a : b;
	}

	private int maximum(int a, int b) {
		return a>b? a : b;
	}

	public static void main(String[] args) {
		MedianOfTwoSortedArray mOfTwoSortedArray = new MedianOfTwoSortedArray();
		
		int[] a = {1,5,7,9,10};
		int[] b = {1,3,4,6};
		
		System.out.println(mOfTwoSortedArray.medianOfTwoSortedArray(a,b));

	}

	
	/*public double findMedianOfTwoSortedArray(int[] array_One, int[] array_two) {
		int min_index = 0;
		int max_index = array_One.length;
		
		int i = (min_index+max_index)/2;
		int j = (array_One.length+array_two.length+1)/2-i;
		int median = 0;
		
		while(min_index<=max_index) {
			if (i < array_One.length && j > 0 && array_two[j - 1] > array_One[i])     
                min_index = i + 1;
            else if (i > 0 && j < array_two.length && array_two[j] < array_One[i - 1])     
                max_index = i - 1;
            else{
                if (i == 0)         
                    median = array_two[j - 1];         
                else if (j == 0)         
                    median = array_One[i - 1];         
                else   
                    median = maximum(array_One[i - 1], array_two[j - 1]);         
                break;
            }
		}
		
		if ((array_One.length + array_two.length) % 2 == 1)
            return (double)median;
        if (i == array_One.length)
            return (median + array_two[j]) / 2.0;
        if (j == array_two.length)
            return (median + array_One[i]) / 2.0;
         
        return (median + minimum(array_One[i],array_two[j]));
		
	}*/
}
