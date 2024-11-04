package javaprogram;

import java.util.Scanner;

public class Examq2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a two number:");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("enter the op +,-,*,/");
		char ch=s.next().charAt(0);
		switch(ch) {
		case '+':
			System.out.println(a+b);
		case '-':
			System.out.println(a-b);
		case '*':
			System.out.println(a*b);
		case '/':
			System.out.println(a/b);
			
		default:
			System.out.println("invalid operator");
		}
		

	}

}
