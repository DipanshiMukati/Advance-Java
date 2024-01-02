package clonningshallow;


public class Teacher implements Cloneable{
	String subject = null;
	int lecture =0;
    Person p = new Person (4);
    public Teacher(String subject , int lecture,int Student) {
    	  this.subject = subject;
    	  this.lecture = lecture;
    	  this.p.Student=Student;
    }
   @Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	  Teacher t= (Teacher) super.clone();
	return t;
}
    
    
//   @Override
//   protected Object clone() throws CloneNotSupportedException {
//   	  Customer c=(Customer) super.clone();
//   	//Customer c =(Customer)super.clone();
//   	 c.a=(Account)a.clone();
//   	 return c;
//    }
//   }	
//    
//     
    
	

}
