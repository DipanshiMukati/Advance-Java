package in.com.practic;

public class Typecasted {
public static void main(String[] args) {
	   //int-->double 
	// implicit
	int a=5;
	double b=a;
	System.out.println(b);
	//explicit
	double c=10.55;
	int d=(int )c;
	System.out.println(d);
	
	
	//implicit to convert small into big
	//explicit to convert big into small


	int g=22;
	float h=(float)g;
	System.out.println(g);
	
	
	float e = 15;
	int f=(int)e;
	System.out.println(f);
	
	int i= 24;
	long j=(long)i;
	System.out.println(j);
	
	long k= 30;
	int l=(int)k;
	System.out.println(l);
	
}
}
