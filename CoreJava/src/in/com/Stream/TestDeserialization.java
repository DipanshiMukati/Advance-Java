package in.com.Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class TestDeserialization {
	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("C:\\\\Users\\\\AA\\\\Desktop\\\\javaIO\\\\obj.txt");
		ObjectInputStream out = new ObjectInputStream(in);
		Marksheet m = (Marksheet)out.readObject();
		System.out.println("id="+m.id);
		System.out.println("name="+m.name);
		System.out.println("java="+m.java);
		System.out.println("phyton="+m.python);
		System.out.println("css="+m.css);
		System.out.println("html="+m.html);
		System.out.println("javascript="+m.javascript);
		System.out.println("total="+m.total);
				
		
	}
	
}
		
		
	

