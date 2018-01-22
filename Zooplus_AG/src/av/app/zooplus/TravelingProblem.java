package av.app.zooplus;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TravelingProblem {

    public static void main(String[] args) {
        System.out.println(solution(new Integer[]{ 1,7,4,1,7,3,4,1}));            
        System.out.println(solution(new Integer[]{ 7,1,3,4,7,3,4,1 }));
        System.out.println(solution(new Integer[]{ 1,7,4,1,7,3,4,1}));
        System.out.println(solution(new Integer[]{ 2,5,2,6,5}));
        System.out.println(solution(new Integer[]{ 7,5,2,7,2,7,4,7}));
    }
    
    public static int solution(Integer[] A){
        
        int result = 0;
        List<Integer> all =  Arrays.asList(A);
        Set<Integer> uni = new HashSet<>(all);
        
        int start = 0;
        
        for (start = 0; start < uni.size(); start++) {
             int end= start+uni.size();
            for(int inStart = 0; end < A.length; inStart++){
                if (all.subList(inStart, end).containsAll(uni)) {
                    result = end - inStart;
                    System.out.println(result);
                    return result;
                }
                end++;
            }
        }
        
        
        
        return result;
    }

}
