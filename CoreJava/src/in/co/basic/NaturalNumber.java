package in.co.basic;

import java.util.Scanner;

public class NaturalNumber {

	public static void main(String[] args) {
	  int n, sum=0;
	  System.out.println("Enter no of term ");
	  Scanner sc = new Scanner(System.in);
	  n = sc.nextInt();
	  for (int i = 1; i<=n; i++) {
		   sum = sum + i;
		  
	}
	  System.out.println("Addition"+ sum );

	}

}
