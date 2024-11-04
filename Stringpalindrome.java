package javaprogram;

import java.util.Scanner;

public class Stringpalindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a word:");
		String str=s.next();
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}

}
