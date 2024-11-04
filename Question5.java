package javaprogram;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[5];
		int sum=0;
		System.out.println("enter the 5 subject mark:");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
			sum=sum+a[i];
		}
		int avg=sum/5;
		System.out.println("the sum of the 5 subject mark is:"+sum);
		System.out.println("the avg of the 5 subject mark is:"+avg);
		

	}

}
