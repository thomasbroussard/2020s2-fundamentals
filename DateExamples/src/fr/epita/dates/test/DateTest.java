package fr.epita.dates.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
	public static void main(String[] args)  {
		Date date = new Date();
		System.out.println(date);
		
		System.out.println(date.getTime());
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		System.out.println(format.format(date));
		
		SimpleDateFormat onlyDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		String dateAsString = "2020-11-09";
		Date convertedDate = null;
		try {
			convertedDate = onlyDateFormat.parse(dateAsString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}
		System.out.println(convertedDate);
		
		Calendar calendar = Calendar.getInstance();
		
		calendar.setTime(convertedDate);
		
		int month = calendar.get(Calendar.MONTH);
		System.out.println(month);
	}
}
