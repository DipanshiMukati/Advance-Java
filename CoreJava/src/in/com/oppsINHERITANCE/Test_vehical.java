package in.com.oppsINHERITANCE;

public class Test_vehical {

	public static void main(String[] args) {
		Vehical v = new Vehical();
		v.setMake("A");
		v.setModal("odi");
		v.setYear(1997);
		System.out.println(v.make);
		System.out.println(v.modal);
		System.out.println(v.year);
	    Car c = new Car();
        c.setColor("black");
	    c.setName("Thar");
	    c.setMake("B");
	    c.setModal("scarpio");
	    c.setYear(1998);
	 System.out.println(c.getColor());
	 System.out.println(c.getName());
	 System.out.println(c.getMake());
	 System.out.println(c.getmodal());
	 System.out.println(c.getYear());
		
	}

}
