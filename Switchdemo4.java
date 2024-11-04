package javaprogram;

import java.util.Scanner;

public class Switchdemo4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a character");
		char ch=s.next().charAt(0);
		switch(ch) {
		case 'A':
		case 'a':
		case 'E':
		case 'e':
		case 'I':
		case 'i':
		case 'O':
		case 'o':
		case 'U':
		case 'u':
			System.out.println(ch+" is a vowel");
			break;
			
			default:
				System.out.println(ch+" is a consonent");
			
			
		}

	}

}
