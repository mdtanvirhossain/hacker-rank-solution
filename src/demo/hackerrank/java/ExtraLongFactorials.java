package demo.hackerrank.java;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		
		BigInteger fact = BigInteger.ONE;
	
		
		for (int i = 1; i <= n; i++) {
			fact = fact.multiply(new BigInteger(String.valueOf(i)));
		}
		
		System.out.println(fact);

	}

}
