package demo.hackerrank.java;

import java.util.Arrays;
import java.util.Scanner;

public class SalesByMatch {

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {

		int numOfPair = 0;
		
		Arrays.sort(ar);

		for (int i = 1; i < ar.length; i++) {
			if (ar[i] == ar[i - 1]) {
				i++;
				numOfPair++;
			}
		}

		return numOfPair;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] ar = new int[n];

		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}

		int result = sockMerchant(n, ar);

		System.out.println(result);

		scanner.close();

	}

}
