package in.com.Comprable;

import java.util.ArrayList;
import java.util.Collections;

public class Student_Test {
	public static void main(String[] args) {
		ArrayList<Student>list= new ArrayList<Student>();
		list.add(new Student("dipanshi","English", 10));
		list.add(new Student ("prachi", "Hindi", 20));
		list.add(new Student("bhavana", "maths", 15));
		System.out.println(list);
	Collections.sort(list);
		System.out.println(list);
				

	
	
	}

}
