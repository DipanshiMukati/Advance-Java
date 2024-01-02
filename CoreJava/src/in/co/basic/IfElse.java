package in.co.basic;

import java.util.Scanner;

public class IfElse {
       public static void main(String[] args) {
		  int n;
		  System.out.println("Enter any Number....!");
		  Scanner sc = new Scanner(System.in);
		  n = sc.nextInt();
		  System.out.println(n);
		  if (n>=0)
		  {
			  System.out.println("+ve");
		  }
		  else {
			  System.out.println("-ve");
		  }
	}
}
