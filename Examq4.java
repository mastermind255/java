package javaprogram;

import java.util.Scanner;

public class Examq4 {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = s.nextInt();
        int i = 1; 
        while (i <= 10) {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        } 

	}

}
