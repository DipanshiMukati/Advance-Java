package in.com.oopsabstact_Test;

public class Fruit_test{
	public static void main(String[] args) {
       Mango m= new  Mango() {

		@Override
		public void price() {
			 System.out.println("this is my fav fruit");
			
		}

		@Override
		public void color() {
			 System.out.println("redes");
			
		}
    		   
       };	   
    		m.color();
    		m.price();
    		
    		Banana b = new Banana() {

				@Override
				public void taste() {
               System.out.println("i like this test ");					
				}

				@Override
				public void color() {
                System.out.println(" yellow");					
				}
    		};
    		
    		   b.taste();
    		   b.color();
       }
	}
       
			
		  

