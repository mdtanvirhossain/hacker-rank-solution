package demo.hackerrank.java;

import java.util.Scanner;
import java.util.StringTokenizer;


public class StringTokens {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		String param = scanner.nextLine();
		StringTokenizer st = new StringTokenizer(param);
		
		System.out.println(st.countTokens());
		
		for (int i = 0; st.hasMoreTokens(); i++) {
			System.out.println(i + st.nextToken());
		}
	}
}
