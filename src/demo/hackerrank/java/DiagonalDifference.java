package demo.hackerrank.java;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[][] sqMatrix = new int[n][n];

		int primaryDiagonal = 0, secDiaonal = 0;

		for (int i = 0; i < sqMatrix.length; i++) {
			for (int j = 0; j < sqMatrix.length; j++) {
				sqMatrix[i][j] = in.nextInt();
			}
			primaryDiagonal += sqMatrix[i][i];
			secDiaonal += sqMatrix[i][(n - 1) - i];
		}

		System.out.println(Math.abs(primaryDiagonal - secDiaonal));

		in.close();

	}

}
