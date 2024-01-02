package in.com.THREADS;

public class Class_A implements Runnable{

	@Override
	public void run() {
		int i ;
		for ( i = 0; i <=10; i++) {
			System.out.println("Thread A"+i);
			
		}
		
	}
	

}
