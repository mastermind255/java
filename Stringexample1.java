package javaprogram;

public class Stringexample1 {

	public static void main(String[] args) {
		String s1="hi";
		String s2="hi";
		System.out.println(s1==s2);
		System.out.println("s1.equals(s2)"+s1.equals(s2));
		String s3=new String("HI");
		System.out.println("s1.equals(s3)"+s1.equals(s3));
		System.out.println("s1.equalsIgnoreCase(s3)"+s1.equalsIgnoreCase(s3));
		

	}

}
