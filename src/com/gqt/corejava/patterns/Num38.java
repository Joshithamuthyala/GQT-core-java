/**
 * 
 */
package com.gqt.corejava.patterns;

import java.util.Scanner;

/**
 * @author JOSHITHA
 * @category patterns
 * @description This is an example of the hollow square
 */
public class Num38 {

	/**
	 * @param args
	 * @description This is an example of the hollow square
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the count");
		int n= sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0||i==n-1||j==0||j==n-1) {
				System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
