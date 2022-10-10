package com.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateDemo {

	public static void main(String[] args) {

		LocalDate d1 = LocalDate.now();
		System.out.println(d1);
		System.out.println(d1.minusDays(2));
		System.out.println(d1.plusDays(4));

		// converting date to string

		String date1 = d1.format(DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(date1);

		LocalTime t1 = LocalTime.now();
		System.out.println(t1);

		LocalDateTime c1 = LocalDateTime.now();
		System.out.println(c1);

		// formatting date and time
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd-MM-yyy  hh:mm:ss");
		String date2 = c1.format(f1);
		System.out.println(date2);
	}

}
