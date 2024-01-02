// vowel or consonant //
//input a,i,e,o,u-----vowel
//input b,c,d
package in.co.basic;
import java.util.Scanner;
public class  Chack {
	public static void main(String[] args) {
	char ch;
	System.out.println("Enter any charater");
	Scanner sc = new Scanner(System.in);
    ch = sc.next().charAt(0);
 
     if (ch=='a'|| ch== 'e'||ch =='i'|| ch =='o'||ch =='u') {  
		System.out.println("vowel");
    	 
	} else {
		System.out.println("consonent");

	}
	}
}	
