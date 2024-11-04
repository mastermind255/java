package javaprogram;

import java.util.Scanner;

public class IfelseQu {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=s.nextInt();
		if(num>=0 && num<=9)
		{
			System.out.println(num+"is present between 0-9");
		}
		else {
			System.out.println(num+"is  not present between 0-9");
		}

	}

}
