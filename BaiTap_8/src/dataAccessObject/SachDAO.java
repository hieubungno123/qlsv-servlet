package dataAccessObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.JDBCUtil;
import model.Sach;

public class SachDAO implements DAOInterface<Sach>{
	
	public static SachDAO getInstance() {
		return new SachDAO();
	}

	@Override
	public int insert(Sach t) {
		int ketQua=0;
		
		try {
			//Bước 1: Tao kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();
			
			//Bước 2:Thực thi câu lệnh SQL
			String sql = "INSERT INTO nhasach.sach(id,tenSach,giaBan,namXuatBan)" +
						"VALUES (?,?,?,?)";
			
			//Bước 3: Tạo ra đối tượng statement
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1,t.getId());
			st.setString(2, t.getTenSach());
			st.setString(3, t.getGiaBan());
			st.setInt(4, t.getNamXuatBan());
			
			st.executeUpdate();
			
			//Bước 4
			System.out.println("Bạn đã thực thi: " + sql);
			System.out.println("Có "+ketQua+"dòng bị thay đổi");
			
			//Bước 5:
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return ketQua;
	}

	@Override
	public int update(Sach t) {
		try {
			//Bước 1: Tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();
			
			//Bước 2:Thực thi câu lệnh
			String sql = " UPDATE nhasach.sach "+
							" SET "+
							" tenSach=? "+
							" ,giaBan=? " +
							" ,namXuatBan=? "+
							" WHERE id=? ";
			
			//Bước 2:Tạo ra đối tượng statement
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, t.getTenSach());
			st.setString(2, t.getGiaBan());
			st.setInt(3, t.getNamXuatBan());
			st.setString(4, t.getId());
			st.executeUpdate();
			
			//Buoc 5
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	}
		return 0;
	}
		
	@Override
	public int delete(Sach t) {
		try {
			//Bước 1: Tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();
			
			//Bước 3:Thực thi câu lệnh
			String sql = "DELETE FROM nhasach.sach"+
							"WHERE id=?";
			
			//Bước 2:Tạo ra đối tượng statement
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, t.getId());
			int ketQua = st.executeUpdate(sql);
			
			//Bước 4
			System.out.println("Bạn đã thực thi: " + sql);
			System.out.println("Có "+ketQua+"dòng bị thay đổi");
			
			//Buoc 5
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	}
		return 0;
	}

	@Override
	public ArrayList<Sach> selectAll() {
		ArrayList ketQua = new ArrayList();
		try {
			//B1: Lien ket SQL
			Connection con = JDBCUtil.getConnection();
			//B3: Tao cau lenh sql
			String sql = "SELECT * FROM nhasach.sach";
			//B2: Tao doi tuong Statement
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs= st.executeQuery();
			//B4: 
			while(rs.next()) {
				String id = rs.getString("id");
				String tenSach = rs.getString("tenSach");
				String giaBan = rs.getString("giaBan");
				int namXuatBan = rs.getInt("namXuatBan");
				
				Sach sach = new Sach(id, tenSach, giaBan, namXuatBan);
				ketQua.add(sach);
			}
			
			//B5
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return ketQua;
	}

	@Override
	public Sach selectById(Sach t) {
		Sach ketQua = null;
		try {
			//B1: Tao ket noi CSDL
			Connection con = JDBCUtil.getConnection();
			
			//B3
			String sql = "SELECT * FROM nhasach.sach WHERE id=?";
			
			//B2: Taoj ra cau lenh Statement
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString("id");
				String tenSach = rs.getString("tenSach");
				String giaBan = rs.getString("giaBan");
				int namXuatBan = rs.getInt("namXuatBan");
			
				ketQua = new Sach(id, tenSach, giaBan, namXuatBan);
			}
			
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ketQua;
	}

	@Override
	public ArrayList<Sach> selectByCondition(String condititon) {
		ArrayList<Sach> ketQua = new ArrayList<Sach>();
		try {
			//B1: Lien ket MySQL
			Connection con = JDBCUtil.getConnection();
			//B3: Tao cau lenh
			String sql = "SELECT * FROM nhasach.sach WHERE "+ condititon;
			//B2: Tao doi tuong Statement
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				String id = rs.getString("id");
				String tenSach = rs.getString("tenSach");
				String giaBan = rs.getString("giaBan");
				int namXuatBan = rs.getInt("namXuatBan");
				
				Sach sach = new Sach(id, tenSach, giaBan, namXuatBan);
				ketQua.add(sach);
			}
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketQua;
	}

}
