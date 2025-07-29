/**
 * *
 * * *
 * * - *
 * * - - *
 * * * * * *
 */
package com.gqt.corejava.patterns;

import java.util.Scanner;

/**
 * @author JOSHITHA
 * @category pattern
 * @description This is an example of hollow triangle
 */
public class Star39 {

	/**
	 * @param args
	 * @description This is an example of hollow triangle
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the count");
		int n= sc.nextInt();
		for( int i=1;i<=n;i++) {
			for (int j=1;j<=i;j++) {
				if(i==1||i==n||j==1||j==i) {
				System.out.print("*");
				}
				else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
