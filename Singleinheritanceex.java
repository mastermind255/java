package javaprogram;
class A1
{
	void methodA() {
		System.out.println("congratulation");
	}
}
class B1 extends A1
{
	void methodB() {
		System.out.println("congratulation,Mydearfriend");
	}
}

public class Singleinheritanceex {

	public static void main(String[] args) {
		B1 b=new B1();
		b.methodB();
		b.methodA();
		
	}

}
