package demo.hackerrank.java;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long min = 0, max = 0;
		long[] arr = new long[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextLong();
		}

		Arrays.sort(arr);

		for (long i = 0; i < arr.length - 1; i++) {
			min = min + arr[(int) i];
		}

		for (long i = 1; i < arr.length; i++) {
			max = max + arr[(int) i];
		}

		System.out.println(min + " " + max);

		scanner.close();
	}

}
