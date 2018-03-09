package av.java.algo;


/**
 * Sample Input 0

	3
	11 2 4
	4 5 6
	10 8 -12
	Sample Output 0
	
	15
	Explanation 0
	
	The primary diagonal is:
	
	11
	   5
	     -12
	Sum across the primary diagonal: 11 + 5 - 12 = 4
	
	The secondary diagonal is:
	
	     4
	   5
	10
	Sum across the secondary diagonal: 4 + 5 + 10 = 19 
	Difference: |4 - 19| = 15
 * */
/**
 * @author kumara2
 *
 */
public class AbsoluteOfMatrix {

	public static void main(String[] args) {
		
		int[][] a = new int[][] {
									{11, 2, 4},
									{4, 5, 6},
									{10, 8, -12}
								};
        
        int result = diagonalDifference(a);
        System.out.println(result);

	}

	static int diagonalDifference(int[][] a) {
        int tolatForwordDiagonal = 0;
        int tolatBackwordDiagonal = 0;
        for(int row_a = 0; row_a<a.length; row_a++){
            
            tolatForwordDiagonal += a[row_a][row_a];
            tolatBackwordDiagonal += a[row_a][a.length-row_a-1];
            
        }
        System.out.println(tolatForwordDiagonal+"  "+tolatBackwordDiagonal);
        return Math.abs(tolatForwordDiagonal-tolatBackwordDiagonal);
    }
}
