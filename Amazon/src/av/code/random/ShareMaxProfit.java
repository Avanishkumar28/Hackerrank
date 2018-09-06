package av.code.random;

import java.util.Arrays;

public class ShareMaxProfit {

	public static int findMaxProfit(int[] sharePrice) {
		
		int profit = 0;
		
		if(sharePrice != null && sharePrice.length>1) {
			int buy = sharePrice[0];
			int sell = sharePrice[1];
			profit = sell - buy;
			for(int i = 2; i<sharePrice.length; i++) {
				if(sharePrice[i]-buy>profit) {
					sell = sharePrice[i];
					profit = sell - buy;
				}else{
					if(buy>sharePrice[i]) {
						buy = sharePrice[i];
					}
				}
			}
		}
		
		return profit;
	}
	
	public static int[] findMaxProfitBuySell(int[] sharePrice) {
		
		int[] profitArr = new int[3];
		
		if(sharePrice != null && sharePrice.length>1) {
			int buy = sharePrice[0];
			int sell = sharePrice[1];
			int tempBuy = buy;
			int profit = sell - buy;
			for(int i = 1; i<sharePrice.length; i++) {
				if((sharePrice[i]-tempBuy) > profit) {
					sell = sharePrice[i];
					buy = tempBuy;
					profit = sell - buy;
				}else{
					if(buy>sharePrice[i]) {
						tempBuy = sharePrice[i];
					}
				}
			}
			
			profitArr[0] = buy;
			profitArr[1] = sell;
			profitArr[2] = profit;
		}
		
		return profitArr;
	}
	
	public static void main(String[] args) {
		int[] input_1 = {90,100,30,55,60,200,40,25,40};
		//int[] input_1 = {90,70,60,50,40};
		//int[] input_1 = {40,30,45,80,75,55,90,60};
		
		System.out.println(findMaxProfit(input_1));
		
		System.out.println(Arrays.toString(findMaxProfitBuySell(input_1)));
	}

}
