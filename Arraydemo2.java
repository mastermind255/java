package javaprogram;

import java.util.Scanner;

public class Arraydemo2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter the element of array:");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		int min=a[0];
		int max=a[0];
		for(int i=0;i<a.length;i++) {
		if(a[i]<min)
			min=a[i];
		if(a[i]>max)
			max=a[i];
		}
		System.out.println("max element is:"+max);
		System.out.println("min element is:"+min);

	}

}
