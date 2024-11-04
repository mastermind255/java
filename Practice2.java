package javaprogram;

import java.util.Arrays;

public class Practice2 {
	public static void main(String[] args) {
		int arr[]= {20,30,10,40,50};
		int i=0;
		int j=arr.length-1;
		while(i<=j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(arr));
			
		

	}

}
