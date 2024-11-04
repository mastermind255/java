package javaprogram;

import java.util.Scanner;

public class ExamQe1 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("enter the number:");
		int num=s.nextInt();
		if((num%2==0) && ((num>=2) && (num<=5))){
			System.out.println("not wired");
		}
		else if((num%2==0) && ((num>=6) && (num<=20))){
			System.out.println("wired");
		}
		else if(num%2!=0) {
			System.out.println("wired");
		}
		else if((num%2==0) &&(num>20)) {
			System.out.println("not wired");	
		}
		else {
			System.out.println("num is undefined");
		}

	}

}
