package test;

import java.sql.Connection;
import java.sql.SQLException;

import database.JDBCUtil;


public class testJDBCUtil {
	public static void main(String[] args) {
		
		try {
			// Bước 1:Tạo kết nối
			Connection connection = JDBCUtil.getConnection();

			// Bước 2: Tạo ra đối tượng statement
			java.sql.Statement st = connection.createStatement();
			
			
			// Bước 3: Thực thi câu lệnh SQL
			String sql = "INSERT INTO persons(last_name, first_name, gender, dob, income)"
					+ "VALUES (\"Tran\", \"Thi\", \"C\", \"2000-09-10\", 10000000)";
			
			int check = st.executeUpdate(sql);
			
			// Buoc 4: Xu ly ket qua
			System.out.println("So dong thay doi " + check);
			if(check > 0) {
				System.out.println("Them du lieu thanh cong");
			}else {
				System.out.println("Them du lieu that bai");
			}
			
			// Buoc 5: Ngat ket noi
			JDBCUtil.closeConnection(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
