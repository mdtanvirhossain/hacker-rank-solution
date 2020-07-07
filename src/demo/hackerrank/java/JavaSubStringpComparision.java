package demo.hackerrank.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JavaSubStringpComparision {

	static void subString(String str, int lengthOfSubString) {
		
        // Creating array of string length 
        char[] ch = new char[str.length()]; 
  
        // Copy character by character into array 
        for (int i = 0; i < str.length(); i++) { 
            ch[i] = str.charAt(i); 
        } 
		
        int n = ch.length;
        
		String newString = "";
		List<String> subStringStorageList = new ArrayList<>();
		for (int len = 1; len <= n; len++) {

			for (int i = 0; i <= n - len; i++) {
				int j = i + len - 1;
				for (int k = i; k <= j; k++) {

					newString += ch[k];
				}

				if (newString.length() == lengthOfSubString) {
					subStringStorageList.add(newString);
				}
				newString = "";
			}
		}

		Collections.sort(subStringStorageList);
		System.out.println(subStringStorageList.get(0));
		System.out.println(subStringStorageList.get(subStringStorageList.size() - 1));
	}


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str =scanner.next();
		int lengthOfSubString = scanner.nextInt();

        
		subString(str, lengthOfSubString);

		scanner.close();
	}
}
