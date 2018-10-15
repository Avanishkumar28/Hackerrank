package av.code.random;

import java.util.Arrays;

public class MaxTempDifferance {
	
	public static String getMaxTempDiffSeason(int[] tempArray) {
		int id = 0;
		int l = tempArray.length;
		int daysInASeason = l/4;
		int maxDiffTemp = 0;
		int maxDiffTempSoFar = maxDiffTemp;
		int i = 0;
		while(i<l) {
			int[] seasonDays = Arrays.copyOfRange(tempArray, i, i+daysInASeason);
			System.out.println(Arrays.toString(seasonDays));
			i = i+daysInASeason;
			Arrays.sort(seasonDays);
			maxDiffTempSoFar = Math.max(maxDiffTempSoFar, (Math.abs(seasonDays[0])+Math.abs(seasonDays[daysInASeason-1])));
			if(maxDiffTemp<maxDiffTempSoFar) {
				id = i/daysInASeason;
				maxDiffTemp = maxDiffTempSoFar;
			}
			
		}
		
		return getSeason(id);
	}
	
	private static String getSeason(int id) {
		String sesion = null;
		switch(id) {
		case 1:
			sesion = "WINTER";
			break;
		case 2:
			sesion = "SPRING";
			break;
		case 3:
			sesion = "SUMMER";
			break;
		case 4:
			sesion = "AUTUMN";
			break;
		default:
			sesion =  "Invalide sesion ID";
		}
		
		return sesion;
	}

	public static void main(String[] args) {
		
		//Given temperate of all seasons
		int[] array = {-1,5,-3,4,7,-1,-5,18,22,5,-7,8};
		
		System.out.println(getMaxTempDiffSeason(array));

	}

}
