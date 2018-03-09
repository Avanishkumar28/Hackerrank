package av.java.algo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/** Format date in 24 Hrs format
 * Input: 07:05:45PM
 * Output: 19:05:45
 * 
 * Input: 07:05:45AM
 * Output: 07:05:45
 * 
 * Input: 12:00:00AM
 * Output: 00:00:00
 * 
 * */

public class ChallengeThree {

    static String timeConversion(String s) {
    	final String SEPRATOR = ":";
        String[] timeArr = s.split(SEPRATOR);
        String amOrpm = timeArr[2].substring(2);
        String sec = timeArr[2].substring(0, 2);
        StringBuilder sb = new StringBuilder();
        if(amOrpm.equals("PM")){
            Integer hr = Integer.valueOf(timeArr[0])+12;
            sb.append(hr).append(SEPRATOR).append(timeArr[1]).append(SEPRATOR).append(sec);
        }else {
        	sb.append(timeArr[0]).append(SEPRATOR).append(timeArr[1]).append(SEPRATOR).append(sec);
        }
        
        return sb.toString();
    }
    
    static String timeConversionTwo(String s) {
    	return LocalTime.parse(s, DateTimeFormatter.ofPattern("hh:mm:ssa"))
    					.format(DateTimeFormatter.ofPattern("HH:mm:ss"))
    					.toString();
    }

    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);*/
        String result = timeConversion("07:05:45PM");
        String result2 = timeConversion("07:05:45AM");
        System.out.println(result);
        System.out.println(result2);
        
        String resultTwo = timeConversionTwo("07:05:45PM");
        String resultTwo2 = timeConversionTwo("07:05:45AM");
        String resultTwo3 = timeConversionTwo("12:00:00AM");
        System.out.println(resultTwo);
        System.out.println(resultTwo2);
        System.out.println(resultTwo3);
    }
}
