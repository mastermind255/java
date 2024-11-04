package javaprogram;

import java.util.Scanner;

public class Ifelsedemo4 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the character:");
		char ch=s.next().charAt(0);
		if(ch>='A'&& ch<='Z') {
			System.out.println("this is uppercase character!");
		}
		else {
			System.out.println("this is lower character!");
		}
		
		

	}

}
