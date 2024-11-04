package javaprogram;

import java.util.Scanner;

public class Arraysdemo3 {

	public static void main(String[] args) {
		int a[]=new int[3];
		int b[]=new int[3];
		Scanner s=new Scanner(System.in);
		System.out.println("enter the element for first array:");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("enter the element for second array:");
		for(int i=0;i<b.length;i++) {
			b[i]=s.nextInt();
		}
		if(a[0]==b[b.length-1]) {
			System.out.println("true");
		}else {
			System.out.println("no match");
		}
	}
}
