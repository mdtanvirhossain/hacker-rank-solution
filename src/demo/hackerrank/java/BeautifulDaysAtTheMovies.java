package demo.hackerrank.java;

import java.util.Scanner;

public class BeautifulDaysAtTheMovies {
	// Complete the beautifulDays function below.
	static int beautifulDays(int i, int j, int k) {

		int beautifulDays = 0;

		for (int n = i; n <= j; n++) {

			// find the reverse number

			int num = n;

			int rn = 0;
			while (num != 0) {
				int temp = num % 10;
				rn = rn * 10 + temp;
				num /= 10;
			}
			// end of reversing

			if (Math.abs(n - rn) % k == 0) {
				beautifulDays++;
			}
		}

		return beautifulDays;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		String[] ijk = scanner.nextLine().split(" ");

		int i = Integer.parseInt(ijk[0]);

		int j = Integer.parseInt(ijk[1]);

		int k = Integer.parseInt(ijk[2]);

		int result = beautifulDays(i, j, k);

		System.out.println(result);

//		bufferedWriter.write(String.valueOf(result));
//		bufferedWriter.newLine();
//
//		bufferedWriter.close();

		scanner.close();
	}
}
