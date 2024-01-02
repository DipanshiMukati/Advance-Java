package in.com.THREADS;

public abstract class Test_Byrunnable {
      public static void main(String[] args) {
		
    	Thread t1 = new Thread(new BYrunnnable("INDIA"));
    	Thread t2 = new Thread( new BYrunnnable("SA"));
    	t1.setPriority(10);
    	t2.setPriority(5);
    	 t1.start();
    	 t2.start();
    			
    	  
    	  
    	  
    	  
	}
	
	
	
}
