package javaprogram;

import java.util.Scanner;

public class ForPrime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int num=s.nextInt();
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("it is a prime number");
		}
		else {
			System.out.println("it is not a prime number");
		}

	}

}
