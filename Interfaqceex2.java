package javaprogram;


 interface RBI{
	float calinterest();
}


 class SBI implements RBI{

	@Override
	public float calinterest() {
		return 8.9f;
	}
	
}
 class ICICI implements RBI{

	@Override
	public float calinterest() {
		return 8.5f;
	}
	
}
public class Interfaqceex2 {

	public static void main(String[] args) {
	RBI i1 =new SBI();
    System.out.println("the intrest rate::"+i1.calinterest());	
	RBI i2 =new ICICI();
	System.out.println("the interest rate::"+i2.calinterest());
	}

}
