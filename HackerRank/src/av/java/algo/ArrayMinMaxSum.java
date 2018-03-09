package av.java.algo;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayMinMaxSum {

static void miniMaxSum(int[] arr) {
        
        long min = Arrays.stream(arr).boxed().sorted().mapToLong(i -> i).limit(4).sum();
        long max = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).mapToLong(i -> i).limit(4).sum();
        System.out.println(min+" "+max);
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        
        miniMaxSum(arr);
    }
}
