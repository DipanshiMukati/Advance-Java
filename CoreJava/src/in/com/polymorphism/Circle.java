package in.com.polymorphism;

import Inheritance.Rectangle;

public class Circle extends shape {
		private int radius;
		private  static double PI=3.14;   
		
		public int getRadius() {
			return radius;
		}
		public void setRadius(int radius){
			this.radius = radius;
		}
	   public void area() {
		   double carea= PI* getRadius()*getRadius();
		   System.out.println("Circle area="+ carea);
	   }
	}  



