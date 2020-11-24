package demo.hackerrank.java;

import java.util.Scanner;

public class ElectronicsShop {

	/*
	 * Complete the getMoneySpent function below.
	 */
	static int getMoneySpent(int[] keyboards, int[] drives, int b) {

		int kLength = keyboards.length;
		int dLength = drives.length;
		int max = -1;

		for (int i = 0; i < kLength; i++) {
			for (int j = 0; j < dLength; j++) {

				int total = keyboards[i] + drives[j];

				if (total <= b) {
					if (total > max) {
						max = total;
					}
				}

			}
		}

		return max;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		String[] bnm = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

		int b = Integer.parseInt(bnm[0]);

		int n = Integer.parseInt(bnm[1]);

		int m = Integer.parseInt(bnm[2]);

		int[] keyboards = new int[n];

		String[] keyboardsItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

		for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
			int keyboardsItem = Integer.parseInt(keyboardsItems[keyboardsItr]);
			keyboards[keyboardsItr] = keyboardsItem;
		}

		int[] drives = new int[m];

		String[] drivesItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

		for (int drivesItr = 0; drivesItr < m; drivesItr++) {
			int drivesItem = Integer.parseInt(drivesItems[drivesItr]);
			drives[drivesItr] = drivesItem;
		}

		/*
		 * The maximum amount of money she can spend on a keyboard and USB drive, or -1
		 * if she can't purchase both items
		 */

		int moneySpent = getMoneySpent(keyboards, drives, b);

		System.out.println(moneySpent);

//		bufferedWriter.write(String.valueOf(moneySpent));
//		bufferedWriter.newLine();
//
//		bufferedWriter.close();

		scanner.close();
	}

}
