   // input 5------------>120(5*4*3*2*1)
package in.co.basic;

import java.util.Scanner;

public class Factorial {
      public static void main(String[] args) {
		 int n ,fact = 1;
		 System.out.println("Enter any number");
		 Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		 
		 for (int i = 1; i <=n; i++) {
			 fact = fact*i;
			
		 }
		 System.out.println("factorial  " + fact);
	}
}
