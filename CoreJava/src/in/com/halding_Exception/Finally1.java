package in.com.halding_Exception;

public class Finally1 {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		String name="rays";
		
		try {
			System.out.println(name.charAt(5));	
			} catch (Exception e) {
		System.out.println(e);
			}try {	
				int c = a/b;
				System.out.println(c);
			} catch (Exception e) {
				System.out.println(e);
			}
		finally{
		         System.out.println("ye to chalega hin chahe exception ho");
			
		
		
		}
		
	}

}
