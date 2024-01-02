package in.com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test_sort {

	public static void main(String[] args) {
		ArrayList<Employee_sort>e1 =new ArrayList<Employee_sort>();
		e1.add(new Employee_sort(5, "Dipanshi", "123456")) ;
		e1.add(new Employee_sort(3,"Prachi","67891"));
		e1.add(new Employee_sort(4, "sonali", "13578"));
		e1.add(new Employee_sort(1, "Bhavna", "246810"));
		
		System.out.println(e1);
		
		Collections.sort(e1);
		System.out.println(e1);
		
	}
}
