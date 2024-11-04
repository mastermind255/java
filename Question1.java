package javaprogram;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=s.nextInt();
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				sum = sum + i;
			}
		}
		
		if(sum == num*2) {
			System.out.println("is a perfect number");
		}
		else {
			System.out.println("is not a perfect number.");
		}
		
		
		

	}

}
