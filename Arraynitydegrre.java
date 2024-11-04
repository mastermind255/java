package javaprogram;

public class Arraynitydegrre {

	public static void main(String[] args) {
        int arr1 [] [] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
            };

            int [] [] arr2 = new int[arr1.length][arr1.length];

            for(int i=0; i<arr1.length; i++){
                for(int j=0; j<arr1.length; j++){
                    arr2[j] [arr1.length-1-i] = arr1[i][j];
                }
            }

            for(int i=0; i<arr1.length; i++) {
            	for(int j=0; j<arr1.length; j++) {
            		System.out.print(arr2[i][j]+" ");
            	}
            	System.out.println();
            }


	}

}
