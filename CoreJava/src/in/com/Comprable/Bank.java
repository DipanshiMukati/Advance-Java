package in.com.Comprable;

public class Bank implements Comparable<Bank> {
	public int id ;
	public String name;
	public int number;
	public Bank(int id,String name,int number) {
		this.id=id;
		this.name=name;
		this.number=number;
		
		
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+" "+name+" "+number;
	}
	@Override
	public int compareTo(Bank o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
	
	}