package in.com.Home_prac;

import in.com.halding_Exception.LoginException;

public class FILE_helding1 {

public static void main(String[] args) {
	String name = "dipu";
     if (name.equals("dipaa")){
    	 System.out.println("prac");
     }
      else {
		//FILE_helding e = new FILE_helding();
    	  LoginException e = new LoginException();
				try {
					throw e ;
				}catch (Exception e2) {
					System.out.println(e);
		   }
	   }		
   }
}

