package demo.hackerrank.java;

import java.util.Scanner;

public class HackerRankInAString {

	// Complete the hackerrankInString function below.
	static String hackerrankInString(String s) {

		String[] sArr = s.split("");
		String[] hrArr = "hackerrank".split("");

		int jv = 0;
		String hrTemp = "";

		for (int i = 0; i < hrArr.length; i++) {
			for (int j = jv; j < sArr.length; j++) {
				if (hrArr[i].equals(sArr[j])) {
					hrTemp += sArr[j];
					jv = j + 1;
					break;
				}
			}
		}

		if (hrTemp.equals("hackerrank")) {
			return "YES";
		} else {
			return "NO";
		}

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			String s = scanner.nextLine();

			String result = hackerrankInString(s);

			System.out.println(result);

			// bufferedWriter.write(result);
			// bufferedWriter.newLine();
		}

		// bufferedWriter.close();

		scanner.close();
	}
}
