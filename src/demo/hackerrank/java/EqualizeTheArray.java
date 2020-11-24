package demo.hackerrank.java;

import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
import java.util.Scanner;

public class EqualizeTheArray {
	// Complete the equalizeArray function below.
	static int equalizeArray(int[] arr) {
//		int minNumOfDel = 99;
//		int aLength = arr.length;
//
//		HashMap<Integer, Integer> storage = new HashMap<Integer, Integer>();
//
//		for (int i = 0; i < aLength; i++) {
//
//			if (storage.get(arr[i]) == null) {
//
//				int temp = 0;
//
//				for (int j = 0; j < arr.length; j++) {
//					if (arr[i] == arr[j]) {
//						temp++;
//					}
//				}
//
//				storage.put(arr[i], temp);
//			}
//
//		}
//
//		for (int i = 0; i < storage.size(); i++) {
//			int sum = 0;
//			int count = -1;
//
//			@SuppressWarnings("rawtypes")
//			Iterator sIterator = storage.entrySet().iterator();
//
//			while (sIterator.hasNext()) {
//
//				count++;
//
//				@SuppressWarnings("rawtypes")
//				Map.Entry mapElement = (Map.Entry) sIterator.next();
//
//				if (i != count) {
//
//					sum = sum + (int) mapElement.getValue();
//
//				}
//
//			}
//
//			if (minNumOfDel > sum) {
//				minNumOfDel = sum;
//			}
//		}
//
//		return minNumOfDel;

		int minNumOfDel = 99;
		int max = 0;
		int aLength = arr.length;

		HashMap<Integer, Integer> storage = new HashMap<Integer, Integer>();

		for (int i = 0; i < aLength; i++) {

			int temp = 0;

			if (storage.get(arr[i]) == null) {

				for (int j = 0; j < arr.length; j++) {

					if (arr[i] == arr[j]) {

						temp++;

					}

				}

			}

			if (temp > max) {
				max = temp;
			}

			storage.put(arr[i], temp);
		}

		minNumOfDel = aLength - max;

		return minNumOfDel;
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

		int result = equalizeArray(arr);

		System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

		scanner.close();
	}
}
