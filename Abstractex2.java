package javaprogram;

import java.util.Scanner;

abstract class Emp{
	abstract void calsal();	
}
class Parttimeemp extends Emp{
	void calsal() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the working hour::");
		int hr=s.nextInt();
		System.out.println("enter the wage per  hour::");
		int w_hr=s.nextInt();
		System.out.println("the part time salary is ::"+(hr*w_hr));
	}
}
class Fulltimeemp extends Emp{
void calsal() {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the working days ::");
	int day=s.nextInt();
	System.out.println("enter the wage per day::");
	int w_day=s.nextInt();
	System.out.println("the part time salary is ::"+(day*w_day));
  }
}
public class Abstractex2 {

	public static void main(String[] args) {
		Fulltimeemp f=new Fulltimeemp();
		f.calsal();
		Parttimeemp p=new Parttimeemp();
		p.calsal();
		Emp f2=new Fulltimeemp();
		f2.calsal();
		Emp p2=new Parttimeemp();
		p2.calsal();
	}
}
