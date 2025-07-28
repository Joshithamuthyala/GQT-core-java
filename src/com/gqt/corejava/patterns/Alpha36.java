package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Alpha36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the count");
		int n= sc.nextInt();
		for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (char c = 'A'; c < 'A' + i; c++) {
                System.out.print(c);
            }
            for (char c = 'A'; c <= 'A' + i - 2; c++) {
                System.out.print(c);
            }
            System.out.println();
        }
		sc.close();
	}

}
