package demo.hackerrank.java;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String a = scanner.next();

		// reversing a string

		char myCharArray[] = a.toCharArray();
		String reversedString = "";
		for (int i = myCharArray.length - 1; i >= 0; i--) {
			reversedString += myCharArray[i];
		}

		// end

		// 2nd way
		/*
		 * StringBuilder sb = new StringBuilder(a); sb.reverse(); String reversedString
		 * = sb.toString();
		 */

		if (a.equals(reversedString)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		scanner.close();
	}

}
