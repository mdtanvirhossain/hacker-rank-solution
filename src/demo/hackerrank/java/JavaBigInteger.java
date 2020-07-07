package demo.hackerrank.java;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		BigInteger bi1 = new BigInteger(scanner.next());
		BigInteger bi2 = new BigInteger(scanner.next());

		BigInteger biAdd = bi1.add(bi2);
		BigInteger biMultiply = bi1.multiply(bi2);

		System.out.println(biAdd);
		System.out.println(biMultiply);

		scanner.close();

	}

}
