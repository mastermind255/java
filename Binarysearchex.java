package javaprogram;

import java.util.Arrays;
import java.util.Scanner;

public class Binarysearchex {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 int a[]=new int[5];
		 System.out.println("enter the array element::");
		 for(int i=0;i<a.length;i++) 
			 a[i]=s.nextInt();
		 
		 Arrays.sort(a);
		 System.out.println("array elements after sorting...");
		 for(int i:a)
		 System.out.println(i);
		 
		 System.out.println("enter the key element to search::");
		 int key=s.nextInt();
		 System.out.println("\n key to be searched="+key);
		 
		 int first=0;
		 int last=a.length-1;
		 int mid=(first+last)/2;
		 while(first<=last) {
			 if(a[mid]<key) {
				 first=mid+1;
			 }else if(a[mid]==key) {
				 System.out.println("element is found at index::"+mid);
				 break;
			 }else {
				 last=mid-1;
			 }
			 mid=(first+last)/2;
		 }
		 if(first>last) {
			 System.out.println("element is not found...");
		 }

	}

}
