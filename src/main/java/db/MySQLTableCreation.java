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
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection(MySQLDBUtil.URL);
				
				if (conn == null) {
					return;
				}
				
				// Step 2 Drop tables in case they exist.
				Statement statement = conn.createStatement();
				String sql = "DROP TABLE IF EXISTS keywords";
				statement.executeUpdate(sql);

				sql = "DROP TABLE IF EXISTS history";
				statement.executeUpdate(sql);

				sql = "DROP TABLE IF EXISTS items";
				statement.executeUpdate(sql);

				sql = "DROP TABLE IF EXISTS users";
				statement.executeUpdate(sql);

				
				conn.close();
				System.out.println("Import done successfully");

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

}
