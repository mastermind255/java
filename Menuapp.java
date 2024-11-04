package javaprogram;

import java.util.Scanner;

public class Menuapp {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int pen_price=30,book_price=50,pencil_price=20;
		char ch1;
		do
		{
			System.out.println("1.pen...price::30"+"\n"+"2.book...price::50"+"\n"+"3.pencil...price::20");
			System.out.println("Enter your choice");
			int ch=s.nextInt();
			System.out.println("Enter the quantity");
			int qty=s.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Total price for pens::"+(qty*pen_price));
				break;
			case 2:
				System.out.println("Total price for books::"+(qty*book_price));
				break;
			case 3:
				System.out.println("Total price for pencils::"+(qty*pencil_price));
				break;
				default:
					System.out.println("invalid choice");
			}
			System.out.println("Do u want to continue press y  y for yes and exit press n n for no");
			ch1=s.next().charAt(0);
			if (ch1=='n'||ch1=='N')
				break;
		}while(ch1=='y'||ch1=='Y');
	
	}

	}
