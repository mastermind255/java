package javaprogram;

import java.util.Scanner;

public class Ifelsedemo2 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("enter the number:");
		int num=s.nextInt();
		if(num%3==0 & num%5==0) {
			System.out.println("number is divisible by 3 and 5");
		}
		else {
			System.out.println("number is not divisible by 3 and 5");
		}

	}

}
