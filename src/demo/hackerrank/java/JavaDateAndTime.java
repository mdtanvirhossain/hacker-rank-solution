package demo.hackerrank.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

class Result {

	public static String findDay(int month, int day, int year) {
		LocalDate dt = LocalDate.of(year, month, day);
		return dt.getDayOfWeek().toString();
	}
}

public class JavaDateAndTime {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int month = Integer.parseInt(firstMultipleInput[0]);

		int day = Integer.parseInt(firstMultipleInput[1]);

		int year = Integer.parseInt(firstMultipleInput[2]);

		String res = Result.findDay(month, day, year);

		// bufferedWriter.write(res);
		System.out.println(res);
		// bufferedWriter.newLine();

		bufferedReader.close();
		// bufferedWriter.close();
	}
}
