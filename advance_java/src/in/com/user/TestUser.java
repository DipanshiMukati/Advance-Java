package in.com.user;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestUser {
	 public static void main(String[] args)throws Exception {
		 
		 testAdd();
		 testsearch();
		 
	}

		

		private static void testAdd() throws Exception {

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

			UserBean bean = new UserBean();

			bean.setId(3);
			bean.setFirstname("sonali");
			bean.setLastName("patel");
		    bean.setLoginid("sonali@gmail.com");
			bean.setPassword("1234");
			bean.setDob(sdf.parse("2001-10-22"));
			bean.setAddress("indore");

			UserModal model = new UserModal();

			model.add(bean);

		}
		
		private static void testsearch() throws Exception {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
               
			UserBean bean = new UserBean();
			bean.setDob(sdf.parse("2023-11-30"));
			List list = new ArrayList();
			

			UserModal model = new UserModal();

			List list = model.search(bean);

			Iterator it = list.iterator();

			while (it.hasNext()) {

				bean = (UserBean) it.next();

				System.out.print(bean.getId());
				System.out.print("\t" + bean.getFirstname());
				System.out.print("\t" + bean.getLastName());
				System.out.print("\t" + bean.getLoginid());
				System.out.print("\t" + bean.getPassword());
				System.out.print("\t" + bean.getDob());
				System.out.println("\t" + bean.getAddress());

			}
		}
}
	
	

