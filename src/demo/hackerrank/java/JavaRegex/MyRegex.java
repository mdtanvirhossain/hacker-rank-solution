package demo.hackerrank.java.JavaRegex;

class MyRegex {
	// Regex for digit from 0 to 255.
	String patternFor0To255 = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";

	// Regex for a digit from 0 to 255 and
	// followed by a dot, repeat 4 times.
	// this is the regex to validate an IP address.
	public String pattern = patternFor0To255 + "\\." + patternFor0To255 + "\\." + patternFor0To255 + "\\."
			+ patternFor0To255;
}
