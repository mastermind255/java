package javaprogram;

import java.util.Scanner;

public class QUestio {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the mark of 5 subject");
		int math=s.nextInt();
		int eng=s.nextInt();
		int mil=s.nextInt();
		int ss=s.nextInt();
		int computer=s.nextInt();
		int totalmark=(math+eng+mil+ss+computer);
		if(totalmark>=400 && totalmark<=500) {
			System.out.println("your grade is A");
		}
		else if(totalmark>=300 && totalmark<=399) {
			System.out.println("your grade is B");
		}
		else if(totalmark>=200 && totalmark<=299) {
			System.out.println("your grade is C");
		}
		else {
			System.out.println("you are fail");
		}
		
		int avgmark=totalmark/5;
		System.out.println(avgmark);
		

	}

}
