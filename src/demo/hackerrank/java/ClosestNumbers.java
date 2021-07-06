package demo.hackerrank.java;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ClosestNumbers {

	// bubble sort
//	static void bubbleSort(int arr[]) {
//		int n = arr.length;
//		for (int i = 0; i < n - 1; i++)
//			for (int j = 0; j < n - i - 1; j++)
//				if (arr[j] > arr[j + 1]) {
//					// swap arr[j+1] and arr[j]
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//				}
//	}

	// Complete the closestNumbers function below.
	static List<Integer> closestNumbers(int[] arr) {

		List<Integer> resultList = new ArrayList<>();

		// sorting the array
		Arrays.sort(arr);

		int minDiff = arr[1] - arr[0];

		// find out the min_diff
		for (int i = 2; i < arr.length; i++) {
			if (Math.abs((arr[i] - arr[i - 1])) < minDiff) {
				minDiff = Math.abs(arr[i] - arr[i - 1]);
			}
		}

		// find out the pair with min_diff
		for (int i = 1; i < arr.length; i++) {
			if (Math.abs((arr[i] - arr[i - 1])) == minDiff) {
				resultList.add(arr[i - 1]);
				resultList.add(arr[i]);
			}
		}

		return resultList;
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

		List<Integer> result = closestNumbers(arr);

		for (int i = 0; i < result.size(); i++) {
			// bufferedWriter.write(String.valueOf(result[i]));
			System.out.print(result.get(i));

			if (i != result.size() - 1) {
				// bufferedWriter.write(" ");
				System.out.print(" ");
			}
		}

		// bufferedWriter.newLine();
		// bufferedWriter.close();

		scanner.close();
	}

}
