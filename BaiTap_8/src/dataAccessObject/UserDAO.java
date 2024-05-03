package dataAccessObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.JDBCUtil;
import model.User;

public class UserDAO implements DAOInterface<User> {
	
	public static UserDAO getInstance(){
		return new UserDAO();
	}

	@Override
	public int insert(User t) {
		try {
			//b1:Connect MySQL
			Connection con = JDBCUtil.getConnection();
			//b2:Create sql
			String sql = "INSERT INTO nhasach.user "+
						"VALUES (?,?);";
			//b3:Create PrepareStatement
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1,t.getUsername());
			st.setString(2,t.getPassword());
			//b4:Execute sql
			st.executeUpdate();
			//b5:Interrupt MySQL
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int update(User t) {
		try {
			//b1:Connect MySQL
			Connection con = JDBCUtil.getConnection();
			//b2:Create sql
			String sql = "UPDATE nhasach.user "+
						"SET password=?"+
						"WHERE username=?";
			//b3:Create PrepareStatement
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, t.getPassword());
			st.setString(2, t.getUsername());
			//b4:Execute sql
			st.executeUpdate();
			//b5:Interrupt MySQL
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		return 0;
	}

	@Override
	public int delete(User t) {
		try {
			//b1:Connect MySQL
			Connection con = JDBCUtil.getConnection();
			//b2:Create sql
			String sql = "DELETE FROM nhasach.user WHERE username=?";
			//b3:Create PrepareStatement
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, t.getUsername());
			//b4:Execute sql
			st.executeUpdate();
			//b5:Interrupt MySQL
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public ArrayList<User> selectAll() {
		ArrayList<User> result = new ArrayList<User>();
		
		try {
			//b1:Connect MySQL
			Connection con = JDBCUtil.getConnection();
			//b2:Create sql
			String sql = "SELECT * FROM nhasach.sach";
			//b3:Create PrepareStatement
			PreparedStatement st = con.prepareStatement(sql);
			//b4:Execute sql
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				String username = rs.getString("username");
				String password = rs.getString("password");
				String hoVaTen = rs.getString("hoVaTen");
				User user = new User(username, password, hoVaTen);
				result.add(user);
			}
			//b5:Interrupt MySQL
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public User selectById(User t) {
		User user = null;
		try {
			//b1:Connect MySQL
			Connection con = JDBCUtil.getConnection();
			//b2:Create sql
			String sql = "SELECT * FROM nhasach.user " + 
						"WHERE username=?";
			//b3:Create PrepareStatement
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1,t.getUsername());
			//b4:Execute sql
			ResultSet rs = st.executeQuery();
				String username = rs.getString("username");
				String password = rs.getString("password");
				String hoVaTen = rs.getString("hoVaTen");
			user = new User(username, password, hoVaTen);
			//b5:Interrupt MySQL
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public ArrayList<User> selectByCondition(String condititon) {
		ArrayList<User> result = new ArrayList<User>();
				
		//b1:Connect MySQL
		Connection con = JDBCUtil.getConnection();
		//b2:Create sql
		String sql = "SELECT * FROM nhasach.user "+
					"WHERE username=?";
		//b3:Create PrepareStatement
		//b4:Execute sql
		//b5:Interrupt MySQL
		return null;
	}

	
}
