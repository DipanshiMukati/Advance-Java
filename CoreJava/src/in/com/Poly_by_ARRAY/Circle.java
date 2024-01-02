package in.com.Poly_by_ARRAY;

public class Circle extends Shape {
   private int radius;
   private double PI=3.14;
   
   public void setRadius(int radius) {
	    this.radius=radius;

   }
   public int getRadius() {
	       return radius;
   }
   public void area() {
	double carea= PI*radius*radius;
      System.out.println("circle area ="+ carea);
	
   
}
   
}
