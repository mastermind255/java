package javaprogram;

public class Stringreplace {

	public static void main(String[] args) {
		String s1="java is a programing language";
		String s2=s1.replace('a', 'k');
		System.out.println(s2);
		String s3="java is a progrmaning is  language ";
		String s4=s3.replace("is","was");
		System.out.println(s4);
		String s5=s3.replaceFirst("is", "was");
		System.out.println(s5);
		String s6=s3.replaceAll("is", "was");
		System.out.println(s6);
		String s7="hh12345kcf";
		String s8=s7.replace("\\d", "o");
		System.out.println(s8);
		

	}

}
