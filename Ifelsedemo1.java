package javaprogram;

import java.util.Scanner;

public class Ifelsedemo1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter your age");
		int age=s.nextInt();
		if(age>=18) {
			System.out.println("you are eligible for vote");
		}
		else {
			System.out.println("you are not eligible for vote");
		}
		
			

	}

}
