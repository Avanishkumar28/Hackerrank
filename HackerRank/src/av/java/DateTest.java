package av.java;

import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		final long ONE_MINUTE_IN_MILLIS=60000;//millisecs

		Date aDate = new Date();
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(aDate);
		long t= cal.getTimeInMillis();
		Date afterAddingTenMins=new Date(t + (20 * ONE_MINUTE_IN_MILLIS));
		
		Calendar newCal = Calendar.getInstance();
		newCal.setTime(afterAddingTenMins);
		
		System.out.println(newCal.get(Calendar.HOUR_OF_DAY));

	}

}
