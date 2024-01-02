package in.com.practic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Calender {
	public static void main(String[] args) throws ParseException {
	Date today =new Date();
	SimpleDateFormat sdf = new SimpleDateFormat();
	String strDate = sdf.format(today);
    System.out.println("Format #1:"+ strDate);
     
     SimpleDateFormat sdf2 =new SimpleDateFormat("dd\MM\yyyy");
	strDate = sdf2.format(today);
	
	System.out.println("Format #2:"+ strDate);
	Date pDate =sdf.parse("10\10\2023");
	System.out.println(pDate);
}
}
