package av.java;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortBigDecimal {

	public static void main(String[] args) {
		
		 String s[]={"-100", "50", "0", "56.6", "90", "0.12", ".12", "02.34", "000.000"};
		   //Write your code her
       /*List<String> resultList = Arrays.stream(s)
							            .map(BigDecimal :: new)
							            .sorted((bd1, bd2) -> bd2.compareTo(bd1))
							            .map(bd -> String.valueOf(bd))
							            .collect(Collectors.toList());
        
       resultList.forEach(System.out :: println);
       s = (String[]) resultList.toArray();*/
		 
		s = Arrays.stream(s)
		            .peek(System.out :: println)
		            .sorted((bd1, bd2) -> new BigDecimal(bd2).compareTo(new BigDecimal(bd1)))
		            .toArray(String[] :: new);
		 
		 Arrays.stream(s).forEach(System.out :: println);

	}

}
