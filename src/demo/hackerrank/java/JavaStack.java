package demo.hackerrank.java;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input = sc.next();
			// Complete the code

			Stack<Character> stack = new Stack<>();
			char[] chars = input.toCharArray();

			for (char aChar : chars) {
				if (stack.empty()) {
					stack.push(aChar);
				} else {
					char peek = stack.peek();

					if (peek == '(' && aChar == ')') {
						stack.pop();
					} else if (peek == '{' && aChar == '}') {
						stack.pop();
					} else if (peek == '[' && aChar == ']') {
						stack.pop();
					} else {
						stack.push(aChar);
					}
				}
			}

			boolean val = stack.empty();
			System.out.println(val);
		}

		sc.close();
	}
}
