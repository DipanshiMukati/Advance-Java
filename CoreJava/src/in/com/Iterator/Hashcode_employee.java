package in.com.Iterator;

public class Hashcode_employee {
        private int id=0;
        private String name=null;
        private String address=null;

     public Hashcode_employee(int id,String name,String address) {
            this.id=id;
            this.name=name;
            this.address=address;
            
      }
          public void setId(int id) {
          	this.id=id;
      }
          public int getId() {
          	return id;
      }

          public void setName(String name){
                this.name=name;
   }
         public String getName() {
      	   return name;
    }           
          public void setAddress(String address) {
          	this.address=address;
          }
  	    public String getAddress() {
  	    	return address ;
       }  
          @Override
          public  String to String() {
        	  return id+""+name+ ""+address;
        	  }
  	    @Override
         public boolean equals(object obj)  {
        	 if( !  (obj instanceof Hashcode_employee)) {
        	      return false;
         }
        	 Hashcode_employee  e=(Hashcode_employee) obj;
        	 boolean b =this.id==e.id &&this.name==e.name  && this.address==e.address ;
        	        return b;
  	    }
}
  	           
