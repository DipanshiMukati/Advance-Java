package Testprac;
	public class  without_scanner{
	    public static void main(String[] args) {
	        int num1 = 5; // Replace with the first number you want to swap
	        int num2 = 10; // Replace with the second number you want to swap

	        System.out.println("Before swapping:");
	        System.out.println("First number: " + num1);
	        System.out.println("Second number: " + num2);

	        // Swap the numbers without using a third variable
	        num1 = num1 + num2;
	        num2 = num1 - num2;
	        num1 = num1 - num2;

	        System.out.println("After swapping:");
	        System.out.println("First number: " + num1);
	        System.out.println("Second number: " + num2);
	    }
	}


