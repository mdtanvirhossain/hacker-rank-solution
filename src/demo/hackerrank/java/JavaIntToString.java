package demo.hackerrank.java;

import java.util.Scanner;

public class JavaIntToString {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 int n = scanner.nextInt();
		 String str = String.valueOf(n);
		 if (n == Integer.parseInt(str) ) {
			 System.out.println("Good job");
		}
		 else {
			 System.out.println("Wrong answer.");
		}

	}

}
