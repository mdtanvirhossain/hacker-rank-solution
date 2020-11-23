package demo.hackerrank.java;

import java.util.Scanner;

public class InsertionSortPart1 {

	// Complete the insertionSort1 function below.
	static void insertionSort1(int n, int[] arr) {

		int e = arr[n - 1];

		for (int j = n - 2; j >= -1; j--) {

			if (j == -1) {
				arr[0] = e;
			} else if (e > arr[j]) {
				arr[j + 1] = e;
			} else {
				arr[j + 1] = arr[j];
			}

			for (int k = 0; k < n; k++) {
				if (k == n - 1) {
					System.out.print(arr[k]);
				} else {
					System.out.print(arr[k] + " ");
				}

			}
			System.out.println();
			if (j == -1 || e > arr[j]) {
				break;
			}
		}

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

		insertionSort1(n, arr);

		scanner.close();

	}

}
