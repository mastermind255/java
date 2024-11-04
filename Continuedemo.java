package javaprogram;

public class Continuedemo {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i==4||i==5) {
				continue;
			}
			else {
				System.out.println(i);
			}
		}

	}

}
