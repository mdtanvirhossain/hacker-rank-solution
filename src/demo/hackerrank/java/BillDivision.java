package demo.hackerrank.java;

import java.util.Scanner;

public class BillDivision {

	// Complete the bonAppetit function below.
	static void bonAppetit(int[] bill, int k, int b) {
		int sumOfBill = 0;

		for (int i = 0; i < bill.length; i++) {
			if (i != k) {
				sumOfBill += bill[i];
			}
		}

		int actualBillForAnna = sumOfBill / 2;

		if (actualBillForAnna == b) {
			System.out.println("Bon Appetit");
		} else {
			int refund = b - actualBillForAnna;
			System.out.println(refund);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] nk = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);

		int[] bill = new int[n];

		String[] billItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			bill[i] = Integer.parseInt(billItems[i]);
		}

		int b = scanner.nextInt();

		bonAppetit(bill, k, b);

		scanner.close();
	}

}
