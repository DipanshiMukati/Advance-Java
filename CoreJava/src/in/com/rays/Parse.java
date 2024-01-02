//convert integer data into string data

package in.com.rays;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Parse {
public static void main(String[] args) throws ParseException {
	String str= "03/10/2023";
SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy");
Date date =sd.parse(str);
System.out.println(date);
}
}
