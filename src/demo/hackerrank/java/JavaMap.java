package demo.hackerrank.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		scan.nextLine();

		Map<String, Integer> phoneBookMap = new HashMap<String, Integer>();
		String name, searchString;
		Integer phoneNumber;

		for (int i = 0; i < n; i++) {
			name = scan.nextLine();
			phoneNumber = scan.nextInt();
			phoneBookMap.put(name, phoneNumber);
			scan.nextLine();
		}

		while (scan.hasNext()) {
			searchString = scan.nextLine();
			if (phoneBookMap.get(searchString) != null) {
				System.out.println(searchString + "=" + phoneBookMap.get(searchString));
			} else {
				System.out.println("Not found");
			}
		}

		scan.close();
	}
}
