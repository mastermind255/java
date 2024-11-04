package javaprogram;

import java.util.Scanner;

public class Student1 {
int sid;
String name;
int phno;
static String coursename="java";
void accept() 
{
Scanner s=new Scanner(System.in);	
System.out.println("Enter Student id");
sid=s.nextInt();
System.out.println("Enter name");
name=s.next();
System.out.println("Enter phno");
phno=s.nextInt();
}
void display()
{
	System.out.println("sid="+sid);
	System.out.println("name="+name);
	System.out.println("phno="+phno);
}
	public static void main(String[] args) {
		Student1 s1=new Student1();
		System.out.println("Enter s1 object details");
		s1.accept();
		s1.display();
		
		
		Student1 s2=new Student1();
		System.out.println("Enter s2 object details");
		s2.accept();
		s2.display();
		
		
		
	}

}
