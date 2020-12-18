package demo.hackerrank.java;

import java.io.IOException;
import java.util.Scanner;

public class CountingSort2 {

	// Complete the countingSort function below.
	static int[] countingSort(int[] arr) {

		int arrLength = arr.length;

		int[] output = new int[arrLength + 1];

		// Find the largest element of the array
		int max = arr[0];
		for (int i = 1; i < arrLength; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		int[] count = new int[max + 1];

		// Initialize count arr with all zeros.
		for (int i = 0; i < max; ++i) {
			count[i] = 0;
		}

		// Store the count of each element
		for (int i = 0; i < arrLength; i++) {
			count[arr[i]]++;
		}

		// Store the cummulative count of each array
		for (int i = 1; i <= max; i++) {
			count[i] = count[i] + count[i - 1];
		}

		// Find the index of each element of the original array in count array, and
		// place the elements in output array
		for (int i = arrLength - 1; i >= 0; i--) {
			output[count[arr[i]] - 1] = arr[i];
			count[arr[i]]--;
		}

		// Copy the sorted elements into original array
		for (int i = 0; i < arrLength; i++) {
			arr[i] = output[i];
		}

		return arr;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
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

		int[] result = countingSort(arr);

		for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(String.valueOf(result[i]));
//
//            if (i != result.length - 1) {
//                bufferedWriter.write(" ");
//            }

			System.out.print(result[i]);

			if (i != result.length - 1) {
				System.out.print(" ");
			}
		}

//        bufferedWriter.newLine();
//        bufferedWriter.close();

		scanner.close();
	}

}
