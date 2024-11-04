package javaprogram;

import java.util.Scanner;

public class SwitchDEmo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a color name:");
		String c=s.next();
		switch(c) {
		case "red":
		case "green":
		case "blue":
			System.out.println(c+" color is present in rgb");
			break;
		default:
			System.out.println(c+" color is not present in rgb");
		}
	}

}
