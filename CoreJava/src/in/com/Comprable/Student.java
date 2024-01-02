package in.com.Comprable;

public class Student implements Comparable<Student>{
	public String name ;
   public String sub ;
	public int number;
	public Student(String name,String sub,int number) {
		this.name=name;
		this.sub = sub;
		this.number=number;
		 
					
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" "+sub+" "+number;
	}	
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.number-o.number;
	}
	
	
}