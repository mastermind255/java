package javaprogram;

import java.util.Scanner;

public class Stringpalindrome1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the word: ");
		String  sr=s.next();
		String rev="";
		for(int i=sr.length()-1;i>=0;i--) {
			rev=rev+sr.charAt(i);
		}
		if(sr.equals(rev)) {
			System.out.println("paindrome");				
		}
		else {
			System.out.println("not palindrome");
		}
		System.out.println("hi".equals("hi"));
		System.out.println("Hi".equalsIgnoreCase("hi"));

	}

}
