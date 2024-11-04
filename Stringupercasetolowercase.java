package javaprogram;

import java.util.Scanner;

public class Stringupercasetolowercase {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c>='A'&&c<='Z') {
				char c1=(char)(c+32);
				System.out.println(c1);
			}
			if(c>='a'&&c<='z') {
				char c1=(char)(c-32);
				System.out.println(c1);
			}
		}

	}

}
