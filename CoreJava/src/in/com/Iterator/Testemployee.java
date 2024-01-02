package in.com.Iterator;

import java.util.ArrayList;

public class Testemployee {
	public static void main(String[] args) {
	 Employee e1=new Employee(1,"dipanshi" ,"indore" );
	 Employee e2=new Employee(2,"prachi", "khargoan");
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
   
	System.out.println(list);
	System.out.println("----for loop using");
	for (int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));
//	}
//	System.out.println("----for eavh loop");
//	for(Bank b3:list) {
//		
//	}
	
	
	}
	
	}

}
