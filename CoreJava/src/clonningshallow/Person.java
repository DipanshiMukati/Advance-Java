package clonningshallow;

public class Person implements Cloneable{
	int Student;
	
	public Person(int Student) {
      this.Student = Student;
	}
	 @Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();

     		                           
	}
}

