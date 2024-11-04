package javaprogram;

public class Patternpractics3 {

	public static void main(String[] args) {
		int row=3;
		char c='A';
		char c1=(char)c;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" "+c1);
			}
			c1=(char)(c+i);
			System.out.println();
		}

	}

}
