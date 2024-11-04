package javaprogram;

import java.util.Scanner;

public class Stringpalindromechcker {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the new string::");
		String str=s.next();
		System.out.println("the given string::"+str);
		
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		String str1=sb.toString();
		if(str.equals(str1)) {
			System.out.println("the given string is palindrome");
		}else {
			System.out.println("the given string is not palindrome");
		}
		

	}

}
