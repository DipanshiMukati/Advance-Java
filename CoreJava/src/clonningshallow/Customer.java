package clonningshallow;

public class Customer implements Cloneable{
	
		String name=null;
		//int balance;
		Account a=new Account(0); 
 public Customer(String name,int balance)
 {
	 this.a.balance=balance;
	 this.name=name;
 }
 @Override
protected Object clone() throws CloneNotSupportedException {
	  Customer c=(Customer) super.clone();
	//Customer c =(Customer)super.clone();
	 c.a=(Account)a.clone();
	 return c;
 }
}	
		
		


