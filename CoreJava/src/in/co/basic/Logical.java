//lopgical oprater

package in.co.basic;

public class Logical {
  public static void main(String[] args) {
	System.out.println("Logical AND");
	System.out.println((10>5)&&(2>1));//true
	System.out.println((10>5)&&(2<1));//false
	System.out.println((10<5)&&(2<1));//false
	
	System.out.println("Logical OR");
	System.out.println((10>5)||(2>1));//true
	System.out.println((10>5)||(2<1));//TRUE
	System.out.println((10<5)||(2<1));//false
	
	
	System.out.println("Logical NOT");
	System.out.println(!(10>5));//false
	System.out.println(!(105<5));//true
	
	
}
}
