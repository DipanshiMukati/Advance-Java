 package in.com.Abstract;

public class Test1{
	public static void main(String[] args) {
		Ractangle rs= new Ractangle() {
			
			@Override
			public void area() {
		System.out.println("this is area of ract");
				
			}
		};
		
		rs.area();
		rs.Area();
Circle c=new Circle() {

	@Override
	public void area() {
		System.out.println("this is cicle class");
	}
};
  c.area();
  c.radius();
	}
}





	