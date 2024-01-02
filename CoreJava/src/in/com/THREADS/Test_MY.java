package in.com.THREADS;

public class Test_MY {
	public static void main(String[] args) {
		MY_Thread my = new MY_Thread();
		Thread t1 = new Thread(my);
		MY_AnotherThread m1 = new MY_AnotherThread();
		  t1.start();
		m1.start();
		
	}
      


}
