package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUntil {
	public static Connection getConnection() {
		 Connection c = null;
		 
		 try {
			//Đăng ký mysql với driverManager
			 DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			 
			 //Các thống số
			 	String url = "jdbc:mySQL://localhost:3306/nhasach";
				String username = "root";
				String password = "Nguloz.123";
				
			// Tạo kết nối
				c=DriverManager.getConnection(url,username,password);
				
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 return c;
	}
	
	public static void closeConnection(Connection c) {
		try {
			if(c!=0) {
				c.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	pu\\
}
