package com.gqt.corejava.patterns;

import java.util.Scanner;

public class S19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the count");
		int n= sc.nextInt();
		int a=1;
		for( int i=n;i>0;i--) {
			for (int j=1;j<=i;j++) {
				System.out.print(a+"	");
				a++;
			}
			System.out.println();
		}
		sc.close();
	}

}
