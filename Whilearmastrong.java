package javaprogram;

public class Whilearmastrong {

	public static void main(String[] args) {
		int num=153;
		int temp=num;
		int count=0;
		while(num!=0) {
			int d=num%10;
			count++;
			num=num/10;
		}
		int sum=0;
		num=temp;
		while(num!=0) {
			int d=num%10;
			sum+=(int)Math.pow(d,count);
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("armstrong");
		}
		else {
			System.out.println(" not armstrong");
		}
		

	}

}
