package in.com.ComperatorALL;

import java.util.ArrayList;
import java.util.Collections;

public class Test_Emp {

	public static void main(String[] args) {
		ArrayList<Employee>list = new ArrayList<Employee>();
		list.add(new Employee(4, "dipu","indore"));
		list.add(new Employee(2, "shruti","khargoan"));
		list.add(new Employee(5, "prachi", "bhikangoan"));
	System.out.println(list);
		Collections.sort( list ,new Comperator_byname());
		Collections.sort(list,new By_address());
		System.out.println(list);
		
		
	}
}
		
		