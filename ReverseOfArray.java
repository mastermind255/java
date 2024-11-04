package javaprogram;

public class ReverseOfArray {

	public static void main(String[] args) {
		int a[]= {3,4,5,6,7,1};
		int arr[]=new int[a.length];
		int j=0;
		for (int i=a.length-1;i>=0;i--) {
			arr[j]=a[i];
			j++;
		}
		for (int ar:arr) {
			System.out.print(ar);
		}
		

	}

}
