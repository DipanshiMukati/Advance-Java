package in.com.Stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
	public static void main(String[] args) throws IOException {
		 FileReader r =new FileReader("C:\\Users\\AA\\Desktop\\javaIO\\Hello.txt");
		 BufferedReader reader =new BufferedReader(r);
		 String line = reader.readLine();
		 while(line!=null) {
			 System.out.println(line);
			 line =reader.readLine();
		 }
		 r.close();
		 reader.close();
			 
		 }
	}

