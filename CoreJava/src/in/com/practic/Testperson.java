package in.com.practic;

public class Testperson extends  Person{
	  public static void main(String[] args) {
		Person p = new Person();
		
		p.setName("dipu");
		p.setAddress("indore");
		p.setDob(2005);
		
//		System.out.println(p.getName());
//		System.out.println(p.getAddress());
//		System.out.println(p.getDob());
         
		System.out.println("Name:"+p.getName());
		System.out.println("Address:"+p.getAddress());
		System.out.println("Dob:"+p.getDob());
		
	}
	  

}
