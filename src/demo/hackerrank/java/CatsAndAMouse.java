package demo.hackerrank.java;

import java.util.Scanner;

public class CatsAndAMouse {

	// Complete the catAndMouse function below.
	static String catAndMouse(int x, int y, int z) {

		int catA = Math.abs(x - z);
		int catB = Math.abs(y - z);

		if (catA > catB) {
			return "Cat B";
		} else if (catA < catB) {
			return "Cat A";
		} else {
			return "Mouse C";
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			String[] xyz = scanner.nextLine().split(" ");

			int x = Integer.parseInt(xyz[0]);

			int y = Integer.parseInt(xyz[1]);

			int z = Integer.parseInt(xyz[2]);

			String result = catAndMouse(x, y, z);

			System.out.println(result);
		}

		scanner.close();

	}

}
