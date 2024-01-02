package in.com.polymorphism;
public class employee {
	
    void showdata() {
	System.out.println("this is employee detail");
 }
    
  }
    class Devloper extends employee{
	void showdata() {
	super.showdata();
	System.out.println("this is devloper detail");
	}
}
    
 