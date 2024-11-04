package javaprogram;

import java.util.Scanner;

public class IfelssIfdemo2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the two number:");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("enter the operator +,-,/,* ");
		char op=s.next().charAt(0);
		if(op=='+') {
			System.out.println(a+b);
		}
		else if(op=='-') {
			System.out.println(a-b);
		}
		else if(op=='*') {
			System.out.println(a*b);
		}
		else if(op=='/') {
			System.out.println(a/b);
		}
		else {
			System.out.println("invalid operator");
		}
	}

}
