package javaprogram;

import java.util.Scanner;

abstract class Superclass{
	abstract void calculate();
}
class Subclass1 extends Superclass{
	void calculate() {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the value for finding the square");
		int a=s.nextInt();
		System.out.println("the squareroot* of the number is ::"+Math.sqrt(a));
	}
	
}
class Subclass2 extends Superclass{
	void calculate() {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the value for finding the cube");
		int b=s.nextInt();
		System.out.println("the cube of the number is ::"+(b*b*b));
	}
	
}
public class Abstarctionmex1 {

	public static void main(String[] args) {
		Subclass2 s1=new Subclass2();
		s1.calculate();
		Subclass1 s2=new Subclass1();
		s2.calculate();
		Superclass s3=new Subclass1();
		s3.calculate();
		Superclass s4=new Subclass2();
		s4.calculate();
	}

}
