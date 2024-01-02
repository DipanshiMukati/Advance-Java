package in.co.basic;

import java.util.Scanner;

public class MaximumNo {
  public static void main(String[] args) {
	int a=10, b= 20;
	System.out.println("Enter two number");
	Scanner sc = new Scanner(System.in);
   a = sc.nextInt();
   b = sc.nextInt();
	if (a>b) {
		System.out.println(a);
	} else {
       
		System.out.println(b);
	}
   }
}
