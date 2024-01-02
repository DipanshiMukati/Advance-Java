package in.co.basic; 

import java.util.Scanner;

public class Relational {
 public static void main(String[] args) {
	int a,b;
	System.out.println("enter two Number");
	Scanner sc = new Scanner(System.in);
	  a = sc.nextInt();//greater
	  b = sc.nextInt();//lesser
	  System.out.println("true/false "+(a<b));
	  System.out.println("true/false "+(a>b));
	  System.out.println("true/false "+(a<=b));
	  System.out.println("true/false "+(a>=b));
	  System.out.println("true/false "+(a==b));
	  System.out.println("true/false "+(a!=b));
}
}
