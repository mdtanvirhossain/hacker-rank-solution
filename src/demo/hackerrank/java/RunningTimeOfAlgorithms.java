package demo.hackerrank.java;

import java.util.Scanner;

public class RunningTimeOfAlgorithms {
	// Complete the runningTime function below.
	static int runningTime(int[] arr) {
		int numberOfShifts = 0;

		for (int i = 1; i < arr.length; i++) {
			int value = arr[i];
			int j = i - 1;
			while (j > -1 && arr[j] > value) {
				arr[j + 1] = arr[j];
				j = j - 1;
				numberOfShifts++;
			}
			arr[j + 1] = value;
		}

		return numberOfShifts;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		int result = runningTime(arr);

		System.out.println(result);

		scanner.close();
	}
}
