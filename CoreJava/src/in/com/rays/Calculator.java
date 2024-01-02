package in.com.rays;

public class Calculator {
public static void main(String[] args) {
	double num1=100.00;
	double num2=10.00;
	double result;
	char oprator='+';
	switch(oprator) {
	case'+':result=num1-num2;
	        System.out.println("add="+result);
	        break;
	case'-':result=num1-num2;
    System.out.println("sub="+result);
    break;
    
	case'*':result=num1-num2;
    System.out.println("mult="+result);
    break;
	case'/':result=num1-num2;
    System.out.println("div="+result);
    break;
   default:System.out.println("defalt part");
    break;
    
	}
	
}
}
