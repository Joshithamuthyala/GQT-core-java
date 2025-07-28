package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Y25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the count");
		int n= sc.nextInt();
		for( int i=1;i<=n;i++) {
			int a=1;
			for (int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(a+" ");
				a++;
				}
			for(int j=2;j<=i;j++) {
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
	sc.close();
	}

}

