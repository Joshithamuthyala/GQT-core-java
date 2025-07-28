package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Hollowrhombus30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the count ");
	        int n = sc.nextInt();
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= 2 * i - 1; j++) {
	                if (j == 1 || j == 2 * i - 1)
	                    System.out.print(i);
	                else
	                    System.out.print(" ");
	            }
	            System.out.println();
	        }
	        for (int i = n - 1; i >= 1; i--) {
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= 2 * i - 1; j++) {
	                if (j == 1 || j == 2 * i - 1)
	                    System.out.print(i);
	                else
	                    System.out.print(" ");
	            }
	            System.out.println();
	        }

	        sc.close();
	}

}
