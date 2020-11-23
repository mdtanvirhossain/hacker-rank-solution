package demo.hackerrank.java;

import java.util.Scanner;

public class InsertionSortPart2 {

	// Complete the insertionSort2 function below.
	static void insertionSort2(int n, int[] arr) {

		// using insertion sort
		
		for (int j = 1; j < n; j++) {
			int key = arr[j];
			int i = j - 1;
			while ((i > -1) && (arr[i] > key)) {
				arr[i + 1] = arr[i];
				i--;
			}
			arr[i + 1] = key;

			for (int k = 0; k < n; k++) {

				if (k == n - 1) {
					System.out.print(arr[k]);
				} else {
					System.out.print(arr[k] + " ");
				}

			}

			System.out.println();
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

		insertionSort2(n, arr);

		scanner.close();
	}

}
