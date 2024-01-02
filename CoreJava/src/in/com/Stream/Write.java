package in.com.Stream;

import java.io.FileWriter;
import java.io.IOException;

public class Write { 
    public static void main(String[] args) throws IOException {
		FileWriter writer =new FileWriter("C:\\Users\\AA\\Desktop\\javaIO\\name.txt");
		writer.write("i dont know");
		writer.close();
		System.out.println("data success");
}
}