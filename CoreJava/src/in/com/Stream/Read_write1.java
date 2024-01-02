package in.com.Stream;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;

public class Read_write1 {
	File f =new File("ram.txt");
	try {
		f.createNewFile();
		}catch(IOException e) {
			System.out.println("FILE NOT FOUND");
		}
//	try {
//		FileWriter fw =new FileWriter(f);
//		fw.write("i can do it ");
//		fw.close();
//	}catch(IOException e) {
//		System.out.println("anything");
//		e.printStackTrace();
//	}
}
}
