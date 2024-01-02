package in.com.Home_prac;

public class Calculator_method {
         public static void main(String[] args) {
			double num1 = 50.00;
			double num2 = 250.450;
			double result = 0;
			char operator='%';
			switch (operator) {
			
			
			case'+'	: result = num2-num1;
			System.out.println("add="+result);
			break;
			
			case'-'	: result = num2-num1;
			System.out.println("sub="+result);
			break;
			
			case'*'	: result = num2-num1;
			System.out.println("mult="+result);
			break;
			
			case'/'	: result = num2-num1;
			System.out.println("div="+result);
             break;
	default: 
				    System.out.println("out");
				     break;
		}
     }
} 