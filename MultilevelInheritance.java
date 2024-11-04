package javaprogram;
class Car{
	void vehicleType() {
		System.out.println("vehicle type :: car");
	}
}
class Maruthi extends Car{
	void speed_maruthi() {
		System.out.println("speed of maruti :: 80km");
	}
}
class Maruthi800 extends Maruthi{
	void speed_maruthi800() {
		System.out.println("speed of maruti800 :: 90km");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		Maruthi800 m=new Maruthi800();
		m.vehicleType();
		m.speed_maruthi();
		m.speed_maruthi800();

	}

}
