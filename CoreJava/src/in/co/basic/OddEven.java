package in.co.basic;

import java.util.Scanner;

public class OddEven {
     public static void main(String[] args) {
		 int n;
		 System.out.println("Enter Any Number");
		 Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		
		if (n%2==0) {
			System.out.println("Even Number");
			
		} else {
         System.out.println("Odd Number");
		}
		
     }
}
