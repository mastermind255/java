package javaprogram;

import java.util.Scanner;

public class Continuedemo2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the n values");
		int n=s.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			System.out.println("enter the number");
			int num=s.nextInt();
				if(num<0) {
					continue;
				}
				else {
					count++;
				}
				System.out.println(count);
		}
	}
}
