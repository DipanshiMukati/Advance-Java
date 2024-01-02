package in.com.THREADS;

public class MY_AnotherThread  extends Thread{
	@Override
	public void run() {
		 for (int i =10; i >=0; i--) {
			 System.out.println(" MY_AnotherThread value="+i);
			 try {
				 Thread.sleep(1000);
				
			} catch (Exception e) {
			System.out.println(e);
			}
			 
			
		}
	        super.run();
	
	}
}