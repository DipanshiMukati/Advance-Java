package in.co.basic;

import java.util.Scanner;

public class OddEven_Range {
     public static void main(String[] args) {
		 int n ,sum=0 ;
		System.out.println("Enter Range");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		 if (n%2==0) {
			 for (int i = 0; i <=n; i=i+2) {
				sum =sum+i;
			}
			 System.out.println("sum of Even Number"+ sum);
		} else {
          
			for (int i = 0; i <=n; i= i+2) {
				sum = sum +i;
			}
			System.out.println("sum of Odd Number"+ sum);
		}
		
  }
}
