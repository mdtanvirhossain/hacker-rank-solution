package demo.hackerrank.java;

import java.io.IOException;
import java.util.Scanner;

public class Quicksort1Partition {

	// Complete the quickSort function below.
	static int[] quickSort(int[] arr) {

		int low = 0;
		int high = arr.length;

		int pivot = arr[low];
		int i = low; // index of smaller element
		for (int j = low + 1; j < high; j++) {
			// If current element is smaller than the pivot
			if (arr[j] < pivot) {
				i++;

				// swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// swap arr[i+1] and arr[high] (or pivot)
		int temp = arr[i];
		arr[i] = arr[low];
		arr[low] = temp;

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

		int[] result = quickSort(arr);

		for (int i = 0; i < result.length; i++) {
			// bufferedWriter.write(String.valueOf(result[i]));
			System.out.print(result[i]);

			if (i != result.length - 1) {
				// bufferedWriter.write(" ");
				System.out.print(" ");
			}
		}

//        bufferedWriter.newLine();
//        bufferedWriter.close();

		scanner.close();
	}

}
