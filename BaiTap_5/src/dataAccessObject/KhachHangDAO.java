package dataAccessObject;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil;
import model.KhachHang;

public class KhachHangDAO implements DAOInterface<KhachHang> {
	
	public static KhachHangDAO getInstance() {
		return new KhachHangDAO();
	}

	@Override
	public int insert(KhachHang t) {
		try {
			//B1: lien ket MySQL
			Connection con = JDBCUtil.getConnection();
			//B2: Tao doi tuong Statement
			Statement st = con.createStatement();
			//B3: Tao cau lenh
			String sql = "INSERT INTO nhasach.sach(id,hoVaTen,ngaySinh,diaChi)"+
						"VALUE(" + t.getId()+",'"+t.getHoVaTen()+"',"+t.getNgaySinh()+",'"+t.getDiaChi()+")";
			st.executeUpdate(sql);
			//B4: Dong lien ket
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
			//B1: Tao lien ket MySQL
			Connection con = JDBCUtil.getConnection();
			//B2: Tao doi tuong Statement
			Statement st = con.createStatement();
			//B3: Tạo câu lenh
			String sql = "UPDATE nhasach.khachhang"+
						"SET hoVaTen=('"+t.getHoVaTen()+
						"',"+t.getNgaySinh()+
						",'"+t.getDiaChi()+"'"+
						"WHERE id="+t.getId();
						
			st.executeUpdate(sql);
			//B4: Đong lien ket
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
			//B1: Tao lien ket MySQL
			Connection con = JDBCUtil.getConnection();
			//B2: Tao doi tuong Statement
			Statement st = con.createStatement();
			//B3: Tao cau lenh
			String sql = "DELETE nhasach.khachhang"+
						"WHERE id=" + t.getId();
			st.executeUpdate(sql);
			//B4: Dong lien ket
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public ArrayList<KhachHang> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public KhachHang selectById(KhachHang t) {
		//  
		return null;
	}

	@Override
	public ArrayList<KhachHang> selectByCondition(String condititon) {
		// TODO Auto-generated method stub
		return null;
	}

}
