package in.co.basic;

public class Variable {
	     int c = 30;//instance variable
	    static int b =20 ; // static variable
	    public static void main(String[] args) {
			int a= 10;//local variable
			Variable v = new Variable();
			System.out.println(a);//local variable
			System.out.println(Variable.b);// static variable
			System.out.println(v.c);//instance variable
			
		}
	    

}
