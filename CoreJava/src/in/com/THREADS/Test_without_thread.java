package in.com.THREADS;

public class Test_without_thread {
	public static void main(String[] args) {
	
	WithoutThread w1 = new WithoutThread("king");
	WithoutThread w2 = new WithoutThread("kohali");
     w1.run();
     w2.run();	  
	}
}