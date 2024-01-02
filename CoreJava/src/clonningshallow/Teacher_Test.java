package clonningshallow;

public class Teacher_Test {
	 public static void main(String[] args) throws CloneNotSupportedException {
		
		Teacher t1 = new Teacher("HINDI",4,6);
		Teacher t2 =(Teacher)t1.clone();
		  t2.subject ="English";
		  t2.lecture= 5;
		  t2.p.Student=20;
		  System.out.println(t1.subject);
		  System.out.println(t1.lecture);
		  System.out.println(t2.subject);
		  System.out.println(t2.lecture);
		  System.out.println(t2.p.Student);
		 
	 }
		
}
