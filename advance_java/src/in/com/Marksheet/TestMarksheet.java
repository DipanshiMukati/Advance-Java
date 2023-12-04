package in.com.Marksheet;

import java.util.Iterator;
import java.util.List;

public class TestMarksheet {

	public static void main(String[] args) throws Exception {

	//	testAdd();
		//testDelete();
		//testfindByPK();
      //  testAddData();
        testsearch();
	}

	private static void testDelete() throws Exception {

		MarksheetModel model = new MarksheetModel();
		model.delete(10);

	}

	private static void testAdd() throws Exception {

		MarksheetBean bean = new MarksheetBean();

		bean.setId(30);
		bean.setName("pratha");
		bean.setMaths(78);

		MarksheetModel model = new MarksheetModel();

		model.add(bean);

	}

	private static void testfindByPK() throws Exception {
		MarksheetModel modal = new MarksheetModel();
		MarksheetBean bean = modal.findByPk(2);
		if (bean!=null) {
			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getMaths());
			
		}else {
			System.out.println("id do not found..!!");
		}
		
		
	}
	private static void testAddData() throws Exception {
		
		MarksheetModel modal =  new MarksheetModel();
		MarksheetBean bean = new MarksheetBean();
		bean.setId(50);
		bean.setName("dipu");
		bean.setMaths(80);
		modal.add(bean);
		
	}
     

	public static void testsearch() throws Exception{
	MarksheetModel modal = new MarksheetModel();
	MarksheetBean bean = new MarksheetBean();
	List list = modal.search();
	Iterator it = list.iterator();
	
	while(it.hasNext());
	
	 bean = (MarksheetBean) it.next();
	System.out.println(bean.getId());
	System.out.println(bean.getName());
	System.out.println(bean.getMaths());
	
}
}
 