package javaprogram;

import java.util.Scanner;

public class Ifelseif {

	public static void main(String[] args) {
		 Scanner s= new Scanner (System.in);
		 System.out.println("enter a number");
		 int num = s.nextInt();
		 if(num>0) {
			 System.out.println("number is possitive");
		 }
		 else if(num<0) {
			 System.out.println("number is negative");
		 }	 
	}

}
