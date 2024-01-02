package in.com.Home_prac;

import java.util.Calendar;
import java.util.Date;

public class formate_method {
    public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE,07);
		Date date =cal.getTime();
		System.out.println(date);
    	
    	
	}
}
