package javaprogram;

public class Practice1 {

	public static void main(String[] args) {
		int n=20;
		for(int i=0;i<5;i++) {
			switch(i) {
			case 0:n+=3;
			break;
			case 2:n-=5;
			case 4:n*=2;
			default:n+=1;
			break;
			}
		}
		System.out.println(n);

	}

}
