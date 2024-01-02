package in.com.practic;

public class Counter {
	public static int count =0;
	public static int nextNumber() {
			return ++count;
	}
	 public static void main(String[] args) {
		for (int i = 0; i<10; i++) {
			
		System.out.println("no#"+Counter.nextNumber());
	}
}
}
