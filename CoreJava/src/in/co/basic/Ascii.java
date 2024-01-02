package in.co.basic;

import java.util.Scanner;

public class Ascii {
	public static void main(String[] args) {
		
		char ch;
	  	System.out.println("Enter any character");
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);
		 int a =ch;
		 System.out.println("Ascii value of "+ch +" is " +a);
	}

}
