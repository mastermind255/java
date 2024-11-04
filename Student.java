package javaprogram;

public class Student {
int sid;
String name;
int phno;
static String coursename="java";
	public static void main(String[] args) {
		Student s1=new Student();
		s1.sid=1001;
 		s1.name="abc"; 
		s1.phno=678234;
		
		Student s2=new Student();
		s2.sid=1002;
		s2.name="mama";
		s2.phno=97456;
		System.out.println("coursename="+ coursename);
		System.out.println("s1.sid="+s1.sid);
		System.out.println("s1.name="+s1.name);
		System.out.println("s1.phno="+s1.phno);
		
		System.out.println("s2.sid="+s2.sid);
		System.out.println("s2.name="+s2.name);
		System.out.println("s2.phno="+s2.phno);
	}

}
