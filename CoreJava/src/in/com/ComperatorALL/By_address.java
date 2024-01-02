package in.com.ComperatorALL;
 
import java.util.Comparator;

public class By_address implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.address.compareTo(o2.address);
	}

}
