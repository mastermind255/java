package javaprogram;

public class Patterenpractics5 {

	public static void main(String[] args) {
		int start = 1; 
        int increment = 1; 
        for (int i = 0; i < 3; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j <= i; j++) {
                row.append(start); 
                start += increment;
                increment++; 
            }
            System.out.println(row.toString());
            
        }

	}

}
