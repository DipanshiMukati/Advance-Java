package in.com.THREADS;

public class Class_B implements Runnable {

	@Override
	public void run() {
		int i ;
		for (i = 0; i <=10; i++) {
			System.out.println("Thread B"+i);
			
		}
		
	}
	  

}
