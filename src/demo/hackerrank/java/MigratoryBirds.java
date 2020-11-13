package demo.hackerrank.java;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MigratoryBirds {

	// Complete the migratoryBirds function below.
	static int migratoryBirds(int[] arr) {

		HashMap<Integer, Integer> storage = new HashMap<>();
		storage.put(arr[0], 1);

		for (int i = 1; i < arr.length; i++) {
			int value = storage.getOrDefault(arr[i], -1);
			if (value != -1) {
				value++;
				storage.put(arr[i], value);
			} else {
				storage.put(arr[i], 1);
			}
		}
		int lowestMax = Collections.max(storage.entrySet(), Map.Entry.comparingByValue()).getKey();
		return lowestMax;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		int result = migratoryBirds(arr);
		System.out.println(result);

		scanner.close();
	}
}
