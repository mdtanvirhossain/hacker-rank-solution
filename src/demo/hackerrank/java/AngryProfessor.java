package demo.hackerrank.java;

import java.util.Scanner;

public class AngryProfessor {

	// Complete the angryProfessor function below.
	static String angryProfessor(int k, int[] a) {

		int stdAtTime = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] <= 0) {
				stdAtTime++;
			}
		}

		if (stdAtTime >= k) {
			return "NO";
		} else {
			return "YES";
		}
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			String[] nk = scanner.nextLine().split(" ");

			int n = Integer.parseInt(nk[0]);

			int k = Integer.parseInt(nk[1]);

			int[] a = new int[n];

			String[] aItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < n; i++) {
				int aItem = Integer.parseInt(aItems[i]);
				a[i] = aItem;
			}

			String result = angryProfessor(k, a);

			System.out.println(result);
		}

		scanner.close();
	}
}
