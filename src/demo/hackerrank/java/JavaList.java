package demo.hackerrank.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			list.add(scanner.nextInt());
		}
		
		//number of query
		int query = scanner.nextInt();
		
		for (int i = 0; i < query; i++) {
			
			String dicision = scanner.next();
			if (dicision.equals("Insert")) {
				int index = scanner.nextInt();
				int element = scanner.nextInt();
				list.add(index, element);
			}
			else {
				int delIndex = scanner.nextInt();
				list.remove(delIndex);
			}
			
		}
		
		for (int printList : list) {
			System.out.print(printList + " ");
		}
		
		scanner.close();

	}

}
