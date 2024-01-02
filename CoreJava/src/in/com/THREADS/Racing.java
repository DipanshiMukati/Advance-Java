package in.com.THREADS;

public class Racing extends Thread {
	String name = null;
	static Account ac = new Account();
	
	public Racing(String name) {
		this.name = name;

	}
	 @Override
	public void run() {
		for (int i = 0; i <=10; i++) {
	 this.ac.deposite("kirit", 1000);
			
		}
	}

}
