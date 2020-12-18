package demo.hackerrank.java;

import java.util.Scanner;

class MyRegex {
	// Regex for digit from 0 to 255.
	String patternFor0To255 = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";

	// Regex for a digit from 0 to 255 and
	// followed by a dot, repeat 4 times.
	// this is the regex to validate an IP address.
	public String pattern = patternFor0To255 + "\\." + patternFor0To255 + "\\." + patternFor0To255 + "\\."
			+ patternFor0To255;
}

class JavaRegex {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String IP = in.next();
			System.out.println(IP.matches(new MyRegex().pattern));
		}

		in.close();

	}
}
