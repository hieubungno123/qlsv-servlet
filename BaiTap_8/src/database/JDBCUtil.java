package database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class JDBCUtil {
	
	//private static final Connection NULL = null;

	public static Connection getConnection() {
		Connection c = null;
		
		try {
			//Đăng lý MySQL Driver với DriverManager
			DriverManager.registerDriver( new com.mysql.jdbc.Driver());
			
			//Các thông số
			String url = "jdbc:mySQL://localhost:3306/nhasach";
			String username = "root";
			String password = "Nguloz.123";
			
			// tao ket noi
			c=DriverManager.getConnection(url, username, password);
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return c;
	}
	
	public static void closeConnection(Connection c) {
		try {
			if(c != null) {
				c.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void printInfo(Connection c) {
		try {
			if(c!=null) {
			DatabaseMetaData mtdt = c.getMetaData();
			System.out.println(c.getMetaData().getDatabaseProductVersion());
			System.out.println(mtdt.getDatabaseProductName());
			System.out.println(c.getMetaData().toString());
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
