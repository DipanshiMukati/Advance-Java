package in.com.THREADS;

public class WithThread extends Thread {
		   String name =null;
		   public WithThread(String name) {
			    this.name =name;
		   }
		   @Override
		public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name +" "+i);
				
			}
		
			
			
		}
		   
}
		   

         						