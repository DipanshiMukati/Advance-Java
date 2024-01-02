package in.com.Poly_by_ARRAY;

public class polyshape {
public static void main(String[] args) {
	Shape s= new Shape ();
	s.setColor("green");
    s.setBorderwidth(100);
    s.area();
    System.out.println(s.getColor());
    System.out.println(s.getBorderwidth());

    Rectangle r= new Rectangle();
    r.area();
    r.setLength(20);
    r.setWidth(30);
    r.setBorderwidth(30);
    r.setColor("white");
    System.out.println(r.getLength());
    System.out.println(r.getWidth());
    System.out.println(r.getBorderwidth());
    System.out.println(r.getColor());

   Circle c= new Circle();
    c.area();
    c.setRadius(2);
    System.out.println(c.getRadius());
}
    
}   