package in.co.scan;

import java.util.Scanner;

public class Scanner3 {
public static void main(String[] args) {
	System.out.println("Taking input from the user");
	Scanner sc = new Scanner(System.in);
//	String str = sc.next(); // for  read for one word
	String str = sc.nextLine();// for read full line
	
	System.out.println(str);
}
}