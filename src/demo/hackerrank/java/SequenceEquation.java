package demo.hackerrank.java;

import java.util.Scanner;

public class SequenceEquation {
	// Complete the permutationEquation function below.
	static int[] permutationEquation(int[] p) {

		int pLength = p.length;
		int[] result = new int[pLength];
		int resultIndex = 0;

		for (int i = 1; i <= pLength; i++) {

			for (int j = 1; j <= p.length; j++) {

				if (i == p[j - 1]) {

					for (int j2 = 1; j2 <= result.length; j2++) {

						if (j == p[j2 - 1]) {

							result[resultIndex] = j2;
							resultIndex++;

						}

					}

				}

			}

		}

		return result;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] p = new int[n];

		String[] pItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int pItem = Integer.parseInt(pItems[i]);
			p[i] = pItem;
		}

		int[] result = permutationEquation(p);

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

		// bufferedWriter.newLine();

		// bufferedWriter.close();

		scanner.close();
	}
}
