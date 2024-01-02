package in.com.OOPS_practicINHARITANCE;

public class Mobile extends Device1{
	String Company;
	int price;
	String verson;
	public Mobile(String Company,int price,String verson) {
		this.Company=Company;
		this.price=price;
		this.verson=verson;
	}
	void Disp() {
		System.out.println("this is mobile company = "+Company);
		System.out.println("this is mobile price = "+price);
		System.out.println("this is mobile verson = "+verson);
	}
	
	
	

}
