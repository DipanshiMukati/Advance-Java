package in.com.THREADS;

public class Test_Racing {
   public static void main(String[] args) {
	Racing r1 = new Racing("siya");
	Racing r2 = new Racing("kayu");
	r1.start();
	r2.start();
}
}
