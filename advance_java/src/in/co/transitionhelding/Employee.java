package in.co.transitionhelding;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Collection;

public class Employee {

		public static void main(String[] args) throws Exception {

			Connection conn = null;

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");

				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "root");

				conn.setAutoCommit(false);

				Statement stmt = conn.createStatement();

				int i = stmt.executeUpdate("insert into emp2 values(7, 'dipanshi', 1000)");
				i = stmt.executeUpdate("insert into emp2 values(8, 'prachi', 1000)");
				i = stmt.executeUpdate("insert into emp2 values(9, 'sonali', 1000)");

				conn.commit();

				System.out.println("Data Inserted = " + i);
			} catch (Exception e) {
				conn.rollback();
			}

		}

	}




