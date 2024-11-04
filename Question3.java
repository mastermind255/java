package javaprogram;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size if array:");
		int n=s.nextInt();
		int a[]=new int[n];
		int sum=0;
		System.out.println("enter the elements of array:");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
			sum=sum+a[i];
		}
		System.out.println("sum of the array elements are:"+sum);

	}

}
