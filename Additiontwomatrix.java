package javaprogram;

import java.util.Scanner;

public class Additiontwomatrix {

	public static void main(String[] args) {
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int result[][]=new int[3][3];
		Scanner s=new Scanner(System.in);
		System.out.println("enter the elements of first array:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("enter the elements of second  array:");
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b.length;j++) {
				b[i][j]=s.nextInt();
			}
		}
		System.out.println("the addition of two arrays are:");
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result.length;j++) {
				result[i][j]=a[i][j]+b[i][j];
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}

	}

}
