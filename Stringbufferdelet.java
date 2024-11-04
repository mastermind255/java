package javaprogram;

public class Stringbufferdelet {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("hello world");
//		sb.delete(0, 2);// for the delet  the multiple element in the string 
		sb.deleteCharAt(3);// this is use to delete the single element in string 
		System.out.println(sb);
	}

}
