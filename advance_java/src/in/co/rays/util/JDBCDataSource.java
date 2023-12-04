package in.co.rays.util;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.CommonDataSource;




public final class JDBCDataSource {

	private static JDBCDataSource jds=null;

	private CommonDataSource ds = null;

	private void JDBCDatasource() {
				
			try {

			ds = new CommonDataSource();

			ds.setDriverClass("com.mysql.jdbc.Driver"); 

			ds.setJdbcUrl("jdbc:mysql://localhost/st_adv_java");

			ds.setUser("root");

			ds.setPassword("root");

			ds.setInitialPoolSize (5);

			ds.setAcquireIncrement (5);

			ds.setMaxPoolSize (50);

			} catch (PropertyVetoException e) {

			e.printStackTrace();
			}
			}

	public static JDBCDataSource getInstance() {
		
			if (jds == null) {

			jds = new JDBCDataSource(); 
			
			}

			return jds;

			}

	public static Connection getConnection() {

		try {
			return getInstance().ds.getConnection();

		} catch (SQLException e) {
			return null;
		}
	}
}
}