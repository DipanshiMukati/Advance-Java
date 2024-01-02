package in.com.Interface;

public class Learn implements School , Student{

	@Override
	public void classes() {
	System.out.println(20);
		
	}

	@Override
	public void teachers() {
		System.out.println(5);
	
		
	}

	@Override
	public void study() {
	System.out.println("doing study");
		
	}

	@Override
	public void play() {
	System.out.println("play game");
	}
      public static void main(String[] args) {
	Learn l  =new Learn();
	l.classes();
	l.teachers();
	l.study();
	l.play();
}
}
