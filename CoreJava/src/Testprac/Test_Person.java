package Testprac;

public class Test_Person {
	public static void main(String[] args) throws CloneNotSupportedException {
		 
	 Person p1 = new Person (100);
	 Person p2= (Person)p1.clone() ;
	 p2.Student= 20;
	 System.out.println(p1.Student);
	 System.out.println(p2.Student);
		
	}

}
