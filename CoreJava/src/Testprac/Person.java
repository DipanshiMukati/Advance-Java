package Testprac;

public class Person implements Cloneable{
           int Student = 0;
	
           public Person(int Student) {
        	   this.Student = Student;
    }
         @Override
        protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
        }  
           
           
}
