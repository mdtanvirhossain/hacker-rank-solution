package demo.hackerrank.java;

import java.io.IOException;
import java.util.Scanner;

public class TheLoveLetterMystery {

	// check is_palindrome using recursion
	static boolean isPalindrome(String s) {

		if (s.length() <= 1) {
			return true;
		} else if (s.charAt(0) == s.charAt(s.length() - 1)) {
			return isPalindrome(s.substring(1, s.length() - 1));
		} else {
			return false;
		}
	}
	
	// Complete the theLoveLetterMystery function below.
	static int theLoveLetterMystery(String s) {
		int count = 0;
		
		while(!isPalindrome(s)) {
			
		}
		
		return count;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			String s = scanner.nextLine();

			int result = theLoveLetterMystery(s);

			// bufferedWriter.write(String.valueOf(result));
			// bufferedWriter.newLine();

			System.out.println(result);
		}

		// bufferedWriter.close();

		scanner.close();
	}

}
