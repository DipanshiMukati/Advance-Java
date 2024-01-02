package in.com.OOPS_practicINHARITANCE;

public class Leptop extends Device1  {
	String name ;
	int price;
	String color;
	public Leptop (String name ,int price,String color) {
		    this.name=name;
		    this.price=price;
		    this.color=color;
	}   
	
	void Disp() {
		 System.out.println("this is leptop name = "+name);
		    System.out.println("this is leptop price = "+price);
		    System.out.println("this is leptop color = "+color);
		    
	}

}
