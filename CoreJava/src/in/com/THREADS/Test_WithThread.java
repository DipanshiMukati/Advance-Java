package in.com.THREADS;

public class Test_WithThread {
	public static void main(String[] args) {
		WithThread w1 = new WithThread("java");
		WithThread w2 = new WithThread("python");
		w1.setPriority(5);
		w2.setPriority(4);
		
		w1.start();
		w2.start();
		
		
		
	}

}
