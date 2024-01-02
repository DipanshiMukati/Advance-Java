package in.com.oppsECAPSULATION;

public class TestAccount {
     public static void main(String[] args) {
		
    	 Account a =  new Account();
    	  a.setBalance(1000);
    	  a.setNumber("123456789");
    	  a.setType("credit");
    	 System.out.println( a.getBalance());
          System.out.println( a.getNumber());
    	  System.out.println(a.getType());
	}
}
