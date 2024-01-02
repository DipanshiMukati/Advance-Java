package in.com.halding_Exception;
    
    class Admin_check extends RuntimeException{
    	public Admin_check() {
    		super("error syntax");
    	}
    	
    }
    

public class check {
	public static void main(String[] args) {
		
		String name= "dipu";
		if (name.equals("dipu")) {
				System.out.println("user valid");
				
			
		}
		else {
			try {
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}
