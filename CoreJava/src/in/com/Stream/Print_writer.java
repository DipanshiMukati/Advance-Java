package in.com.Stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Print_writer {
	public static void main(String[] args) throws IOException {
		 
		FileWriter file = new FileWriter("C:\\Users\\AA\\Desktop\\javaIO\\print.txt");
		PrintWriter out = new PrintWriter(file);
		  out.println("hello everyone");
		  out.println("how are u");
		  out.println("whats going on");
		  System.out.println("data  print successfully!!!!");
		  out.close();
	
		
	}

}
