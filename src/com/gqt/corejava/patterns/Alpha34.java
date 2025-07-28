package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Alpha34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the count");
		int n= sc.nextInt();
		char c;
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            c = (char) ('A' + (2 * i - 2));
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print((char)(c - j));
            }
            System.out.println();
        }
	}

}
