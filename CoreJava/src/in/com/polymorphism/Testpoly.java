package in.com.polymorphism;

public class Testpoly {
public static void main(String[] args) {
	shape s=new shape();
	s.setBorderwidth(50);
	s.setColor("red");
	s.area();
	
  Ractangle r =new Ractangle ();
  r.setBorderwidth(30);
  r.setLength(10);
  r.setWidth(10);
	r.area();
	
  Tringle t=new Tringle();
    t.setBase(30);
     t.setHeight(20); 
      t.area();
      Circle c =new Circle ();
      c.setRadius(10);
      c.area();
}     
}
