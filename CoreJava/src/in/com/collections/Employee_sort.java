package in.com.collections;


public class Employee_sort implements Comparable<Employee_sort>{
    private int empId;
    private String name;
    private String mobile;
    
    public Employee_sort(int empId, String name, String mobile) {
    	
    	this.empId =empId;
    	this.name =name;
    	this.mobile = mobile;
    
    }

	@Override
	public int compareTo(Employee_sort o) {
	
		return this.name.compareTo(o.name);
	
	}
    @Override
    public String toString() {	
    	return empId + " " + name + " " + mobile;
    }
}
