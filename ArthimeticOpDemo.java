package javaprogram;

import java.util.Scanner; 

public class ArthimeticOpDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the a,b value ");
		int a = s.nextInt();
		int b=s.nextInt();
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);

	}

}
