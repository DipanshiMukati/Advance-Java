package in.com.THREADS;

public class MY_Thread implements Runnable{

	@Override
	public void run() {
		
		for (int i = 0; i <10; i++) {
			try {
				Thread.sleep(2000);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
	}
	
}


