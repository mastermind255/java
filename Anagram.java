package javaprogram;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first and second string:");
		String s1=s.next();
		String s2=s.next();
		if(s1.length()==s2.length()) {
			char ch1[]=s1.toCharArray();
			char ch2[]=s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			boolean b=Arrays.equals(ch1,ch2);
			if(b==true) {
				System.out.println("The given string is anagram ");
			}
			else {
				System.out.println("The given string is not anagram ");
			}
			
		}
		else {
			System.out.println("the string is not anagram ");
		}
	}

}
