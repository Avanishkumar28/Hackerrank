package av.interview.cars24;

import java.util.Arrays;
import java.util.Scanner;

public class FlipRS {
	
	private static void findMaxPosiableFlip(String[] arrayG) {
		for(String g : arrayG) {
			System.out.println(maxPosiableR(g));
		}
		
		/*for(String g : arrayG) {
			System.out.println(findMaxR(g));
		}*/
	}

	private static int maxPosiableR(String g) {
		if (g == null || g.isEmpty()) {
			return 0;
		}else if(g.length()==1){
			return g.contains("R")?0:1;
		}else {
			int gLenght = g.length();
			String rString = g.replaceAll("S", "");
			int rLenght = rString.length();
			int result = 0;
			if((gLenght-rLenght)==0) {
				result = gLenght-1;
			}else if((gLenght-rLenght) == gLenght) {
				result = gLenght;
			}else if((gLenght-rLenght)==rLenght) {
				String subS = g.substring(g.indexOf("S"), g.lastIndexOf("S")+1);
				if(subS.length() == g.length())
					result = maxPosiableR(subS.substring(1,subS.length()));
				else
					result = (gLenght-subS.length())+maxPosiableR(subS);
				
			}else if((gLenght-rLenght)>rLenght) {
				String subS = g.substring(g.indexOf("S"), g.lastIndexOf("S")+1);
				if(subS.length() == g.length()) {
					if(subS.startsWith("S")) {
						result = gLenght-rLenght+1;
					}else
						result = gLenght-rLenght;
				}
				else {
					int subResult = maxPosiableR(subS);
					
					result = (gLenght-subS.length())+subResult;
				}
			}else {
				String subS = g.substring(g.indexOf("S"), g.lastIndexOf("S")+1);
				int subResult = maxPosiableR(subS);
				
				result = (gLenght-subS.length())+subResult;
			}
			
			return result;
		}
		
		
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int testCase = Integer.parseInt(scanner.nextLine());
		String[] arrayG = new String[testCase];
		for(int i=0; i<testCase; i++) {
			arrayG[i] = scanner.nextLine();
		}
		scanner.close();
		System.out.println(Arrays.toString(arrayG));
		findMaxPosiableFlip(arrayG);
	}

	private static int findMaxR(String str) {
        int str_1_r = 0;
        int max = 0;
        for(int i = 0 ; i < str.length() ;i++) {
               str_1_r = findCount(str.substring(0, i),"R");
               for(int j = i ; j < str.length() ; j++) {
                     int str_2_r = findCount(str.substring(i,j+1),"S");
                     int str_3_r = findCount(str.substring(j+1),"R");
                     if(max < (str_1_r + str_2_r + str_3_r)) {
                            max = (str_1_r + str_2_r + str_3_r);
                     }
                     if(max == str.length())
                            return max;
               }
               
        }
        return max;
	 }
	
	 private static int findCount(String substring, String string) {
	        if (null == substring)
	               return 0;
	        int len = substring.length();
	        substring = substring.replaceAll(string, "");
	        return len-substring.length();
	 }
	 
	 
	 @Override
	 public String toString() {
		 return "Hello: Coustom toString method.";
	 }


}
