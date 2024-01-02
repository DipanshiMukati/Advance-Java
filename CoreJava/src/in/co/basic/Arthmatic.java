package in.co.basic;

import java.util.Scanner;

public class Arthmatic {
	public static void main(String[] args) {
		int a,b;
		System.out.println("Enter two number....");
	  Scanner sc = new Scanner(System.in);
	       a = sc.nextInt();
	       b = sc.nextInt();
	       System.out.println("Addition"+(a+b));
	       System.out.println("Sub"+(a-b));
	       System.out.println("Mult"+(a*b));
	       System.out.println("Div"+(a/b));
	       System.out.println("Rem"+(a%b));
	}

}
