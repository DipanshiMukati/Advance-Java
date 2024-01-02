package in.com.rays;

public class Circle{
	private int radius;
	private  static double PI=3.14;
	
	public int getRadius() {
		return radius;
	}
	public void set{
		this.radius = radius;
	}
   public void area() {
	   double carea= PI* getRadius()*getRadius();
	   System.out.println("Circle area="+ carea);
   }
}  

