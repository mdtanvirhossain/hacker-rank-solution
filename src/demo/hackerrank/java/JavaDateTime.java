package demo.hackerrank.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class JavaDateTime {

	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);

		String mm = scan.next();
		String dd = scan.next();
		String yyyy = scan.next();

		Integer intdd = Integer.parseInt(dd);
		//intdd = intdd + 1;
		String strdd = Integer.toString(intdd);

		String fullDate = strdd + "/" + mm + "/" + yyyy;

		Date newDate = new SimpleDateFormat("dd/MM/yyyy").parse(fullDate);
		SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE");
		System.out.println(simpleDateformat.format(newDate).toUpperCase());

		scan.close();

	}
}
