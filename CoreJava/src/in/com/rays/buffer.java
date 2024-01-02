package in.com.rays;

public class buffer {
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("DIPANSHI");
	sb.append("MUKATI");
	System.out.println(sb.length());
	System.out.println(sb.charAt(3));
	System.out.println(sb.capacity());
	System.out.println(sb.indexOf("MUKATI"));
	System.out.println(sb.reverse());
	System.out.println(sb.replace(1,14, "A u"));
}   
}
