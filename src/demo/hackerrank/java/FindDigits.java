package demo.hackerrank.java;

import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			count = 0;
			int tmp = arr[i];
			String[] str = Integer.toString(arr[i]).split("");
			
			int[] intArray = new int[str.length];
			
			for (int j = 0; j < intArray.length; j++) {
				intArray[j] = Integer.parseInt(str[j]);
			}
			
			for (int k = 0; k < intArray.length; k++) {
				try {
					if (tmp % intArray[k] == 0) {
						count ++;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
			System.out.println(count);
		}

	}

}
