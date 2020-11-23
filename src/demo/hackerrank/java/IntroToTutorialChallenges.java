package demo.hackerrank.java;

import java.util.Scanner;

public class IntroToTutorialChallenges {

	// Complete the introTutorial function below.
	static int introTutorial(int V, int[] arr) {

		// using ::binary search algorithm

		int first = 0, last = arr.length - 1;

		while (first <= last) {

			int mid = first + (last - first) / 2;

			// Check if v is present at mid
			if (arr[mid] == V)
				return mid;

			// If v greater, ignore left half
			if (arr[mid] < V)
				first = mid + 1;

			// If v is smaller, ignore right half
			else
				last = mid - 1;
		}

		// if not found
		return -1;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int V = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		int result = introTutorial(V, arr);

		System.out.println(result);

		scanner.close();

	}

}
