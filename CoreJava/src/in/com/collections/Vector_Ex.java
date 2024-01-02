package in.com.collections;

import java.util.Enumeration;
import java.util.Vector;

//this is drawback

public class Vector_Ex {
	public static void main(String[] args) {
		
		Vector<Integer> v =new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		System.out.println(v);
		
		Enumeration<Integer> e=v.elements();
		v.add(100);
		v.add(200);
		System.out.println(v);  
		
		while (e.hasMoreElements()) {
		 System.out.println(e.nextElement());
			
		}
	}

}
