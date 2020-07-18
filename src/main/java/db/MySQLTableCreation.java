package db;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public class MySQLTableCreation {
	// Run this as Java application to reset the database.
		public static void main(String[] args) {
			try {
				// Step 1 Connect to MySQL.
				System.out.println("Connecting to " + MySQLDBUtil.URL);
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				Connection conn = DriverManager.getConnection(MySQLDBUtil.URL);
				
				if (conn == null) {
					return;
				}
				
				conn.close();
				System.out.println("Import done successfully");

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

}
