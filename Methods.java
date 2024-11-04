package javaprogram;

import java.util.Scanner;

public class Methods {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("enter your name=");
		String name = s.nextLine();
		System.out.print("enter your age=");
		int age = s.nextInt();
		System.out.print("enter your height=");
		float height = s.nextFloat();
		System.out.print("enter your Salary=");
		double salary = s.nextDouble();
		System.out.print("enter your family members=");
		long fm = s.nextLong();
		System.out.print("enter your nickname=");
		String nickname = s.next();
		
		
	    System.out.println(name);
	    System.out.println(age);
	    System.out.println(height);
	    System.out.println(salary);
	    System.out.println(fm);
	    System.out.println(nickname);
	    
		

	}

}
