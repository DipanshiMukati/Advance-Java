package in.co.basic;

import java.util.Scanner;

public class Swap {
public static void main(String[] args) {
	 int a, b,temp;
	 System.out.println("Enter two Numbers");
	 Scanner sc = new Scanner(System.in);
	 a=sc.nextInt();
	 b=sc.nextInt();
	 System.out.println("Before swapping "+a+" "+b);
	 temp =a;
	 a=b;
	 b = temp;
	 System.out.println("After swapping "+a+" "+b);
    }
}
