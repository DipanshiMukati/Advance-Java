//input a b c
//1. find semiperameter
//area of triangle

package in.co.basic;

import java.util.Scanner;

public class Trianle {

	public static void main(String[] args) {
		int a,b,c,sp,area;
		System.out.println("Enter value for sides of Triangle");
		 Scanner sc = new Scanner(System.in);
		 a=sc.nextInt();
		 b=sc.nextInt();
		 c=sc.nextInt();
     sp = (a+b+c)/2;//formula of semiperameter//
     area= (int) Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
      System.out.println("Area of triangle"+area);
	}

}
