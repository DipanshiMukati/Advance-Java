///MULTILEVEL PROGRAMM

package Inheritance;
public class Testshape {  
public static void main(String[] args) {
	Shape s=new Shape();
	//s.setColor("black");
	//s.setBorderwidth(100);
	//System.out.println(s.getBorderwidth());
	//System.out.println(s.getColor());

	//Rectangle r = new Rectangle();
  // r.setLength(20);
 // r.setWidth(10);
 //  r.setBorderwidth(22);
  // r.setColor("blue");
	// System.out.println(r.getLength());
	  // System.out.println(r.getWidth());
	   //System.out.println(.getBorderwidth());
	   //System.out.println(r.getColor());
 
	Triangle t=new Triangle();
	t.setBase(2);
	t.setHeight(5);
	t.setBorderwidth(10);
	t.setColor("white");
	t.setLength(12);
	t.setWidth(15);
	t.setPI(3.14);
	t.setRadius(3);
	
	
	 System.out.println(t.getLength());
   System.out.println(t.getWidth());
   System.out.println(t.getBorderwidth());
   System.out.println(t.getColor());
   System.out.println(t.getBase());
   System.out.println(t.getHeight());
   System.out.println(t.getPI());
   System.out.println(t.getRadius());
}
}
