package javaprogram;

import java.util.Arrays;
import java.util.Scanner;

public class Array_large_small {

	public static void main(String[] args) {

				
		Scanner s=new Scanner(System.in);
		 int arr[]=new int[5];
		 System.out.println("enter the array element::");
		 for(int i=0;i<arr.length;i++) 
			 arr[i]=s.nextInt();
		 
		 Arrays.sort(arr);
		 
				System.out.println("The second largest element is the array is: "+arr[arr.length-2]);
				System.out.println("The second smallest element is the array is: "+arr[1]);

			}
	}


