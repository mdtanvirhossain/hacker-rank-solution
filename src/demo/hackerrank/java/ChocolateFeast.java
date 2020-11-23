package demo.hackerrank.java;

import java.util.Scanner;

public class ChocolateFeast {

	// Complete the chocolateFeast function below.
	static int chocolateFeast(int n, int c, int m) {

		int totalNum = n / c;

		int tw = totalNum;

		int remWr = tw % m;

		while (tw >= m) {
			int newBar = tw / m;
			totalNum = totalNum + newBar;
			tw = newBar + remWr;
			remWr = tw % m;
		}

		return totalNum;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			String[] ncm = scanner.nextLine().split(" ");

			int n = Integer.parseInt(ncm[0]);

			int c = Integer.parseInt(ncm[1]);

			int m = Integer.parseInt(ncm[2]);

			int result = chocolateFeast(n, c, m);

			System.out.println(result);

		}

		scanner.close();

	}

}
