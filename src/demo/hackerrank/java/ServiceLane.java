package demo.hackerrank.java;

import java.util.Scanner;

public class ServiceLane {

	// Complete the serviceLane function below.
	static int[] serviceLane(int n, int[] width, int[][] cases) {

		int cLength = cases.length;

		int[] resultArr = new int[cLength];

		for (int i = 0; i < cLength; i++) {

			int start = cases[i][0];
			int end = cases[i][1];

			int min = width[start];

			for (int k = start + 1; k <= end; k++) {
				if (width[k] < min) {
					min = width[k];
				}
			}
			resultArr[i] = min;
		}

		return resultArr;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String[] nt = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nt[0]);

		int t = Integer.parseInt(nt[1]);

		int[] width = new int[n];

		String[] widthItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int widthItem = Integer.parseInt(widthItems[i]);
			width[i] = widthItem;
		}

		int[][] cases = new int[t][2];

		for (int i = 0; i < t; i++) {
			String[] casesRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 2; j++) {
				int casesItem = Integer.parseInt(casesRowItems[j]);
				cases[i][j] = casesItem;
			}
		}

		int[] result = serviceLane(n, width, cases);

		for (int i = 0; i < result.length; i++) {

			System.out.println(String.valueOf(result[i]));

		}

		scanner.close();
	}

}
