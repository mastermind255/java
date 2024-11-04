package javaprogram;

import java.util.Scanner;

public class Linearsearchexample1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int n=s.nextInt();
		int a[]=new int[n];
		
		System.out.println("enter array elements:");
		for(int i=0;i<a.length;i++)
			a[i]=s.nextInt();
		
		System.out.println("the array elements are:: ");
		for(int i:a)
			System.out.println(i);
		
		System.out.println("enter the search element:");
		int Search=s.nextInt();
		int flag=0;
		int i;
		for(i=0;i<a.length;i++) {
			if(a[i]==Search) {
				flag=1;
				break;
			}
			
		}
		
		if(flag==0) {
			System.out.println("serach element is not found");
		}
		else {
			System.out.println("Search element is at index::"+i);
		}
		
		
	}
}
