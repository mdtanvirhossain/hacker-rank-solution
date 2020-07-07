package demo.hackerrank.java;

import java.util.Scanner;

public class JavaSubstring {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();

		int start = scanner.nextInt();
		int end = scanner.nextInt();

		System.out.println(str.substring(start, end));
		
		scanner.close();
	}

}
