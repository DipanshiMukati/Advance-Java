package in.co.basic;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	 int n1,n2,ch,cal ;
	 System.out.println("Enter two number");
	 Scanner sc = new Scanner (System.in);
	 n1 = sc.nextInt();
	 n2 = sc.nextInt();
	 System.out.println("select opration");
	 ch =sc.nextInt();

	 if (ch==1) {
		cal =n1 +n2;
		System.out.println("Addition "+cal);
	}
	 else if (ch==2) {
		 cal = n1-n2;
		 System.out.println("Substraction  "+cal);
		
	}
	 else if (ch==3) {
		cal = n1*n2;
		System.out.println("multiplication  "+cal);
	}
	 else if (ch==4) {
		 cal = n1/n2;
		 System.out.println("divisible  "+cal);
		
	}
	 else {
		 
		cal = n1 %n2;
		System.out.println("Reminder  "+cal);
	    }
     }

}
