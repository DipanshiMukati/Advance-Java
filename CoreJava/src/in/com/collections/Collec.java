package in.com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Collec {
public static void main(String[] args) {
    Collection c1 = new ArrayList();
 c1.add(3);
 c1.add("ram");
 c1.add(20.0);
 c1.add(20.000);
 
    Collection c2=new ArrayList();
    
    c2.add('a');
    c2.add(null);
    
    c2.addAll(c1);
    System.out.println(c1);
    
    //c2.clear();
    //System.out.println(c2);
    
    System.out.println(c1.contains("rays"));
    System.out.println(c1.containsAll(c2));

   // c1.clear();
    //System.out.println(c1.isEmpty());
    
    c1.remove(c1);
    System.out.println(c1);
    
  // c1.removeAll(c2);
   System.out.println(c2);
   
   c2.retainAll(c1);
   System.out.println(c1);
   
   c1.size();
   System.out.println(c1);
    
    
}
}