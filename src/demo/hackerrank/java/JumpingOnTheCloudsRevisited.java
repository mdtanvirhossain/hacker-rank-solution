package demo.hackerrank.java;

import java.util.Scanner;

public class JumpingOnTheCloudsRevisited {

	// Complete the jumpingOnClouds function below.
	static int jumpingOnClouds(int[] c, int k) {

		int cLength = c.length;
		int e = 100;

		int i = 0;
		i = (i + k) % cLength;

		while (i != 0) {

			if (c[i] == 0) {
				e = e - 1;
			} else {
				e = e - 3;

			}

			i = (i + k) % cLength;
		}

		if (c[0] == 0) {
			e = e - 1;
		} else {
			e = e - 3;
		}

		return e;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		String[] nk = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nk[0]);

		int k = Integer.parseInt(nk[1]);

		int[] c = new int[n];

		String[] cItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int cItem = Integer.parseInt(cItems[i]);
			c[i] = cItem;
		}

		int result = jumpingOnClouds(c, k);

		System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

		scanner.close();
	}

}
