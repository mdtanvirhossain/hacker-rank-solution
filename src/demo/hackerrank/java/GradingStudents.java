package demo.hackerrank.java;

import java.util.Scanner;

public class GradingStudents {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		int tmp,tmp1;
		
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] > 37) {
				tmp = a[i] / 5;
				tmp1 = (tmp+1) * 5;
				if ((tmp1 - a[i]) < 3) {
					System.out.println(a[i] + (tmp1-a[i]));
				}
				else {
					System.out.println(a[i]);
				}
			}
			else {
				System.out.println(a[i]);
			}
		}

	}

}
