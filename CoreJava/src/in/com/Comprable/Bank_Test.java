package in.com.Comprable;

import java.util.ArrayList;
import java.util.Collections;

public class Bank_Test {

	public static void main(String[] args) {
		ArrayList<Bank> list=new ArrayList<Bank>();
		list.add(new Bank(101, "Himanshu Jain", 0731));
		list.add(new Bank(76, "Amit", 7866));
		list.add(new Bank(987, "Ram", 9754));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

	}

}
