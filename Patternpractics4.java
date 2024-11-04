package javaprogram;

public class Patternpractics4 {

	public static void main(String[] args) {
		char a='A';
		int count=0;
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				char b=(char)(a+count);
				System.out.print(b+" ");
				count++;
			}
			System.out.println();
		}

	}

}
