package javaprogram;

public class Patterenpractics2 {
	

	public static void main(String[] args) {
		       
		        for (int i = 1; i <= 3; i++) {
		           
		            for (int j = i; j < 3; j++) {
		                System.out.print(" ");
		            }
		            
		            for (int k = 1; k <= (2 * i - 1); k++) {
		                System.out.print("*");
		            }
		  
		            System.out.println();
		          }
	}

}
