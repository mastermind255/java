package javaprogram;

public class Stringbufferex1 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		sb.append("welcome");
		System.out.println("String buffer sb::"+sb);
		sb.insert(1, "java");
		System.out.println("String buffer insert::"+sb);

	}

}
