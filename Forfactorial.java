package javaprogram;

import java.util.Scanner;

public class Forfactorial {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int num=s.nextInt();
		int fact=1;
		for(int i=num;i>=1;i--) {
			fact=fact*i;
		}

		System.out.println(fact);
		
	}

}
