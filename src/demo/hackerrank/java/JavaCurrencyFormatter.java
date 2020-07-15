package demo.hackerrank.java;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		// Write your code here.
		NumberFormat usFormatter = NumberFormat.getCurrencyInstance(Locale.US);
		String us = usFormatter.format(payment);

		NumberFormat IndiaFormatter = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
		String india = IndiaFormatter.format(payment);

		NumberFormat chinaFormatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
		String china = chinaFormatter.format(payment);

		NumberFormat franceFormatter = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		String france = franceFormatter.format(payment);

		System.out.println("US: " + us);
		System.out.println("India: " + india);
		System.out.println("China: " + china);
		System.out.println("France: " + france);
	}
}
