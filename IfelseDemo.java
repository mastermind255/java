package javaprogram;

import java.util.Scanner;

public class IfelseDemo {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your height:");
		Float height=s.nextFloat();
		System.out.println("Enter your weight:");
		Float weight=s.nextFloat();
		
		if((height>=5.5) && (weight>=55)) {
			System.out.println("you are eligible for physical test ");
		}
		else {
			System.out.println("you are not eligible for physical test ");
		}
		

	}

}
