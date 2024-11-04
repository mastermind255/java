package javaprogram;

public class Methoddemo {
	int x=100;
	static int y=50;
	static void display() {
		System.out.println("y="+y);
	}
	public static void main(String[] args) {
		Methoddemo.display();
		display();
		

	}

}
