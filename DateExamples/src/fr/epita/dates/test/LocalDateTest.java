package fr.epita.dates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.TimeZone;

public class LocalDateTest {

	public static void main(String[] args) {
//		LocalDate date = new LocalDate(0, 0, 0);
//		date.
		Date date = new Date();
		
		
		ZoneId GMT = ZoneId.of("GMT");
		LocalDate localDate = date
				.toInstant()
				.atZone(GMT)
				.toLocalDate();
		
	
		
		System.out.println("converted Date : " + localDate);
		LocalDate now = LocalDate.now();
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String nowAsString = now.format(dateTimeFormatter);
		
		System.out.println(nowAsString);
		
		
		LocalDateTime dateAndTime = now.atTime(14, 53, 0);
		System.out.println(dateAndTime);
		LocalDateTime nowDateAndTime = LocalDateTime.now(GMT);
		System.out.println(nowDateAndTime);
		
	
		LocalDate date2 = LocalDate.parse("1980-05-01", dateTimeFormatter);
		System.out.println(date2);
	
		
		
	}

}
