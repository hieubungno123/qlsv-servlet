package dataAccessObject;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.cj.xdevapi.Result;

import database.JDBCUtil;
import model.KhachHang;

public class KhachHangDAO implements DAOInterface<KhachHang> {

	@Override
	public int insert(KhachHang t) {
		try {
			//b1: Tạo lien ket mysql
			Connection con = JDBCUtil.getConnection();
			//b2: Tao cau lệnh statement
			Statement st = con.createStatement();
			//b3: Tạo câu lệnh 
			String sql = "INSERT INTO nhasach.khachhang (hoVaTen,ngaySinh,diaChi) "+
						"VALUES ('"+ t.getHoVaTen()+"',"+t.getNgaySinh()+",'"+t.getDiaChi()+"')";
			//b4: Thực thi câu lệnh sql
			st.executeUpdate(sql);
			//b5: Ngắt kết nối
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return 0;
	}

	@Override
	public int update(KhachHang t) {
		try {
			//b1: Connect MySQL
				Connection con = JDBCUtil.getConnection();
			//b2: Create statement
				Statement st = con.createStatement();
			//b3: Create sql
				String sql = "UPDATE nhasach.sach "+
						"SET hoVaTen='" + t.getHoVaTen() + "'," + t.getNgaySinh()+",'"+t.getDiaChi()+"'"+
						"WHERE id="+t.getId()+";";
			//b4: Execute sql
				st.executeUpdate(sql);
			//b5: Close SQL Connection
				JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return 0;
	}

	@Override
	public int delete(KhachHang t) {
		try {
			//b1:Connect MySQL
			Connection con = JDBCUtil.getConnection();
			//b2:Create Statement
			Statement st = con.createStatement();
			//b3:Create sql
			String sql = "DELETE FROM nhaach.sach WHERE id=" +t.getId()+";"; 
			//b4:Execute sql
			st.executeUpdate(sql);
			//b5:Interrupt MySQL
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public ArrayList<KhachHang> selectAll() {
		ArrayList<KhachHang> Result = new ArrayList<KhachHang>();
		
		try {
			//b1:Connect MySQL
			Connection con = JDBCUtil.getConnection();
			//b2:Create Steament
			Statement st = con.createStatement();
			//b3:Create sql
			String sql = "SELECT * FROM nhasach.sach";
			//b4:Execute sql
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt("id");
				String hoVaTen = rs.getString("hoVaTen");
				Date ngaySinh = rs.getDate("ngaySinh");
				String diaChi = rs.getString("diaChi");
				
			KhachHang khachHang = new KhachHang(id, hoVaTen, ngaySinh, diaChi);
			Result.add(khachHang);
			}
			//b5:Interrupt MySQL
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public KhachHang selectById(KhachHang t) {
		KhachHang result = null;
		
		try {
			//b1:Connect MySQL
			Connection con = JDBCUtil.getConnection();
			//b2:Create Statement
			Statement st = con.createStatement();
			//b3:Create sql
			String sql = "SELECT * FROM nhasach.sach "+
						"WHERE id="+t.getId()+";";
			//b4:Execute sql
			ResultSet rs = st.executeQuery(sql);
			
			int id = rs.getInt("id");
			String hoVaTen = rs.getString("hoVaTen");
			Date ngaySinh = rs.getDate("ngaySinh");
			String diaChi = rs.getString("diaChi");
			
			result = new KhachHang(id, hoVaTen, ngaySinh, diaChi);
			//b5:Interrupt MySQL
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public ArrayList<KhachHang> selectByCondition(String condititon) {
		ArrayList<KhachHang> result = new ArrayList<KhachHang>();
		
		try {
			//b1:Connect MySQL
			Connection con = JDBCUtil.getConnection();
			//b2:Create Statement
			Statement st = con.createStatement();
			//b3:Create sql
			String sql = "SELECT * FROM nhasach.sach "+
						"WHERE " + condititon + ";";
			//b4:Execute sql
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt("id");
				String hoVaTen = rs.getString("hoVaTen");
				Date ngaySinh = rs.getDate("ngaySinh");
				String diaChi = rs.getString("diaChi");
				
			KhachHang khachHang = new KhachHang(id, hoVaTen, ngaySinh, diaChi);
			result.add(khachHang);
			}
			//b5:Interrupt MySQL
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
