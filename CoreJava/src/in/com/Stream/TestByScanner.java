package in.com.Stream;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class TestByScanner {
	public static void main(String[] args) throws IOException  {
		FileReader file =new FileReader("C:\\Users\\AA\\Desktop\\javaIO\\Hello.txt");
			Scanner sc =new Scanner(file);
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			  sc.close();
			  
	}
}
