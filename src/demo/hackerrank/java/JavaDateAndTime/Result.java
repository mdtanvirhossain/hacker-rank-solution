package demo.hackerrank.java.JavaDateAndTime;

import java.time.LocalDate;

public class Result {

	public static String findDay(int month, int day, int year) {
		LocalDate dt = LocalDate.of(year, month, day);
		return dt.getDayOfWeek().toString();
	}
}
