package javaprogram;

import java.util.Scanner;

public class Arraydemo1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter the elements of array:");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("the elements are:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		

	}

}
