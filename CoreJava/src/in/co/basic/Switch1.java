package in.co.basic;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		   int a = 10, b =20, ch;
		   System.out.println("Enter user choise...!\n");
		   Scanner sc = new Scanner(System.in);
			 ch = sc.nextInt();
			 switch(ch)
			 {
  case 1:System.out.println("sum" +(a+b));
	     break;
				 
  case 2:System.out.println("sub" +(a-b));
	     break;
				 
  case 3:System.out.println("mult" +(a*b));
	     break;
				 
default :System.out.println("Invalid choice....!");
		     break;
				 
			 }
	}

}
