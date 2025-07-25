package com.gqt.corejava.patterns;
import java.util.Scanner;
public class G {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the count");
		int n= sc.nextInt();
		int a= 1;
		for (int i=0;i<n;i++) {
			System.out.print(a+" ");
			a++;
		}
		sc.close();
}

}
