package in.com.ComperatorALL;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {
      public int id;
      public String name;
      public String address;
      
      public Employee(int id, String name, String address) {
       
    	  this.id=id;
    	  this.name=name;
    	  this.address=address;
    	 
      }
      @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return id+" "+name+" "+address;
    	
    }

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}