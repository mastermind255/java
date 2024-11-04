package javaprogram;

public class Remove_DuplicateArray {

	public static void main(String[] args) {
	int arr [] = {1, 45, 69, 78, 45, 1, 69, 100, 1002, 100};
		
		System.out.print("Duplicates elemnts are: ");
		for(int i=0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.print(arr[i]+" ");
				}
			}
		}

	}

}
