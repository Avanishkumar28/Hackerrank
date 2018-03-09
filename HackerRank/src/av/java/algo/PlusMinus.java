package av.java.algo;

import java.util.Arrays;

public class PlusMinus {

	static void plusMinus(int[] arr) {
		
		//System.out.printf("%.6f \n",Arrays.stream(arr).filter(n -> n>0).count()/arr.length);
		
        float positive = Arrays.stream(arr).filter(n -> n>0).count()/Float.valueOf(arr.length);
        System.out.printf("%.6f \n",positive);
        float negative = Arrays.stream(arr).filter(n -> n<0).count()/arr.length;
        System.out.printf("%.6f \n",negative);
        float zero = Arrays.stream(arr).filter(n -> n==0).count()/arr.length;
        System.out.printf("%.6f \n",zero);
    }

    public static void main(String[] args) {
        int[] arr = new int[] {-4, 3, -9, 0, 4, 1};
        
        plusMinus(arr);
    }
}
