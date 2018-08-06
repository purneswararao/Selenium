package core_java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CurrentTimeandDate {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yy/mm/dd");
		LocalTime t= LocalTime.now();
		LocalDate d=LocalDate.now();
		System.out.println(d);
		System.out.println(t);
		System.out.println(now);
		System.out.println(dtf);
	
	}

}
