package demo.hackerrank.java;

import java.util.Scanner;

public class FindTheMedian {
	// Complete the findMedian function below.
	static int findMedian(int[] arr) {

		// using insertion sort
		int n = arr.length;

		for (int j = 1; j < n; j++) {
			int key = arr[j];
			int i = j - 1;
			while ((i > -1) && (arr[i] > key)) {
				arr[i + 1] = arr[i];
				i--;
			}
			arr[i + 1] = key;
		}

		int medianIndex = n / 2;
		int median = arr[medianIndex];

		return median;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		int result = findMedian(arr);

		System.out.println(result);

		// bufferedWriter.write(String.valueOf(result));
		// bufferedWriter.newLine();

		// bufferedWriter.close();

		scanner.close();
	}
}
