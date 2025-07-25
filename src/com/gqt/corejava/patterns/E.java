package com.gqt.corejava.patterns;
import java.util.Scanner;
public class E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a=1;
		System.out.println("Enter the count");
		int n= sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println(a);
			a++;
		}
		sc.close();
	}

}
