package demo.hackerrank.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TheHurdleRace {

	// Complete the hurdleRace function below.
	static int hurdleRace(int k, int[] height) {

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < height.length; i++) {
			int val = height[i] - k;
			if (val > 0) {
				list.add(val);
			}
		}

		if (list.isEmpty()) {
			return 0;
		} else {
			int max = Collections.max(list);
			return max;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int k = scanner.nextInt();

		int[] height = new int[n];
		for (int i = 0; i < height.length; i++) {
			height[i] = scanner.nextInt();
		}

		int minDrink = hurdleRace(k, height);
		System.out.println(minDrink);

		scanner.close();

	}

}
