package demo.hackerrank.java;

import java.util.Scanner;;

public class JavaStringTokens {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		// Write your code here.
		if (s.trim().length() == 0) {
			System.out.println("0");
		} else {
			String[] tokens = s.trim().split("[ !,?._'@]+");
			System.out.println(tokens.length);
			for (String token : tokens) {
				System.out.println(token);
			}
		}

		scan.close();
	}
}
