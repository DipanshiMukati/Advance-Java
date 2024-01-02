package in.com.Poly_by_ARRAY;

public class Rectangle extends Shape{
		   private int length;
		   private int width;
		   
		   public void setLength( int length) {
			    this.length=length;
   }
		   public  int getLength() {
			  return length;
   }
		   public void setWidth(int width) {
			   this.width=width;
  }
			   public int getWidth() {
				   return width;
     }
			   public  void area()	{
					int Rarea= getLength()*getWidth();
					System.out.println("Rectangle area="+Rarea);
   }	   
			   
			   
}


