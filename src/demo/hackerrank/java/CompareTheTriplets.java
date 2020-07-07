package demo.hackerrank.java;

import java.util.Scanner;

public class CompareTheTriplets {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] a = new int[3];
		int[] b = new int[3];
		int[] output = new int[2];

		int alice = 0, bob = 0;

		for (int i = 0; i < 3; i++) {
			a[i] = scanner.nextInt();
		}

		for (int i = 0; i < 3; i++) {
			b[i] = scanner.nextInt();
		}

		for (int i = 0; i < 3; i++) {
			if (a[i] > b[i]) {
				alice++;
			} else if (b[i] > a[i]) {
				bob++;
			}
		}

		for (int i = 0; i < 2; i++) {
			if (i == 0) {
				output[i] = alice;
			} else if (i == 1) {
				output[i] = bob;
			}
		}

		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}

		scanner.close();
	}

}
