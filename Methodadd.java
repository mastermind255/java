package javaprogram;

import java.util.Scanner;

public class Methodadd {
	int add(int a, int b) {
		return (a+b);
	}

	public static void main(String[] args) {
		Methodadd sc=new Methodadd();
		Scanner s= new Scanner(System.in);
		System.out.println("enter a,b value");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("sum="+sc.add(a,b));
		
		

	}

}
