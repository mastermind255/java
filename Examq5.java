package javaprogram;

import java.util.Scanner;

public class Examq5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value");
		int max=10;
		int i=0;
		while (i<max)
		{
			int num=s.nextInt();
			System.out.println(num*5);
			i++;
		}

	}

}
