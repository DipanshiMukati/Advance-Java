package in.com.prac2oops;

public class BankAccount  implements Cloneable{
	public double  balance = 0;
	public  BankAccount(Double b ) {
		balance =b;
	
	}
	
   @Override
protected Object clone() throws CloneNotSupportedException {
	return super.clone();
}
}
