package javaprogram;

import java.util.Scanner;

public class Switchdemo3 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number:");
	int num=s.nextInt();
	switch(num%2) {
	case 0:
		System.out.println("it is even");
		break;
		default:
			System.out.println("is odd ");
	}

	}

}
