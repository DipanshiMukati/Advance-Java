package in.com.Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileInput {
	public static void main(String[] args) throws IOException {

	FileInputStream in = new  FileInputStream("C:\\Users\\AA\\Desktop\\javaIO\\shiv.jpg");
FileOutputStream out =new FileOutputStream("C:\\Users\\AA\\Desktop\\javaIO\\myGod.txt")  ;                          
	 int ch = in.read();
	 while(ch!= -1) {
		 out.write(ch);
		 ch = in.read();
	 }
	 in.close();
	 out.close();
	 System.out.println("data is copy");
	 }
}