package in.co.basic;

import java.util.Scanner;

public class CountDigit {
   public static void main(String[] args) {
	
	   int n , Count = 0;
	   System.out.println("Enter any Number");
	   Scanner sc = new Scanner(System.in);
	   n = sc.nextInt();
	   while(n>0) {
		   n =n/10;
		   Count++ ; 
	   }		   
		   System.out.println("Number of digit" + Count);
     }
}
