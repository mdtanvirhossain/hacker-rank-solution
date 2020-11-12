package demo.hackerrank.java;

import java.io.IOException;
import java.util.Scanner;

public class BreakingTheRecords {

	// Complete the breakingRecords function below.
	static int[] breakingRecords(int[] scores) {
		int low = scores[0], high = scores[0];
		int countLow = 0, countHigh = 0;

		for (int i = 1; i < scores.length; i++) {
			// counting high
			if (scores[i] > high) {
				high = scores[i];
				countHigh++;
			}

			// counting low
			if (scores[i] < low) {
				low = scores[i];
				countLow++;
			}
		}

		int[] result = { countHigh, countLow };

		return result;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] scores = new int[n];

		String[] scoresItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int scoresItem = Integer.parseInt(scoresItems[i]);
			scores[i] = scoresItem;
		}

		int[] result = breakingRecords(scores);

//		for (int i = 0; i < result.length; i++) {
//			bufferedWriter.write(String.valueOf(result[i]));
//
//			if (i != result.length - 1) {
//				bufferedWriter.write(" ");
//			}
//		}
//
//		bufferedWriter.newLine();
//
//		bufferedWriter.close();

		for (int r : result) {
			System.out.print(r + " ");
		}

		scanner.close();
	}

}
