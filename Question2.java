package javaprogram;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
    Scanner s=new Scanner (System.in);
    System.out.println("enter a number:");
    int num=s.nextInt();
    int fact=1;
    int sum=0;
    while(num!=0) {
    	int lastvalue=num%10;
    	for(int i=1;i<=lastvalue;i++) {
    		fact=fact*i;
    	}
    	sum=sum+fact;
    	fact=1;
    }
    if(sum==num) {
    	System.out.println(" it is a strong number");
    }
    else {
    	System.out.println("it is not a strong number");
    }
    
    

	}

}
