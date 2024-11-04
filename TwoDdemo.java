package javaprogram;

import java.util.Scanner;

public class TwoDdemo {

	public static void main(String[] args) {
		int a[][]=new int[3][3];
		Scanner s= new Scanner(System.in);
		System.out.println("enter the elements in array:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("the array is:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
