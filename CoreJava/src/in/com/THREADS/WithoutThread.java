package in.com.THREADS;


public class WithoutThread  {
	
	  String name ="null";
       public  WithoutThread (String name) {
    	   this.name =name;
       }
       public void run() {
    	  for (int i = 0; i <=10; i++) {
    		  System.out.println(name+" "+i);
    		 
			
		}
}
}
