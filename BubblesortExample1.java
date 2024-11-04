package javaprogram;

import java.util.Scanner;

public class BubblesortExample1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int n=s.nextInt();
		int a[]=new int[n];
		
		System.out.println("enter the array elements::");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("the array elements are::");
		for(int i:a) {
			System.out.println(i);
		}
		for(int i=0;i<a.length;i++) 
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]>a[j]) 
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("the array elements are:");
		for(int i:a)
		System.out.println(i);
	}
}
