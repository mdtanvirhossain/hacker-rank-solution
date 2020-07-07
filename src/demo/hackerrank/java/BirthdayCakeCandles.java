package demo.hackerrank.java;

import java.util.Arrays;
import java.util.Scanner;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		int[] candle = new int[age];
		int noOfBlow = 0;

		for (int i = 0; i < candle.length; i++) {
			candle[i] = scanner.nextInt();
		}

		Arrays.sort(candle);

		for (int i = 0; i < candle.length; i++) {
			if (candle[candle.length - 1] == candle[i]) {
				noOfBlow++;
			}
		}
		System.out.println(noOfBlow);

		scanner.close();

	}

}
