package in.com.Exception_test;

public class prac3 {
	public static void d1(){
		d2();
	}
	public static void d2(){
		d3();
	}
	public static void d3(){
		try {
			
			String name= "kayu";
			System.out.println(name.charAt(3));
			
		} catch (Exception e) {
        System.out.println(e);	
     }
	}
	public static void main(String[] args) {
		 d1();
	}

}
