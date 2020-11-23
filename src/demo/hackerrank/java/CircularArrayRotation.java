package demo.hackerrank.java;

import java.util.Scanner;

public class CircularArrayRotation {

	// Complete the circularArrayRotation function below.
	static int[] circularArrayRotation(int[] a, int k, int[] queries) {

		// ::correct but timeout

//		int length = a.length;
//		int qLength = queries.length;
//		
//		int[] resultArr = new int[qLength];
//
//		for (int i = 0; i < k; i++) {
//
//			int lastItem = a[length - 1];
//
//			for (int j = length - 1; j > 0; j--) {
//
//				a[j] = a[j - 1];
//			}
//
//			a[0] = lastItem;
//		}
//
//		for (int i = 0; i < qLength; i++) {
//			resultArr[i] = a[queries[i]];
//		}
//
//		return resultArr;

		int aLength = a.length;
		int qLength = queries.length;

		int[] resultArr = new int[qLength];

		for (int i = 0; i < qLength; i++) {
			resultArr[i] = a[(aLength - (k % aLength) + queries[i]) % aLength];
		}

		return resultArr;

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] nkq = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nkq[0]);

		int k = Integer.parseInt(nkq[1]);

		int q = Integer.parseInt(nkq[2]);

		int[] a = new int[n];

		String[] aItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int aItem = Integer.parseInt(aItems[i]);
			a[i] = aItem;
		}

		int[] queries = new int[q];

		for (int i = 0; i < q; i++) {
			int queriesItem = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			queries[i] = queriesItem;
		}

		int[] result = circularArrayRotation(a, k, queries);

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

		scanner.close();
	}

}
