package javaprogram;

import java.util.Scanner;

public class Breakdemo2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n value:");
		int n=s.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			System.out.println("enter the numbers:");
			int num=s.nextInt();
			if(num<0) {
				break;
			}
			else {
				sum=sum+num;
			}
			System.out.println("sum of positive number is:"+sum);
		}
		

	}

}
