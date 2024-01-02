package clonningshallow;

public class Testcust {
	public static void main(String[] args) throws CloneNotSupportedException {
		Customer c1=new Customer("ram", 1000);
		Customer c2=(Customer) c1.clone();
		c2.name= "shyam";
		c2.a.balance=500;
		
		
		System.out.println(c1.name);
		System.out.println(c1.a.balance);
		System.out.println(c2.name);
		System.out.println(c2.a.balance);
		}

}
