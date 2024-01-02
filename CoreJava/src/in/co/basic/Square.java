// area = side * side
package in.co.basic;

import java.util.Scanner;

public class Square {
public static void main(String[] args) {
	int side,area;
	System.out.println("Enter side square");
	 Scanner sc = new Scanner(System.in);
	 side=sc.nextInt();
	area =side*side;
	System.out.println("Area of square "+area);
}
}
