package in.com.Stream;

import java.io.FileWriter;
import java.io.IOException;


public class TestWriter {
	public static void main(String[] args) throws IOException {
		FileWriter writer =new FileWriter("C:\\Users\\AA\\Desktop\\javaIO\\name.txt");
		 writer.write("Hello who are u");
		 writer.close();
		 System.out.println("data write successfully");
	}

}
