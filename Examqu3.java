package javaprogram;

import java.util.Scanner;

public class Examqu3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter n values");
		int n=s.nextInt();
		int i=1; 
		int ecount=0;
		int ocount=0;
		while (i<=n) {
			System.out.println("enter the number ");
			int num=s.nextInt();
			if(num%2==0) {
				ecount++;
			}
			else {
				ocount++;
			}
			System.out.println("even count="+ecount);
			System.out.println("odd count="+ocount);
			i++;
		
		}
	}

}

