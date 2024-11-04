package javaprogram;

import java.util.Scanner;


public class Usescanner {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter marks on math");
		float math=s.nextFloat();
		System.out.println("enter marks on eng");
		float eng=s.nextFloat();
		System.out.println("enter marks on odia");
		float odia=s.nextFloat();
		System.out.println("enter marks on comp");
		float comp=s.nextFloat();
		System.out.println("enter marks on sci");
		float sci=s.nextFloat();
		float totalmark=(math+eng+odia+comp+sci);
		
		
		System.out.println("the total mark="+totalmark);
		
		

	}

}
