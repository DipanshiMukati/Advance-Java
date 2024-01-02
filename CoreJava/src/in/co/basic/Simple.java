package in.co.basic;

import java.util.Scanner;

public class Simple {
public static void main(String[] args) {
	 int age;
	 System.out.println("Enter your value");
	 Scanner sc = new Scanner(System.in);
	  age = sc.nextInt();
	  System.out.println(age);
	  if (age>=18)
	  {
		  System.out.println("Eligible for votes...!");
	  }
	  if (age<=18)
	  {
		  System.out.println(" NOT Eligible for votes...!");
	  }
	  System.out.println("thankyou");
}
}
