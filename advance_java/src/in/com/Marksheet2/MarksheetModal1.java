package in.com.Marksheet2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class MarksheetModal1 {
	 public List search(MarksheetBean bean,int pageno, int pagesize) throws Exception {
	    	Class.forName("com.mysql.cj.jdbc.Driver");
	    	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/anandi","root","root");
	    	StringBuffer sql =  new StringBuffer("select * from marksheet where 1=1 ");
	    	PreparedStatement ps=conn.prepareStatement(sql.toString());	
	    	if (bean != null) {
				if (bean.getName() != null && bean.getName().length() > 0) {
					sql.append(" and name like '" + bean.getName() + "%'");
				
		}
	    		}
	    			if (pagesize>0) {
	    				pageno = (pageno -1)*pagesize;
						sql.append("limit"+pageno+" ,"+pagesize);
					}
	    	System.out.println("sql......!!!!");
	    	ResultSet rs=ps.executeQuery();
	    	List list=new ArrayList();
	    	while(rs.next()) {
	    	    bean =new MarksheetBean();
	    		bean.setId(rs.getInt(1));
	    		bean.setName(rs.getString(2));
	    		bean.setPhysics(rs.getInt(3));
	    		bean.setChemistry(rs.getInt(4));
	    		bean.setMaths(rs.getInt(5));
	    		list.add(bean);
	    	}
	    	return list;
	    }

}