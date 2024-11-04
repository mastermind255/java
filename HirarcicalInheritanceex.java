package javaprogram;
class A
{
	void methodA() 
	{
		System.out.println("method a");
	}
}
class B extends A
{
	void methodB() 
	{
		System.out.println("method b");
	}
}
class C extends A
{
	void methodC() 
	{
		System.out.println("method c");
	}
	
}
class D extends A
{
	void methodD() 
	{
		System.out.println("method d");
	}   
}
public class HirarcicalInheritanceex {
	public static void hota() {	
	}
	public static void main(String[] args) {
		D d=new D();
		d.methodD();
		d.methodA();
		C c=new C();
		c.methodC();
		c.methodA();
		B b=new B();
		b.methodB();
		b.methodA();	
	}
}
