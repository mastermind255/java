package javaprogram;

import java.util.Scanner;

public class WhilePalendrokm {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		int rev=0;
		int temp=num;
		while(num!=0){
			int d = num%10;
			rev=rev*10+d;
			num=num/10;
		}
		if(temp==rev) {
			System.out.println("it is a palendrom");
		}
		else {
			System.out.println("it is not a palendrom");
		}

	}

}
