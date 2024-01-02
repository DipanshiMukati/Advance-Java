package in.com.THREADS;

public class BYrunnnable  implements Runnable{
	  String name ;
	  public BYrunnnable( String name) {
            this.name =name;
	  
	  }

	@Override
	public void run() {
     for (int i = 0; i <=10; i++) {
    	System.out.println(name+" "+i);
		
		
     }
		
		
	}
} 
       

