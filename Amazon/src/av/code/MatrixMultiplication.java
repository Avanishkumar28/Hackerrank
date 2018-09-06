package av.code;

import java.util.Arrays;

public class MatrixMultiplication {
	
	public static int[][] multiplyMatrix(int[][] a, int[][] b){
		int[][] resultMatrix = null;
		if(a != null && b != null) {
			resultMatrix = new int[a.length][b[0].length];
			int colB = 0;
			while(colB<b[0].length) {
				int rowB = 0;
				int rowA = 0;
				while(rowA<a.length) {
					int colA = 0;
					rowB = 0;
					int i = 0;
					while(colA<a[0].length) {
						i += a[rowA][colA]*b[rowB][colB];
						
						colA++;
						rowB++;
					}
					
					resultMatrix[rowA][colB] = i;
					rowA++;
				}
				colB++;
			}
		}
		
		return resultMatrix;
	}

	public static void main(String[] args) {
		//A  3X3
		int[][] a = {  					
					{1,2,0},
					{2,1,1},
					{0,1,0}
					};
		//B 3X2
		int[][] b = {
					{1,2},
					{4,1},
					{2,2}
					};
		
		int[][] result = multiplyMatrix(a, b);
		
		System.out.println(Arrays.deepToString(result));

	}

}
