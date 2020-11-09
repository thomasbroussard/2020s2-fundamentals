package fr.epita.logging.tests;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class IamLog {
	
	public void log(String message) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
		String dateAsString = LocalDateTime.now().format(formatter);
		System.out.println(dateAsString + "---" + message); 
	}
}
