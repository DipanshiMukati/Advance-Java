package in.com.Marksheet2;

import java.util.Iterator;
import java.util.List;

public class TestMarksheet1 {

	public static void main(String[] args) throws Exception {
		 testsearch();
    }

	private static void testsearch() throws Exception {
		MarksheetModal modal = new  MarksheetModal();
		List list =  modal.search(null, 1, 10);
		Iterator it = list.iterator();
		
		while (it.hasNext()) {
			
			MarksheetBean bean = (MarksheetBean) it.next();
			System.out.println(bean.getId());
			System.out.print("\t"+bean.getName());
			System.out.print("\t"+bean.getPhysics());
			System.out.print("\t"+bean.getChemistry());
			System.out.println("\t"+bean.getMaths());
			  
		}
		
	}
}