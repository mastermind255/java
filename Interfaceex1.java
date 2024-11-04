package javaprogram;
interface I1{
	int x=10;
	void m1();
}
class K implements I1{
	@Override
	public void m1() {
		System.out.println("m1 method");
		
	}
	
}

public class Interfaceex1 {

	public static void main(String[] args) {
		K a=new K();
		a.m1();
		I1 i=new K();
		i.m1();
	}

}
