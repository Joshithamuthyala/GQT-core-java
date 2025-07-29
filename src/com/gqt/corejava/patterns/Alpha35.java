package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Alpha35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the count");
		int n= sc.nextInt();
		 for (int i = 1; i <= n; i++) {
	            for (int s = 1; s <= n - i; s++) {
	                System.out.print(" ");
	            }
	            char ch = (char)('A' + i - 1);
	            for (char c = ch; c >= 'A'; c--) {
	                System.out.print(c);
	            }
	            for (char c = 'B'; c <= ch; c++) {
	                System.out.print(c);
	            }
	            System.out.println();
	        }
		 sc.close();
	}

}
