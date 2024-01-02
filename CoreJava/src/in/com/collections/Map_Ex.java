package in.com.collections;

import java.util.HashMap;
import java.util.Map;

public class Map_Ex {
	public static void main(String[] args) {
		Map<String,Integer>num =new HashMap<String,Integer>();
		num.put("siya", 3);
		num.put("kayu", 2);
		num.put("ansh", 1);
		num.put("kerav", 4);
		System.out.println(num);
//		String s="Seee";
//		String d="Seee  ";
//		String p=d.trim();
//		  System.out.println(s.equals(p) );
		//num.clear();
		//System.out.println(num);
		
		
		System.out.println(num.containsKey("siya"));
    System.out.println(num.containsValue(2));
    System.out.println(num.entrySet());
  // System.out.println(num.isEmpty());
		System.out.println(num.size());
		System.out.println(num.keySet());
		System.out.println(num.values());
		System.out.println(num.get("kayu"));
		System.out.println(num.put("kerav", 4));
	}

}
