package dataAccessObject;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Prepare;
import com.mysql.cj.xdevapi.Result;

import database.JDBCUtil;
import model.KhachHang;

public class KhachHangDAO implements DAOInterface<KhachHang> {
	
	public static KhachHangDAO getInstance() {
		return new KhachHangDAO();
	}
	
	@Override
	public int insert(KhachHang t) {
		try {
			//b1: Tạo lien ket mysql
			Connection con = JDBCUtil.getConnection();
						//b3: Tạo câu lệnh 
			String sql = "INSERT INTO nhasach.khachhang (hoVaTen,ngaySinh,diaChi) "+
						"VALUES (?,?,?)";
			//b2: Tao cau lệnh statement
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, t.getHoVaTen());
			st.setDate(2, t.getNgaySinh());
			st.setString(3, t.getDiaChi());
			//b4: Thực thi câu lệnh sql
			st.executeUpdate();
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
			
			//b3: Create sql
				String sql = " UPDATE nhasach.sach "+
						" SET "+
						" hoVaTen=? "+ 
						" ngaySinh=? "+
						" diaChi=? "+
						" WHERE id=? ";
			//b2: Create statement
				PreparedStatement st = con.prepareStatement(sql);
				st.setString(1, t.getHoVaTen());
				st.setDate(2, t.getNgaySinh());
				st.setString(3,	t.getDiaChi());
				st.setInt(4,t.getId());
			//b4: Execute sql
				st.executeUpdate();
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
			
			//b3:Create sql
			String sql = "DELETE FROM nhaach.sach WHERE id=?"; 
			//b2:Create Statement
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, t.getId());
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
			//b3:Create sql
			String sql = "SELECT * FROM nhasach.sach";
			//b2:Create Steament
			PreparedStatement st = con.prepareStatement(sql);
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
			
			//b3:Create sql
			String sql = "SELECT * FROM nhasach.sach "+
						"WHERE id=?";
			//b2:Create Statement
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, t.getId());
			//b4:Execute sql
			ResultSet rs = st.executeQuery();
			
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
			
			//b3:Create sql
			String sql = "SELECT * FROM nhasach.sach "+
						"WHERE " + condititon + ";";
			//b2:Create Statement
			PreparedStatement st = con.prepareStatement(sql);
			//b4:Execute sql
			ResultSet rs = st.executeQuery();
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
