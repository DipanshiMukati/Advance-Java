package in.com.polymorphism;

	   public class employ {
	       public static void main(String[] args) {
	           Emp1 e = new Emp2();
	           e.edetail(); // Corrected method name to match the parent class
	       }
	   }

	   class Emp1 {
	       public void edetail() { // Matched method name with the parent class
	           System.out.println("my name is dipanshi");
	       }
	   }

	   class Emp2 extends Emp1 {
	       public void edetail() { // Matched method name with the parent class
	           System.out.println("my name is prachi");
	       }
	   }

 
   
	   
	   
	   
	   
	
