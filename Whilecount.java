package javaprogram;

import java.util.Scanner;

public class Whilecount {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		int count = 0;
		while(num!=0) {
			int d=num%10;
			count++;
			num=num/10;
		}
		System.out.println("count of digit is:"+count);
		
		

	}

}
