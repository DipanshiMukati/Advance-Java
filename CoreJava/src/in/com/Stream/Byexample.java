package in.com.Stream;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Byexample {
		public static void main(String[] args) throws IOException {
			
			 System.out.println("enter your text>>>");
			 InputStreamReader  isReader = new InputStreamReader(System.in);
			  BufferedReader in = new BufferedReader(isReader);
			  FileWriter writer =new FileWriter("C:\\Users\\AA\\Desktop\\javaIO\\ByKeyboard");
			  PrintWriter out = new PrintWriter (writer);
			  String line = in.readLine();
			 // String stop=null;
			if(!(line.equals("stop"))){
				 System.out.println("succsess");
			  //while(!(line.contentEquals("stop"))) {
//				  out.print(line);
//				  line =in.readLine();
				 isReader.close();
				  in.close();
				  writer.close();
	  }else {
          System.out.println("your compiler is closed ");
		 

	}

		}
}
