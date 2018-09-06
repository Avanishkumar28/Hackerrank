package av.code.random;

/**
 * Island problem
	where 	1--> is island
			0--> is water
	all linked 1 horizontal or vertical are the same island.
**/

public class IslandInMatrix {
	
	public static int findIsland(int[][]  area) {
		int island = 0;
		for(int row = 0; row<area.length; row++) {
			for(int col = 0; col<area[row].length; col++) {
				//if island found increase count
				if(area[row][col]==1) ++island;
				
				//convert all island area to water
				convertIslandAreaToWater(area, row, col);
				
			}
		}
		
		return island;
	}

	private static void convertIslandAreaToWater(int[][] area, int row, int col) {
		  /*if water found return OR if reach to end of area return*/
		if(row>=area.length || row<0 || col>=area[row].length || col<0 || area[row][col]==0)
			return;
		
		/*Convert to water and look surrounding*/
		area[row][col]=0;
		
		convertIslandAreaToWater(area, row+1, col);
		//convertIslandAreaToWater(area, row-1, col);
		convertIslandAreaToWater(area, row, col+1);
		//convertIslandAreaToWater(area, row, col-1);
		
	}

	public static void main(String[] args) {
		int[][]  area = {{1,1,1,0,0},
						 {1,1,0,0,0},
						 {0,0,1,0,0},
						 {0,0,0,1,1},
						 {0,0,0,0,1}
						};

		System.out.println("Total Islend: "+findIsland(area));
		
		int[][]  area_2 = {{1,0,1,0,0},
						   {1,1,0,1,1},
						   {0,0,1,0,0},
						   {1,0,0,1,1},
						   {1,0,0,0,1}
						  };

		System.out.println("Total Islend: "+findIsland(area_2));
	}

}
